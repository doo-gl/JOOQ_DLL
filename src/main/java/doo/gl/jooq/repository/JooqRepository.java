package doo.gl.jooq.repository;

import org.jooq.CommonTableExpression;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Query;
import org.jooq.Record1;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import doo.gl.jooq.model.Money;
import doo.gl.jooq.model.TransactionDTO;
import doo.gl.jooq.model.User;
import doo.gl.jooq.model.UserDTO;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.firstValue;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.selectDistinct;
import static org.jooq.impl.DSL.sum;
import static org.jooq.impl.DSL.trueCondition;

import static doo.gl.gen.Tables.APP_USER;
import static doo.gl.gen.Tables.TRANSACTION;
import static doo.gl.gen.Tables.USER_LIMIT;
import static doo.gl.gen.Tables.USER_METADATA;

@Repository
public class JooqRepository {

    @Inject
    private DSLContext dslContext;

    @Inject
    private EntityManager entityManager;

    public List<UserDTO> getUser() {
        return dslContext
            .select(field("id"), field("username"))
            .from(name("app_user"))
            .fetch()
            .into(UserDTO.class);
    }

    public List<UserDTO> getUsers() {
        return jpaQuery(
            selectDistinct(
                Stream.of(
                    APP_USER.fields(),
                    USER_LIMIT.fields(),
                    USER_METADATA.fields()
                )
                .flatMap(Stream::of)
                .collect(Collectors.toList())
            )
            .from(APP_USER)
            .leftJoin(USER_LIMIT).on(APP_USER.ID.eq(USER_LIMIT.USER_ID))
            .leftJoin(USER_METADATA).on(APP_USER.ID.eq(USER_LIMIT.USER_ID)),
            User.class
        )
            .stream()
            .map(UserDTO::map)
            .collect(Collectors.toList());
    }

    private <T> List<T> jpaQuery(Query query, Class<T> type) {

        javax.persistence.Query jpaQuery = entityManager.createNativeQuery(query.getSQL(), type);

        List<Object> bindValues = query.getBindValues();
        for(int index = 0; index < bindValues.size(); index++) {

            jpaQuery.setParameter(index + 1, bindValues.get(index));

        }

        List result = jpaQuery.getResultList();

        return result;
    }



    public List<TransactionDTO> getTransactions() {
        return dslContext
            .select(
                TRANSACTION.fields()
            )
            .from(TRANSACTION)
            .fetchInto(TransactionDTO.class);
    }

    private List<Money> getFilteredTotalByCurrency(Condition... conditions) {
        return dslContext
            .select(
                TRANSACTION.CURRENCY_CODE,
                sum(TRANSACTION.AMOUNT).as("amount")
            )
            .from(TRANSACTION)
            .where(conditions)
            .groupBy(TRANSACTION.CURRENCY_CODE)
            .fetchInto(Money.class);
    }

    public List<Money> getTotalByCurrency() {
        return getFilteredTotalByCurrency();
    }

    public List<Money> getFilteredTotalByCurrency(String state) {
        return getFilteredTotalByCurrency(
            TRANSACTION.STATE.eq(state)
        );
    }

    public List<Money> getCumulativeSum(String state) {
        return dslContext
            .select(
                TRANSACTION.CURRENCY_CODE,
                sum(TRANSACTION.AMOUNT).over()
                    .partitionBy(TRANSACTION.CURRENCY_CODE)
                    .orderBy(TRANSACTION.CREATION_DATE)
                    .as("amount")
            )
            .from(TRANSACTION)
            .where(state == null ? trueCondition() : TRANSACTION.STATE.eq(state))
            .fetchInto(Money.class);
    }

    public List<TransactionDTO> firstTransactions() {

        CommonTableExpression<Record1<String>> firstTransaction =
            name("firstTransaction").fields("firstId").as(
                selectDistinct(
                    firstValue(TRANSACTION.ID).over()
                        .partitionBy(TRANSACTION.USER_ID)
                        .orderBy(TRANSACTION.CREATION_DATE)
                )
                    .from(TRANSACTION)
            );

        return dslContext
            .with(firstTransaction)
            .select(
                TRANSACTION.fields()
            )
            .from(TRANSACTION)
            .innerJoin(name("firstTransaction")).on(TRANSACTION.ID.eq(firstTransaction.field("firstId", String.class)))
            .fetchInto(TransactionDTO.class);
    }
}

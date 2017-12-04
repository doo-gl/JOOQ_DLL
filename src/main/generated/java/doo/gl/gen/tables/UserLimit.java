/**
 * This class is generated by jOOQ
 */
package doo.gl.gen.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserLimit extends org.jooq.impl.TableImpl<doo.gl.gen.tables.records.UserLimitRecord> {

	private static final long serialVersionUID = -1420981474;

	/**
	 * The singleton instance of <code>public.user_limit</code>
	 */
	public static final doo.gl.gen.tables.UserLimit USER_LIMIT = new doo.gl.gen.tables.UserLimit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<doo.gl.gen.tables.records.UserLimitRecord> getRecordType() {
		return doo.gl.gen.tables.records.UserLimitRecord.class;
	}

	/**
	 * The column <code>public.user_limit.id</code>.
	 */
	public final org.jooq.TableField<doo.gl.gen.tables.records.UserLimitRecord, java.lang.String> ID = createField("id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.user_limit.user_id</code>.
	 */
	public final org.jooq.TableField<doo.gl.gen.tables.records.UserLimitRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.user_limit.name</code>.
	 */
	public final org.jooq.TableField<doo.gl.gen.tables.records.UserLimitRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.user_limit.value</code>.
	 */
	public final org.jooq.TableField<doo.gl.gen.tables.records.UserLimitRecord, java.lang.Integer> VALUE = createField("value", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>public.user_limit</code> table reference
	 */
	public UserLimit() {
		this("user_limit", null);
	}

	/**
	 * Create an aliased <code>public.user_limit</code> table reference
	 */
	public UserLimit(java.lang.String alias) {
		this(alias, doo.gl.gen.tables.UserLimit.USER_LIMIT);
	}

	private UserLimit(java.lang.String alias, org.jooq.Table<doo.gl.gen.tables.records.UserLimitRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserLimit(java.lang.String alias, org.jooq.Table<doo.gl.gen.tables.records.UserLimitRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, doo.gl.gen.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<doo.gl.gen.tables.records.UserLimitRecord> getPrimaryKey() {
		return doo.gl.gen.Keys.USER_LIMIT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<doo.gl.gen.tables.records.UserLimitRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<doo.gl.gen.tables.records.UserLimitRecord>>asList(doo.gl.gen.Keys.USER_LIMIT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public doo.gl.gen.tables.UserLimit as(java.lang.String alias) {
		return new doo.gl.gen.tables.UserLimit(alias, this);
	}

	/**
	 * Rename this table
	 */
	public doo.gl.gen.tables.UserLimit rename(java.lang.String name) {
		return new doo.gl.gen.tables.UserLimit(name, null);
	}
}
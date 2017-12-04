/**
 * This class is generated by jOOQ
 */
package doo.gl.gen.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionRecord extends org.jooq.impl.UpdatableRecordImpl<doo.gl.gen.tables.records.TransactionRecord> implements org.jooq.Record7<java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 154594463;

	/**
	 * Setter for <code>public.transaction.id</code>.
	 */
	public TransactionRecord setId(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.transaction.id</code>.
	 */
	public java.lang.String getId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.transaction.creation_date</code>.
	 */
	public TransactionRecord setCreationDate(java.sql.Timestamp value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.transaction.creation_date</code>.
	 */
	public java.sql.Timestamp getCreationDate() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>public.transaction.user_id</code>.
	 */
	public TransactionRecord setUserId(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.transaction.user_id</code>.
	 */
	public java.lang.String getUserId() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.transaction.currency_code</code>.
	 */
	public TransactionRecord setCurrencyCode(java.lang.String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.transaction.currency_code</code>.
	 */
	public java.lang.String getCurrencyCode() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.transaction.amount</code>.
	 */
	public TransactionRecord setAmount(java.lang.Long value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.transaction.amount</code>.
	 */
	public java.lang.Long getAmount() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>public.transaction.type</code>.
	 */
	public TransactionRecord setType(java.lang.String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.transaction.type</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.transaction.state</code>.
	 */
	public TransactionRecord setState(java.lang.String value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.transaction.state</code>.
	 */
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return doo.gl.gen.tables.Transaction.TRANSACTION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return doo.gl.gen.tables.Transaction.TRANSACTION.CREATION_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return doo.gl.gen.tables.Transaction.TRANSACTION.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return doo.gl.gen.tables.Transaction.TRANSACTION.CURRENCY_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return doo.gl.gen.tables.Transaction.TRANSACTION.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return doo.gl.gen.tables.Transaction.TRANSACTION.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return doo.gl.gen.tables.Transaction.TRANSACTION.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCurrencyCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value1(java.lang.String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value2(java.sql.Timestamp value) {
		setCreationDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value3(java.lang.String value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value4(java.lang.String value) {
		setCurrencyCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value5(java.lang.Long value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value6(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value7(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord values(java.lang.String value1, java.sql.Timestamp value2, java.lang.String value3, java.lang.String value4, java.lang.Long value5, java.lang.String value6, java.lang.String value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TransactionRecord
	 */
	public TransactionRecord() {
		super(doo.gl.gen.tables.Transaction.TRANSACTION);
	}

	/**
	 * Create a detached, initialised TransactionRecord
	 */
	public TransactionRecord(java.lang.String id, java.sql.Timestamp creationDate, java.lang.String userId, java.lang.String currencyCode, java.lang.Long amount, java.lang.String type, java.lang.String state) {
		super(doo.gl.gen.tables.Transaction.TRANSACTION);

		setValue(0, id);
		setValue(1, creationDate);
		setValue(2, userId);
		setValue(3, currencyCode);
		setValue(4, amount);
		setValue(5, type);
		setValue(6, state);
	}
}

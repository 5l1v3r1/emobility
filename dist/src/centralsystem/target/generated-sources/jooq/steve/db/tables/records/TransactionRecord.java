/**
 * This class is generated by jOOQ
 */
package jooq.steve.db.tables.records;


import javax.annotation.Generated;

import jooq.steve.db.tables.Transaction;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionRecord extends UpdatableRecordImpl<TransactionRecord> implements Record7<Integer, Integer, String, DateTime, String, DateTime, String> {

	private static final long serialVersionUID = -1616693254;

	/**
	 * Setter for <code>stevedb.transaction.transaction_pk</code>.
	 */
	public void setTransactionPk(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>stevedb.transaction.transaction_pk</code>.
	 */
	public Integer getTransactionPk() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>stevedb.transaction.connector_pk</code>.
	 */
	public void setConnectorPk(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>stevedb.transaction.connector_pk</code>.
	 */
	public Integer getConnectorPk() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>stevedb.transaction.idTag</code>.
	 */
	public void setIdtag(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>stevedb.transaction.idTag</code>.
	 */
	public String getIdtag() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>stevedb.transaction.startTimestamp</code>.
	 */
	public void setStarttimestamp(DateTime value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>stevedb.transaction.startTimestamp</code>.
	 */
	public DateTime getStarttimestamp() {
		return (DateTime) getValue(3);
	}

	/**
	 * Setter for <code>stevedb.transaction.startValue</code>.
	 */
	public void setStartvalue(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>stevedb.transaction.startValue</code>.
	 */
	public String getStartvalue() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>stevedb.transaction.stopTimestamp</code>.
	 */
	public void setStoptimestamp(DateTime value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>stevedb.transaction.stopTimestamp</code>.
	 */
	public DateTime getStoptimestamp() {
		return (DateTime) getValue(5);
	}

	/**
	 * Setter for <code>stevedb.transaction.stopValue</code>.
	 */
	public void setStopvalue(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>stevedb.transaction.stopValue</code>.
	 */
	public String getStopvalue() {
		return (String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Integer, String, DateTime, String, DateTime, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Integer, String, DateTime, String, DateTime, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Transaction.TRANSACTION.TRANSACTION_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Transaction.TRANSACTION.CONNECTOR_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Transaction.TRANSACTION.IDTAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<DateTime> field4() {
		return Transaction.TRANSACTION.STARTTIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Transaction.TRANSACTION.STARTVALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<DateTime> field6() {
		return Transaction.TRANSACTION.STOPTIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Transaction.TRANSACTION.STOPVALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getTransactionPk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getConnectorPk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIdtag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DateTime value4() {
		return getStarttimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getStartvalue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DateTime value6() {
		return getStoptimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getStopvalue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value1(Integer value) {
		setTransactionPk(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value2(Integer value) {
		setConnectorPk(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value3(String value) {
		setIdtag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value4(DateTime value) {
		setStarttimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value5(String value) {
		setStartvalue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value6(DateTime value) {
		setStoptimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord value7(String value) {
		setStopvalue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TransactionRecord values(Integer value1, Integer value2, String value3, DateTime value4, String value5, DateTime value6, String value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TransactionRecord
	 */
	public TransactionRecord() {
		super(Transaction.TRANSACTION);
	}

	/**
	 * Create a detached, initialised TransactionRecord
	 */
	public TransactionRecord(Integer transactionPk, Integer connectorPk, String idtag, DateTime starttimestamp, String startvalue, DateTime stoptimestamp, String stopvalue) {
		super(Transaction.TRANSACTION);

		setValue(0, transactionPk);
		setValue(1, connectorPk);
		setValue(2, idtag);
		setValue(3, starttimestamp);
		setValue(4, startvalue);
		setValue(5, stoptimestamp);
		setValue(6, stopvalue);
	}
}
/**
 * @project AirportSimulator
 * @package airportSimulator.model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.0
 */
package airportSimulator.model;

import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelEvent.
 * @author Charles Joshua
 * @version 3.0
 */
public class ModelEvent extends ActionEvent {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5013553277600267917L;

	/** The amt. */
	private int amt;

	/** The id. */
	private int id;

	/** The msg. */
	String msg;

	/** The id. */
	private Object obj;

	/**
	 * Instantiates a new model event.
	 * 
	 * @param obj
	 *            the obj
	 * @param id
	 *            the id
	 * @param msg
	 *            the msg
	 */
	public ModelEvent(Object obj, int id, String msg) {
		super(obj, id, msg);
		this.obj = obj;
		this.id = id;
		this.msg = msg;
		this.amt = 0;
	}

	/**
	 * Instantiates a new model event.
	 * 
	 * @param obj
	 *            the obj
	 * @param id
	 *            the id
	 * @param msg
	 *            the msg
	 * @param amt
	 *            the amt
	 */
	public ModelEvent(Object obj, int id, String msg, int amt) {
		super(obj, id, msg, amt);
		this.obj = obj;
		this.id = id;
		this.msg = msg;
		this.amt = amt;
	}

	/**
	 * Instantiates a new model event.
	 * 
	 * @param arg0
	 *            the arg0
	 * @param arg1
	 *            the arg1
	 * @param arg2
	 *            the arg2
	 * @param arg3
	 *            the arg3
	 * @param arg4
	 *            the arg4
	 */
	public ModelEvent(Object arg0, int arg1, String arg2, long arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	/**
	 * Gets the amount.
	 * 
	 * @return the amount
	 */
	public int amount() {
		return amt;
	}

	/**
	 * Id.
	 * 
	 * @return the int
	 */
	public int id() {
		return id;
	}

	/**
	 * Message.
	 * 
	 * @return the string
	 */
	public String message() {
		return msg;
	}

	/**
	 * Object.
	 * 
	 * @return the object
	 */
	public Object object() {
		return obj;
	}
}

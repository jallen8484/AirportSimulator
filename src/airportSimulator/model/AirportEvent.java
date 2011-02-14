/**
 * @project AirportSimulator
 * @package AirportSimulator.Model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.0
 */
package AirportSimulator.Model;

// TODO: Auto-generated Javadoc
/**
 * The Class AirportEvent.
 */
public class AirportEvent extends ModelEvent {

	/**
	 * The Enum Event.
	 */
	public enum Event {

		/** The ARRIVING. */
		ARRIVING("Arriving"),

		/** The DEPARTING. */
		DEPARTING("Departing"),

		/** The GATE. */
		GATE("Gate"),

		/** The HOLDING. */
		HOLDING("Holding"),

		/** The TRANSIT. */
		TRANSIT("Transit");

		/**
		 * Gets the event.
		 * 
		 * @param s
		 *            the s
		 * @return the event
		 */
		static Event getEvent(String s) {
			return Event.valueOf(s);
		}

		/** The msg. */
		String msg;

		/**
		 * Instantiates a new event.
		 * 
		 * @param s
		 *            the s
		 */
		Event(String s) {
			this.msg = s;
		}

		/**
		 * Gets the message.
		 * 
		 * @return the message
		 */
		public String getMessage() {
			return msg;
		}

	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7116952084895363025L;

	/** The ap. */
	Airplane ap;

	/** The msg. */
	String msg;

	/**
	 * Instantiates a new airport event.
	 * 
	 * @param ap
	 *            the ap
	 * @param msg
	 *            the msg
	 */
	public AirportEvent(Object ap, String msg) {
		super(ap, ((Airplane) ap).getId(), msg);
		// notifyChanged(((Airplane) ap).id(), Event.getEvent(msg));
	}

	/**
	 * Gets the msg.
	 * 
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * Gets the plane.
	 * 
	 * @return the ap
	 */
	public Airplane getPlane() {
		return ap;
	}

	/**
	 * Sets the msg.
	 * 
	 * @param msg
	 *            the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * Sets the plane.
	 * 
	 * @param ap
	 *            the ap to set
	 */
	public void setPlane(Airplane ap) {
		this.ap = ap;
	}
}

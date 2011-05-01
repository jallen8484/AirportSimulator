/**
 * @project AirportSimulator
 * @package airport.model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 5.0
 */
package AirportSimulator.Model;

// TODO: Auto-generated Javadoc
/**
 * The Class AirportEvent.
  * @author Jeremy Allen
 * @version 5.0
*/
public class AirportEvent extends ModelEvent {

	public int eventtype;		// 0 - airplane contacting tower to enter landing pattern
								// 1 - 
								// 2 - 



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

	/** The airplane which created the event. */
	public Airplane ap;// a reference to the airplane this event is associated with if applicable


	/** The msg. */
	String msg;

	/**
	 * Instantiates a new airport event.
	 * 
	 * @param ap
	 *            the ap
	 * @param e 
	 * @param msg
	 *            the msg
	 */
	public AirportEvent(Object ap, int e, String msg) {
		super(ap, e, msg);
		// notifyChanged(((Airplane) ap).id(), Event.getEvent(msg));
		this.ap = (Airplane) ap;
		this.eventtype = e;
		this.msg = msg;
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

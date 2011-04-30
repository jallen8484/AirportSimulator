/**
 * @project AirportSimulator
 * @package AirportSimulator.Model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 5.0
 */
package AirportSimulator.Model;

// TODO: Auto-generated Javadoc
/**
 * The Class AirplaneState.
 * @author Jeremy Allen
 * @version 5.0
 */
public class AirplaneState extends VehicleState {

	/** The Constant ARRIVING. */
	public final static AirplaneState ARRIVING = new AirplaneState("Arriving",
			Category.MOVE);

	/** The Constant DEPARTING. */
	public final static AirplaneState DEPARTING = new AirplaneState(
			"Departing", Category.MOVE);

	/** The Constant ENTERINGAIRSPACE. */
	public final static AirplaneState ENTERINGAIRSPACE = new AirplaneState(
			"Entering Airspace", Category.CREATE);

	/** The Constant ENTERINGGATE. */
	public final static AirplaneState ENTERINGGATE = new AirplaneState(
			"Entering Gate", Category.MOVE);

	/** The Constant ENTERINGHANGAR. */
	public final static AirplaneState ENTERINGHANGAR = new AirplaneState(
			"Entering Hangar", Category.MOVE);

	/** The Constant ENTERINGRUNWAY. */
	public final static AirplaneState ENTERINGRUNWAY = new AirplaneState(
			"Entering Runway", Category.MOVE);

	/** The Constant LANDING. */
	public final static AirplaneState LANDING = new AirplaneState("Landing",
			Category.MOVE);

	/** The Constant LEAVINGAIRSPACE. */
	public final static AirplaneState LEAVINGAIRSPACE = new AirplaneState(
			"Leaving Airspace", Category.KILL);

	/** The Constant LEAVINGGATE. */
	public final static AirplaneState LEAVINGGATE = new AirplaneState(
			"Leaving Gate", Category.MOVE);

	/** The Constant LEAVINGHANGAR. */
	public final static AirplaneState LEAVINGHANGAR = new AirplaneState(
			"Leaving Hangar", Category.MOVE);

	/** The Constant LEAVINGRUNWAY. */
	public final static AirplaneState LEAVINGRUNWAY = new AirplaneState(
			"Leaving Runway", Category.MOVE);

	/** The Constant LOADINGGATE. */
	public final static AirplaneState LOADINGGATE = new AirplaneState(
			"Loading at Gate", Category.WAIT);

	/** The Constant REFUELINHANGAR. */
	public final static AirplaneState REFUELINHANGAR = new AirplaneState(
			"Refueling in Hangar", Category.WAIT);

	/** The Constant REQUESTINGTAXI. */
	public final static AirplaneState REQUESTINGTAXI = new AirplaneState(
			"Requesting Taxi", Category.WAIT);

	/** The Constant TAKEOFF. */
	public final static AirplaneState TAKEOFF = new AirplaneState("Take-Off",
			Category.MOVE);

	/** The Constant TAXITOGATE. */
	public final static AirplaneState TAXITOGATE = new AirplaneState(
			"Taxiing to Gate", Category.MOVE);

	/** The Constant TAXITOHANGAR. */
	public final static AirplaneState TAXITOHANGAR = new AirplaneState(
			"Taxiing to Hangar", Category.MOVE);

	/** The Constant TAXITORUNWAY. */
	public final static AirplaneState TAXITORUNWAY = new AirplaneState(
			"Taxiing to Runway", Category.MOVE);

	/** The Constant UNLOADINGGATE. */
	public final static AirplaneState UNLOADINGGATE = new AirplaneState(
			"Unloading at Gate", Category.WAIT);

	/** The Constant WAITINHANGAR. */
	public final static AirplaneState WAITINHANGAR = new AirplaneState(
			"Garaged in Hangar", Category.WAIT);

	/**
	 * Instantiates a new airplane state.
	 * 
	 * @param s
	 *            the s
	 * @param c
	 *            the c
	 */
	AirplaneState(String s, Category c) {
		super(s, c, null);
	}

}
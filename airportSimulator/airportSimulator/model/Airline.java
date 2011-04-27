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

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Enum Airline.
  * @author Jeremy Allen
 * @version 3.0
*/
public enum Airline {

	/** The AAL. */
	AAL("AA", "American Airlines"),

	/** The COA. */
	COA("CO", "Continental Airlines"),

	/** The DAL. */
	DAL("DL", "Delta Air Lines"),

	/** The EGF. */
	EGF("MQ", "American Eagle Airlines"),

	/** The FTT. */
	FTT("F9", "Frontier Airlines"),

	/** The JBU. */
	JBU("B6", "JetBlue Airways"),

	/** The NAO. */
	NAO("NA", "North American Airlines"),

	/** The NWA. */
	NWA("NW", "Northwest Airlines"),

	/** The SWA. */
	SWA("WN", "Southwest Airlines"),

	/** The UAL. */
	UAL("UA", "United Airlines"),

	/** The USA. */
	USA("US", "US Airways"),

	/** The VRD. */
	VRD("VX", "Virgin America");

	/**
	 * Gets the airline.
	 * 
	 * @param code
	 *            the code
	 * @return the airline
	 */
	static Airline getAirline(String code) {

		Iterator<Airline> iter = Arrays.asList(Airline.values()).iterator();
		Airline al = null;
		while (iter.hasNext())
			al = iter.next();
		if (al.getCode().equals(code))
			return al;
		return null;
	}

	/** The code. */
	private String code;

	/** The name. */
	private String name;

	/** The registered. */
	LinkedList<Airplane> registered;

	/**
	 * Instantiates a new airline.
	 * 
	 * @param code
	 *            the code
	 * @param name
	 *            the name
	 */
	Airline(String code, String name) {
		this.code = code;
		this.name = name;
	}

	/**
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the register.
	 * 
	 * @return the register
	 */
	LinkedList<Airplane> getRegister() {
		return this.registered;
	}

	/**
	 * Register.
	 * 
	 * @param ap
	 *            the ap
	 */
	void register(Airplane ap) {
		this.registered.add(ap.getId(), ap);
	}
}

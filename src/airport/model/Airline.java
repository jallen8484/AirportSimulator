/**
 * @project AirportSimulator
 * @package airport.model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.1
 */
package airport.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Enum Airline.
  * @author Jeremy Allen
 * @version 3.1
*/
public enum Airline {

	/** American Airlines */
	AAL("AA", "American Airlines"),

	/** Continental Airlines */
	COA("CO", "Continental Airlines"),

	/** Delta Air Lines. */
	DAL("DL", "Delta Air Lines"),

	/** American Eagle */
	EGF("MQ", "American Eagle Airlines"),

	/** Frontier Airlines */
	FTT("F9", "Frontier Airlines"),

	/** JetBlue Airways */
	JBU("B6", "JetBlue Airways"),

	/** North American Airlines */
	NAO("NA", "North American Airlines"),

	/** Northwest Airlines */
	NWA("NW", "Northwest Airlines"),

	/** Southwest Airlines */
	SWA("WN", "Southwest Airlines"),

	/** United Airlines */
	UAL("UA", "United Airlines"),

	/** US Airways */
	USA("US", "US Airways"),

	/** Virgin America */
	VRD("VX", "Virgin America");

	/**
	 * Gets the airline by IATA code.
	 * 
	 * @param code
	 *            the IATA code
	 * @return the airline that matches the IATA code
	 * 	if no match was found null is returned
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

	/** The airline's IATA code. */
	private String code;

	/** The airline's common name. */
	private String name;

	/** The registered objects owned by the airline. */
	LinkedList<Airplane> airplanes;
	LinkedList<Hangar> hangars;
	LinkedList<Gate> gates;

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
	LinkedList<Airplane> getPlanes() {
		return this.airplanes;
	}
	LinkedList<Hangar> getHangars() {
		return this.hangars;
	}
	LinkedList<Gate> getGates() {
		return this.gates;
	}

	/**
	 * Register.
	 * 
	 * @param ap
	 *            the ap
	 */
	void register(Object obj) {
		if (obj instanceof Airplane)
			this.airplanes.add(((Airplane)obj).getId(), (Airplane) obj);
		if (obj instanceof Gate)
			this.gates.add((Gate) obj);
		if (obj instanceof Hangar)
			this.hangars.add((Hangar) obj);
	}
	
	void clearRegister() {
		this.airplanes.clear();
		this.gates.clear();
		this.hangars.clear();
	}

	public static Airline getRandom() {
		// TODO Auto-generated method stub
		return Airline.values()[new Random().nextInt()];
	}

	public Hangar getHangar() {
		// TODO Auto-generated method stub
		return this.hangars.get(new Random().nextInt()%hangars.size());
	}

	public Gate getGate() {
		// TODO Auto-generated method stub
		return this.gates.get(new Random().nextInt()%gates.size());
	}
}

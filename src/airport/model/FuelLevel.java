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

// TODO: Auto-generated Javadoc
/**
 * The Enum FuelLevel.
 * @author Jeremy Allen
 * @version 3.1
 */
public enum FuelLevel {


	/** The ERROR. */
	ERROR("Error", -1),
	/** The EMPTY. */
	EMPTY("Empty", 0),
	/** The DANGER. */
	DANGER("Dangerous", 10),

	/** The EMERGENCY. */
	EMERGENCY("Emergency", 25),

	/** The LOW. */
	LOW("Low", 30),

	/** The MEDIUM. */
	MEDIUM("Medium", 50),

	/** The HIGH. */
	HIGH("High", 75),

	/** The FULL. */
	FULL("Full", 95),

	/** The MAX. */
	MAX("Maximum", 100);


	/**
	 * Gets the level.
	 * 
	 * @param s
	 *            the s
	 * @return the level
	 */
	static FuelLevel getLevel(String s) {
		return FuelLevel.valueOf(s);
	}

	// Classify fuel level to a String
	/**
	 * Gets the level name.
	 * 
	 * @param amt
	 *            the amt
	 * @return the level name
	 */
	static String getLevelName(int amt) {
		return ((amt == 100) ? "Max"
				: (amt > 95) ? "Full"
				: (amt > 70) ? "High"
				: (amt > 50) ? "Medium"
				: (amt > 25) ? "Low"
				: (amt > 10) ? "Emergency"
				: (amt > 0) ? "Dangerous"
				: (amt == 0) ? "Empty"
																										: "Error");
	}
	
	/**
	 * Gets the level.
	 *
	 * @param amt the amt
	 * @return the level
	 */
	static FuelLevel getLevel(int amt) {
		return ((amt == 100) ? MAX
				: (amt > 95) ? FULL
				: (amt > 70) ? HIGH
				: (amt > 50) ? MEDIUM
				: (amt > 25) ? LOW
				: (amt > 10) ? EMERGENCY
				: (amt > 0) ? DANGER
				: (amt == 0) ? EMPTY
				: ERROR);
	}

	/** The multiplier. */
	int multiplier;

	/** The name. */
	String name;

	/**
	 * Instantiates a new fuel level.
	 * 
	 * @param amt
	 *            the amt
	 */
	FuelLevel(int amt) {
		this.name = getLevelName(amt);
		this.multiplier = amt;
	}

	/**
	 * Instantiates a new fuel level.
	 * 
	 * @param s
	 *            the s
	 */
	FuelLevel(String s) {
		this.name = s;
		multiplier = FuelLevel.valueOf(s).multiplier;
	}

	/**
	 * Instantiates a new fuel level.
	 * 
	 * @param s
	 *            the s
	 * @param amt
	 *            the amt
	 */
	FuelLevel(String s, int amt) {
		this.name = s;
		this.multiplier = amt;
	}

	/**
	 * Gets the level.
	 * 
	 * @return the level
	 */
	FuelLevel getLevel() {
		return this;
	}

	/**
	 * Multiplier.
	 * 
	 * @return the double
	 */
	public double multiplier() {
		return multiplier / 100.0;
	}
}
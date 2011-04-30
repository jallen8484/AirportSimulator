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

import java.util.Random;

/**
 * The Class Airplane.
 * @author Joshua Charles
 * @author Jeremy Allen
 * @version 5.0
 */
public class Airplane //extends AirportVehicle
{
	/** The aid. */
	public int aid;			// airplane id
	
	/** The rat. */
	public double rat;		// calculated raw arrival time
	
	/** The cat. */
	public int cat;			// calculated tick arrival time

	/** The state. */
	public int state;		// current plane state
							// transit = 0					enroute to or from airport
							// holding = 1					in landing pattern
							// arriving = 2					landing on runway
							// departing = 3				taking off on runway
							// taxiing = 4					in taxiway
							// gate = 5						in a gate

	/** The priority. */
	public int priority;	// randomly generated priority, but priority can change

	/** The fuel. */
	public int fuel;		// 0-100   25% is critical

	/** The type. */
	public int type;		// 0 - Derrick Airlines
							// 1 - Flowers Airlines
							// 2 - Nueces Airlines
							// 3 - Mitte Airlines

	/** The hpats. */
	public int hpats;		// holding pattern arrival time stamp
	
	/** The hpdts. */
	public int hpdts;		// holding pattern departure time stamp

	/** The arwats. */
	public int arwats;		// runway arrival time stamp
	
	/** The arwdts. */
	public int arwdts;		// runway departure time stamp

	/** The atwats. */
	public int atwats;		// taxiway arrival time stamp
	
	/** The atwdts. */
	public int atwdts;		// taxiway departure time stamp

	/** The gats. */
	public int gats;		// gate arrival time stamp
	
	/** The gdts. */
	public int gdts;		// gate departure time stamp

	/** The drwats. */
	public int drwats;		// runway arrival time stamp
	
	/** The drwdts. */
	public int drwdts;		// runway departure time stamp

	/** The dtwats. */
	public int dtwats;		// taxiway arrival time stamp
	
	/** The dtwdts. */
	public int dtwdts;		// taxiway departure time stamp

	
	
	
	
	
//***********************************************	
// below created and added by Jeremy Allen
//***********************************************	
	
	/**
	 * Instantiates a new airplane.
	 * 
	 * @param i
	 *            the i
	 * @param al
	 *            the al
	 * @param f
	 *            the f
	 * @param st
	 *            the st
	 * @param ac
	 *            the ac
	 */
//	public Airplane(int i, Airline al, FuelTank f, AirplaneState st, AirplaneContainer ac)
//	{
//		super(i, al, f, st, ac);
//	}

//	static Airline al = Airline.getRandom();
	
//	public Airplane()
//	{
//		super(new Random().nextInt(), al, new FuelTank(new Random().nextDouble()%100), AirplaneState.WAITINHANGAR, al.getHangar());
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.AirportVehicle#run()
	 */
//	public void run(){}

	/**
	 * Gets the cat.
	 * 
	 * @return the cat
	 */
//	public int getCat() { return cat; }
	
//	public int getId() { return aid; }

	/**
	 * Refuel.
	 * 
	 * @param fl
	 *            the fl
	 */
//	public void refuel(FuelLevel fl) { tank.setLevel(fl); }
	

}

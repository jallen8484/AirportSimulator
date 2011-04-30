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

import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class Airplane.
 * @author Joshua Charles
 * @author Jeremy Allen
 * @version 3.1
 */
public class Airplane extends AirportVehicle {
	public int aid;			// airplane id
	public double rat;		// calculated raw arrival time
	public int cat;			// calculated tick arrival time

	public int state;		// current plane state
							// transit = 0					enroute to or from airport
							// holding = 1					in landing pattern
							// arriving = 2					landing on runway
							// departing = 3				taking off on runway
							// taxiing = 4					in taxiway
							// gate = 5						in a gate

	public int priority;	// randomly generated priority, but priority can change

	public int fuel;		// 0-100   25% is critical

	public int type;		// 0 - Derrick Airlines
							// 1 - Flowers Airlines
							// 2 - Nueces Airlines
							// 3 - Mitte Airlines

	public int hpats;		// holding pattern arrival time stamp
	public int hpdts;		// holding pattern departure time stamp

	public int arwats;		// runway arrival time stamp
	public int arwdts;		// runway departure time stamp

	public int atwats;		// taxiway arrival time stamp
	public int atwdts;		// taxiway departure time stamp

	public int gats;		// gate arrival time stamp
	public int gdts;		// gate departure time stamp

	public int drwats;		// runway arrival time stamp
	public int drwdts;		// runway departure time stamp

	public int dtwats;		// taxiway arrival time stamp
	public int dtwdts;		// taxiway departure time stamp

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
	public Airplane(int i, Airline al, FuelTank f, AirplaneState st,
			AirplaneContainer ac) {
		// TODO Auto-generated constructor stub
		super(i, al, f, st, ac);
	}

	static Airline al = Airline.getRandom();
	public Airplane() {
		super(new Random().nextInt(), al, new FuelTank(new Random().nextDouble()%100), AirplaneState.WAITINHANGAR, al.getHangar());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.AirportVehicle#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	/**
	 * Gets the cat.
	 * 
	 * @return the cat
	 */
	public int getCat() {
		// TODO Auto-generated method stub
		return cat;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return aid;
	}

	/**
	 * Refuel.
	 * 
	 * @param fl
	 *            the fl
	 */
	public void refuel(FuelLevel fl) {
		// TODO Auto-generated method stub
		tank.setLevel(fl);
	}

}

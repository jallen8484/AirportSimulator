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

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class AirportVehicle.
 * @author Jeremy Allen
 * @version 5.0
 */
public abstract class AirportVehicle implements Vehicle, Runnable {

	/** The holder. */
	private VehicleContainer holder;

	/** The id. */
	private int id;

	/** The owner. */
	private Airline owner;

	/** The state. */
	private VehicleState state;

	/** The fuel. */
	protected FuelTank tank;

	/**
	 * Instantiates a new airport vehicle.
	 * 
	 * @param id
	 *            the id
	 * @param al
	 *            the al
	 * @param ft
	 *            the ft
	 * @param st
	 *            the st
	 * @param holder
	 *            the holder
	 */
	public AirportVehicle(int id, Airline al, FuelTank ft, State st,
			LinkedList<Vehicle> holder) {
		super();
		this.state = (VehicleState) st;
		this.id = id;
		this.tank = ft;
		this.owner = al;
		this.holder = (VehicleContainer) holder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.Vehicle#getHolder()
	 */
	@Override
	public VehicleContainer getHolder() {
		return holder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.Vehicle#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.Vehicle#getOwner()
	 */
	@Override
	public Airline getOwner() {
		return owner;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.Vehicle#getState()
	 */
	@Override
	public State getState() {
		return state;
	}

	/**
	 * Gets the tank.
	 * 
	 * @return the tank
	 */
	@Override
	public FuelTank getTank() {
		return tank;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.Vehicle#setHolder(java.util.LinkedList)
	 */
	@Override
	public void setHolder(LinkedList<Vehicle> q) {
		this.holder = (VehicleContainer) q;

	}

	/**
	 * Sets the holder.
	 * 
	 * @param vc
	 *            the new holder
	 */
	public void setHolder(VehicleContainer vc) {
		this.holder = vc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.Vehicle#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Model.Vehicle#setOwner(AirportSimulator.Model.Airline)
	 */
	@Override
	public void setOwner(Airline al) {
		this.owner = al;
	}

	/**
	 * Sets the state.
	 * 
	 * @param st
	 *            the new state
	 */
	@Override
	public void setState(State st) {
		this.state = (VehicleState) st;
	}

	/**
	 * Sets the tank.
	 * 
	 * @param ft
	 *            the new tank
	 */
	@Override
	public void setTank(FuelTank ft) {
		this.tank = ft;
	}

}

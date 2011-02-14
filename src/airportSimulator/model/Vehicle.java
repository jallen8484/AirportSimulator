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

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Interface Vehicle.
 */
public interface Vehicle {

	/**
	 * Gets the holder.
	 * 
	 * @return the holder
	 */
	LinkedList<Vehicle> getHolder();

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	int getId();

	/**
	 * Gets the owner.
	 * 
	 * @return the owner
	 */
	Airline getOwner();

	/**
	 * Gets the state.
	 * 
	 * @return the state
	 */
	State getState();

	/**
	 * Gets the fuel.
	 * 
	 * @return the fuel
	 */
	FuelTank getTank();

	/**
	 * Sets the holder.
	 * 
	 * @param q
	 *            the new holder
	 */
	void setHolder(LinkedList<Vehicle> q);

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	void setId(int id);

	/**
	 * Sets the owner.
	 * 
	 * @param al
	 *            the new owner
	 */
	void setOwner(Airline al);

	/**
	 * Sets the state.
	 * 
	 * @param st
	 *            the new state
	 */
	void setState(State st);

	/**
	 * Sets the fuel.
	 * 
	 * @param ft
	 *            the new tank
	 */
	void setTank(FuelTank ft);

}

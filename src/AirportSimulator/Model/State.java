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

import AirportSimulator.Model.VehicleState.Category;

// TODO: Auto-generated Javadoc
/**
 * The Interface State.
 * @author Jeremy Allen
 * @version 5.0
 */
public interface State {

	/**
	 * Gets the category.
	 * 
	 * @return the category
	 */
	public Category getCategory();

	/**
	 * Gets the goal.
	 * 
	 * @return the current goal destination
	 */
	public LinkedList<Vehicle> getGoal();

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#getName()
	 */
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName();

	/**
	 * Gets the state.
	 * 
	 * @return the state
	 */
	public State getState();

	/**
	 * Sets the category.
	 * 
	 * @param c
	 *            the new category
	 */
	public void setCategory(Category c);

	/**
	 * Sets the goal.
	 * 
	 * @param goal
	 *            new goal destination to move the vehicle towards
	 */
	public void setGoal(LinkedList<Vehicle> goal);

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name);

	/**
	 * Sets the state.
	 * 
	 * @param st
	 *            the new state
	 */
	public void setState(State st);
}
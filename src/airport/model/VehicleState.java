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

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class VehicleState.
 * @author Jeremy Allen
 * @version 3.1
 */
public abstract class VehicleState implements State {

	/**
	 * The Enum Category.
	 */
	public enum Category {
		/** The CREATE. */
		CREATE,
		/** The KILL. */
		KILL,
		/** The MOVE. */
		MOVE,
		/** The WAIT. */
		WAIT;
	}

	/** The category. */
	private Category cat;

	/** The goal. */
	private VehicleContainer goal;
	/** The name. */
	private String name;

	/**
	 * Instantiates a new vehicle state.
	 * 
	 * @param s
	 *            the name of the state
	 * @param c
	 *            the category to which the state belongs
	 * @param g
	 *            the goal destination for the vehicle
	 */
	public VehicleState(String s, Category c, VehicleContainer g) {
		this.name = s;
		this.cat = c;
		this.goal = g;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#getCategory()
	 */
	@Override
	public Category getCategory() {
		return cat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#getGoal()
	 */
	@Override
	public VehicleContainer getGoal() {
		return goal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#getState()
	 */
	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Model.State#setCategory(AirportSimulator.Model.VehicleState
	 * .Category)
	 */
	/**
	 * Sets the category.
	 * 
	 * @param c
	 *            the new category
	 */
	@Override
	public void setCategory(Category c) {
		this.cat = c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#setGoal(java.util.LinkedList)
	 */
	@Override
	public void setGoal(LinkedList<Vehicle> goal) {
		// TODO Auto-generated method stub
		this.goal = (VehicleContainer)(LinkedList<Vehicle>) goal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Model.State#setGoal(AirportSimulator.Model.VehicleContainer
	 * )
	 */
	/**
	 * Sets the goal.
	 * 
	 * @param goal
	 *            the new goal
	 */
	public void setGoal(VehicleContainer goal) {
		this.goal = goal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Model.State#setState(AirportSimulator.Model.State)
	 */
	@Override
	public void setState(State st) {
		// TODO Auto-generated method stub
		this.setName(st.getName());
		this.setCategory(st.getCategory());
		this.setGoal(getGoal());
	}

}

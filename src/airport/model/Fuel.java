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
 * The Class Fuel.
 *
 * @author Jeremy Allen
 * @version 3.1
 */
public class Fuel {

	/** The amount. */
	Double amount;

	/**
	 * Instantiates a new fuel.
	 * 
	 * @param amt
	 *            the amt
	 */
	Fuel(double amt) {
		this.amount = amt;
	}

	/**
	 * Instantiates a new fuel.
	 * 
	 * @param ft
	 *            the ft
	 * @param fl
	 *            the fl
	 */
	Fuel(FuelTank ft, FuelLevel fl) {
		this.amount = fl.multiplier() * ft.getCapacity();
	}

	/**
	 * Adds the.
	 * 
	 * @param d
	 *            the d
	 * @return the fuel
	 */
	public Fuel add(double d) {
		this.incAmount(d);
		return this;
	}

	/**
	 * Dec amount.
	 * 
	 * @param amt
	 *            the amt
	 */
	void decAmount(Double amt) {
		this.amount -= amt;
	}

	/**
	 * Gets the amount.
	 * 
	 * @return the amount
	 */
	Double getAmount() {
		return amount;
	}

	/**
	 * Inc amount.
	 * 
	 * @param amt
	 *            the amt
	 */
	void incAmount(Double amt) {
		this.amount += amt;
	}

	/*
	 * public Fuel add(Fuel f) { this.incAmount(f.getAmount()); return this; }
	 * public Fuel sub(Fuel f) { this.decAmount(f.getAmount()); return this; }
	 */
	/**
	 * Checks if is empty.
	 * 
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.getAmount() == 0);
	}

	/**
	 * Sets the amount.
	 * 
	 * @param amt
	 *            the new amount
	 */
	void setAmount(Double amt) {
		this.amount = amt;
	}

	/**
	 * Sub.
	 * 
	 * @param d
	 *            the d
	 * @return the fuel
	 */
	public Fuel sub(double d) {
		this.decAmount(d);
		return this;
	}
}

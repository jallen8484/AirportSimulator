/**
 * @project AirportSimulator
 * @package airport.model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 5.0
 */
package AirportSimulator.Model;

// TODO: Auto-generated Javadoc
/**
 * The Class FuelTank.
 * @author Jeremy Allen
 * @version 5.0
 */
public class FuelTank {

	/**
	 * The Enum Size.
	 */
	public static class TankSize {

		/** The GIANT. */
		public static final TankSize GIANT = new TankSize(400);
		/** The LARGE. */
		public static final TankSize LARGE = new TankSize(200);
		/** The MEDIUM. */
		public static final TankSize MEDIUM = new TankSize(100);
		/** The RESERVE. */
		public static final TankSize RESERVE = new TankSize(1600);
		/** The SMALL. */
		public final static TankSize SMALL = new TankSize(50);

		/** The size. */
		private double size;

		/**
		 * Instantiates a new size.
		 * 
		 * @param d
		 *            the d
		 */
		TankSize(double d) {
			this.size = d;
		}

		/**
		 * Multi.
		 * @param m multiplier
		 * 
		 * @return the double
		 */
		public double multi(double m) {
			// TODO Auto-generated method stub
			return this.size * m;
		}

		/**
		 * Sets the size.
		 * 
		 * @param d
		 *            the new size
		 */
		public void setSize(double d) {
			this.size = d;
		}

		/**
		 * Size.
		 * 
		 * @return the double
		 */
		public double size() {
			return size;
		}
	}

	/** The capacity. */
	TankSize capacity;

	/** The fuel. */
	Fuel fuel;

	/**
	 * Instantiates a new fuel tank.
	 * 
	 * @param cap
	 *            the cap
	 */
	public FuelTank(double cap) {
		this.setCapacity(cap);
	}

	/**
	 * Instantiates a new fuel tank.
	 *
	 * @param ts the ts
	 */
	public FuelTank(TankSize ts) {
		this.setCapacity(ts.size());
	}

	/**
	 * Adds the.
	 * 
	 * @param f
	 *            the f
	 * @return the fuel
	 * @throws FuelTankException
	 *             the fuel tank exception
	 */
	public Fuel add(Fuel f) throws FuelTankException {
		Double spaceLeft = (this.getCapacity() - this.getAmount());
		if (f.getAmount() > spaceLeft)
			if (this.isFull())
				throw new FuelTankException("Tank full.");
			else {
				f.sub(spaceLeft);
				this.fuel.add(spaceLeft);
			}
		return this.fuel.add(f.getAmount());

	}

	/**
	 * Emergency.
	 * 
	 * @return true, if successful
	 */
	public boolean emergency() {
		return (isEmpty() || this.getLevel().equals(FuelLevel.EMERGENCY));
	}


	/**
	 * Fill.
	 * 
	 * @throws FuelTankException
	 *             the fuel tank exception
	 */
	public void fill() throws FuelTankException {
		this.add(new Fuel(getCapacity() - getAmount()));
	}

	/**
	 * Fill.
	 * 
	 * @param ft
	 *            the ft
	 * @throws FuelTankException
	 *             the fuel tank exception
	 */
	public void fill(FuelTank ft) throws FuelTankException {
		// this gets the added fuel from f
		// f's is decremented until this is full or max
		while (!this.isFull() && !ft.isEmpty()) {
			Fuel fuel = new Fuel(1);
			this.add(fuel);
			ft.sub(fuel);
		}
	}

	/**
	 * Gets the amount.
	 * 
	 * @return the amount
	 */
	Double getAmount() {
		return fuel.getAmount();
	}

	/**
	 * Gets the capacity.
	 * 
	 * @return the capacity
	 */
	Double getCapacity() {
		return capacity.size();
	}

	/**
	 * Gets the level.
	 * 
	 * @return the level
	 */
	FuelLevel getLevel() {
		return FuelLevel
				.getLevel((int) (fuel.getAmount() * 100 / getCapacity()));
	}

	/**
	 * Checks if is empty.
	 * 
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return (this.getLevel().equals(FuelLevel.EMPTY));
	}

	/**
	 * Checks if is full.
	 * 
	 * @return true, if is full
	 */
	public boolean isFull() {
		return (this.getLevel().equals(FuelLevel.FULL) || this.getLevel()
				.equals(FuelLevel.MAX));
	}

	/**
	 * Sets the amount.
	 *
	 * @param fl the new fuel
	 */
	void setFuel(Fuel fl) {
		this.fuel = fl;
	}

	/**
	 * Sets the capacity.
	 * 
	 * @param cap
	 *            the new capacity
	 */
	void setCapacity(double cap) {
		this.capacity = new TankSize(cap);
	}

	/**
	 * Sets the level.
	 * 
	 * @param fl
	 *            the new level
	 */
	void setLevel(FuelLevel fl) {
		setFuel(new Fuel(fl.multiplier() * this.getCapacity()));
	}

	/**
	 * Sets the level.
	 * 
	 * @param s
	 *            the new level
	 */
	void setLevel(String s) {
		setLevel(FuelLevel.getLevel(s));
	}

	/**
	 * Sub.
	 * 
	 * @param f
	 *            the f
	 * @return the fuel
	 */
	private Fuel sub(Fuel f) {
		// TODO Auto-generated method stub
		return f;
	}

}
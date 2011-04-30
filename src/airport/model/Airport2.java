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

import java.util.*;

import airport.model.FuelTank.TankSize;

// TODO: Auto-generated Javadoc
/**
 * The Class AirportModel.
 * @author Jeremy Allen
 * @version 3.1
 */
public class Airport2 extends AbstractModel {

	/**
	 * The Class AirportTowerThread.
	 */
	final class AirportTowerThread implements Runnable {

		/** The clocktick. */
		private long clocktick; // current clock tick

		/** The Requested state. */
		private State RequestedState; // state to switch to next

		/** The speedmultiplier. */
		private int speedmultiplier; // speedup multiplier set by slider control

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			// run until we stop the simulator
			while (RequestedState == State.RUNNING) {
				// is it time for the next event?
				if ((queueAirportEvent.peekFirst()).ap.cat == clocktick) {
					queueAirportEvent.removeFirst();
					System.out.println("airplane requeseted landing pattern at clocktick "
									+ clocktick);
				}

				// sleep for a while
				try {
					Thread.sleep(1000 / speedmultiplier);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// move to next clock tick
				clocktick++;
				System.out.println("clocktick " + clocktick);

				// have we paused the simulator?
				while (RequestedState == State.PAUSED) {
					// sleep for a second and check again
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				// has all events been exhausted?
				if ((queueAirportEvent.peekFirst()) == null) {
					RequestedState = State.STOPPED;
				}
			}

			if (RequestedState == State.STOPPED) {
				// need to clean up everything here
				airplanes.clear();

				// notify the view of state change
				ModelEvent me = new ModelEvent(this, 1, "");
				me.msg = State.STOPPED.getName();
				notifyChanged(me);
			}
		}

		/**
		 * Tsetup.
		 */
		public void tsetup() {
			clocktick = 1;
			RequestedState = State.STOPPED;
			speedmultiplier = 1;
		}

		/**
		 * Tspeed.
		 * 
		 * @param speed
		 *            the speed
		 */
		public void tspeed(int speed) {
			speedmultiplier = speed;
		}

		/**
		 * Tstate.
		 * 
		 * @param st
		 *            the reqstate
		 */
		public void tstate(State st) {
			RequestedState = st;
		}
	}


	/**	TODO: IMPLEMENT AIRSPACES, HOLDINGPATTERNS, RUNWAYS, TAXIWAYS, HANGARS, GATES as VehicleContainer(LinkedList<Vehicle>)
	* // All Vehicle Containers
	* //Airspaces create planes and wait for HoldingPattern
	* private Airspace entering, exiting;
	* //HoldingPatterns move planes up the queue between Airspaces and Runways
	* private HoldingPattern arrivals, departures;
	* //Runways require Clearance to move planes between air and ground VehicleContainers
	* // denies clearance to additional planes for a time during and after use
	* private Runways rwA, rwB;
	* //Taxiways moves planes between runways, gates, and hangars
	* private Taxiways tw1, tw2, tw3, tw4, tw5;
	* //Hangars accept planes garage and refuel all AirportVehicle depending on size of Vehicle and capacity of Hangar
	* private Hangars hgS1, hgS2, hgS3, hgM1, hgM2, hgM3, hgL1, hgL2, hgL3;
	* //Gates block planes while loading/unloading passengers/cargo
	* // limited refueling under FuelLevel.EMERGENCY
	* private Gates gt1A, gt2A, gt3A, gt1B, gt2B, gt3B, gt1C, gt2C, gt3C;
	*/

	/**
	 * The Enum State.
	 */
	public enum State {

		/** The PAUSED. */
		PAUSED("Paused"),

		/** The RUNNING. */
		RUNNING("Running"),

		/** The STOPPED. */
		STOPPED("Stopped");

		/**
		 * Gets the name.
		 * 
		 * @param s
		 *            the s
		 * @return the name
		 */
		static String getName(State s) {
			return s.name;
		}

		/**
		 * Gets the state.
		 * 
		 * @param s
		 *            the s
		 * @return the state
		 */
		static State getState(String s) {
			return State.valueOf(s);
		}

		/** The name. */
		String name;

		/**
		 * Instantiates a new state.
		 * 
		 * @param s
		 *            the s
		 */
		State(String s) {
			this.name = s;
		}

		/**
		 * Gets the name.
		 * 
		 * @return the name
		 */
		public String getName() {
			return this.name;
		}

		/**
		 * State.
		 * 
		 * @return the state
		 */
		State state() {
			return this;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			return getName();
		}

	}

	/** The airplanes. */
	private LinkedList<Airplane> airplanes = new LinkedList<Airplane>();

	/** The att. */
	private AirportTowerThread att = new AirportTowerThread();

	/** The queue airport event. */
	private LinkedList<AirportEvent> queueAirportEvent = new LinkedList<AirportEvent>();

	/** The queue landing pattern. */
	private LinkedList<Airplane> queueLandingPattern = new LinkedList<Airplane>();

	/**
	 * Instantiates a new airport model.
	 */
	public Airport2() {
	}

	/**
	 * Generate airplanes.
	 *
	 * @param size the size
	 * @param rate the rate
	 * @throws FuelTankException the fuel tank exception
	 */
	public void generate(int size, double rate) throws FuelTankException {
		// new random number generator
		Random rand = new Random();

		// list iterator
		ListIterator<Airplane> it = airplanes.listIterator();

		// create a specified number of airplanes
		for (int i = 1; i <= size; i++) {
			// generate random number 0 - 1
			// generate raw arrival time according to poisson process
			double rat = (-1 / rate) * (Math.log(1 - rand.nextDouble()));

			// if this is not an empty list
			if (!airplanes.isEmpty()) {
				// add this rat to previous airplanes rat
				rat = rat + (it.previous()).rat;
				it.next();
			}

			// convert rat into a simulator tick time
			int trat = (int) ((rat * 10) + 0.5);

			// create a new node and add it to the end of the list
			Airplane temp = new Airplane(i, Airline.AAL, new FuelTank(
					TankSize.LARGE), AirplaneState.ENTERINGAIRSPACE, null);
			temp.refuel(FuelLevel.FULL);
			temp.aid = i; // set airplane id
			temp.rat = rat; // set raw arrival time
			temp.cat = trat; // set tick arrival time
			temp.state = 0; // set state to transit
			it.add(temp); // add the airplane to the list
		}

		// debug - display generated airplane list
		printList();
	}

	/**
	 * Gets the queue landing pattern.
	 * 
	 * @return the queueLandingPattern
	 */
	public LinkedList<Airplane> getQueueLandingPattern() {
		return queueLandingPattern;
	}

	/**
	 * Pause simulator.
	 */
	public void pause() {
		// request the state change
		att.tstate(State.PAUSED);

		// notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.msg = State.PAUSED.getName();
		notifyChanged(me);
	}

	/**
	 * Prints the airplane list.
	 */
	public void printList() {
		// list iterator
		ListIterator<Airplane> it = airplanes.listIterator();

		// display nice header for data
		System.out.println("aid      rat               cat               ");
		System.out.println("---------------------------------------------");

		// work until the end of the list
		while (it.hasNext()) {
			// display airplane info
			Airplane temp = it.next();
			System.out.format("%-9d%-18.5f%-18d%n", temp.aid, temp.rat,
					temp.cat);
		}
	}

	/**
	 * Resume simulator.
	 */
	public void resume() {
		// request the state change
		att.tstate(State.RUNNING);

		// notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.msg = State.RUNNING.getName();
		notifyChanged(me);
	}

	/**
	 * Sets the queue landing pattern.
	 * 
	 * @param queueLandingPattern
	 *            the queueLandingPattern to set
	 */
	public void setQueueLandingPattern(LinkedList<Airplane> queueLandingPattern) {
		this.queueLandingPattern = queueLandingPattern;
	}

	/**
	 * Speed change simulator.
	 * 
	 * @param current
	 *            the current
	 */
	public void setSpeed(int current) {
		att.tspeed(current);
	}

	/**
	 * Start.
	 * 
	 * @param listsize
	 *            the listsize
	 * @param arrivalrate
	 *            the arrivalrate
	 */
	public void start(int listsize, double arrivalrate) {
		// create a new list of airplanes for this simulation
		try {
			generate(listsize, arrivalrate);
		} catch (FuelTankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1 plane every 5 minutes = 0.2 for
											// rate

		// generate airplane arrival events from airplane list
		// this is the time that each airplane will contact the tower
		// when it is close enough to the airport to enter the landing patern
		Iterator<Airplane> it = airplanes.iterator();
		while (it.hasNext()) {
			Airplane temp = it.next();
			if (temp.getTank().emergency()) queueAirportEvent.addFirst(new AirportEvent(temp, "New Emergency"));
			else queueAirportEvent.addLast(new AirportEvent(temp, "New Plane"));
		}

		// event queue should now hold all of the generated airplanes as arrival
		// events
		// display event queue for debug
		System.out.println("eve      aid      cat               ");
		System.out.println("---------------------------------------------");
		Iterator<AirportEvent> itt = queueAirportEvent.iterator();
		while (itt.hasNext()) {
			AirportEvent temp = itt.next();
			Airplane tempPlane = temp.getPlane();
			if (!(tempPlane==null))
				System.out.format("%s%-9d%-18d%n", temp.msg, tempPlane.aid, tempPlane.cat);
		}

		// need to start the tower thread

		// tower thread runs until all airplanes are departed

		// tower thread will check to see if a plane is arriving
		// this clock tick, and if so will generate airplane threads
		// airplane threads will communicate with tower their movements
		// through the airport

		// setup and start the thread
		att.tsetup();
		att.tstate(State.RUNNING);
		Thread t = new Thread(att);
		t.start();

		// notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.msg = State.RUNNING.getName();
		notifyChanged(me);
	}

	/**
	 * Stop simulator.
	 */
	public void stop() {
		// need to clean up everything here
		airplanes.clear();

		// request the state change
		att.tstate(State.STOPPED);

		// notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.msg = State.STOPPED.getName();
		notifyChanged(me);
	}
}

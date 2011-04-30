package airport.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Random;

public class Airport1 extends AbstractModel
{
	public static final int STATESTOPPED = 0;
	public static final int STATERUNNING = 1;
	public static final int STATEPAUSED = 2;

	private LinkedList<Airplane> listAirplanes = new LinkedList<Airplane>();
	private AirportTowerThread att = new AirportTowerThread();
	private LinkedList<AirportEvent> queueAirportEvent = new LinkedList<AirportEvent>();
	private LinkedList<Airplane> queueLandingPattern = new LinkedList<Airplane>();

	public Airport1()
	{
	}

	public void StartSimulator(int listsize, double arrivalrate)
	{
		// create a new list of airplanes for this simulation
		GenerateAirplanes(listsize, arrivalrate);	// 1 plane every 5 minutes = 0.2 for rate		

    	// generate airplane arrival events from airplane list
		// this is the time that each airplane will contact the tower
		// when it is close enough to the airport to enter the landing patern
    	Iterator<Airplane> it = listAirplanes.iterator();
    	while (it.hasNext())
    	{
    		AirportEvent temp = new AirportEvent();
    		temp.eventtype = 0;
    		temp.ap = it.next();
    		queueAirportEvent.addLast(temp);
    	}

    	// event queue should now hold all of the generated airplanes as arrival events
    	// display event queue for debug
		System.out.println("eve      aid      cat               ");
		System.out.println("---------------------------------------------");
		Iterator<AirportEvent> itt = queueAirportEvent.iterator();
    	while (itt.hasNext())
    	{
    		AirportEvent temp = itt.next();
			System.out.format("%-9d%-9d%-18d%n", temp.eventtype, temp.ap.aid, temp.ap.cat);
    	}

		// need to start the tower thread

		// tower thread runs until all airplanes are departed

		// tower thread will check to see if a plane is arriving
		// this clock tick, and if so will generate airplane threads
		// airplane threads will communicate with tower their movements
		// through the airport

    	// setup and start the thread
		att.tsetup();
		att.tstate(STATERUNNING);
		Thread t = new Thread(att);
        t.start();

        // notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.command = 1;
		notifyChanged(me);
	}

	public void StopSimulator()
	{
		// need to clean up everything here
		listAirplanes.clear();

		// request the state change
		att.tstate(STATESTOPPED);

		// notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.command = 2;
		notifyChanged(me);
	}

	public void PauseSimulator()
	{
		// request the state change
		att.tstate(STATEPAUSED);

		// notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.command = 3;
		notifyChanged(me);
	}

	public void ResumeSimulator()
	{
		// request the state change
		att.tstate(STATERUNNING);

		// notify the view of state change
		ModelEvent me = new ModelEvent(this, 1, "");
		me.command = 4;
		notifyChanged(me);
	}

	public void SpeedChangeSimulator(int current)
	{
		att.tspeed(current);
	}

	public void GenerateAirplanes(int size, double rate)
	{
		// new random number generator
		Random ran = new Random();

		// list iterator
		ListIterator<Airplane> it = listAirplanes.listIterator();

		// create a specified number of airplanes
		for (int i = 1; i <= size; i++)
		{
			// generate random number 0 - 1
			double rnum = ran.nextDouble();

			// generate raw arrival time according to poisson process
			double rat = (-1/rate) * (Math.log(1-rnum));

			// if this is not an empty list
			if (!listAirplanes.isEmpty())
			{
				// add this rat to previous airplanes rat
				rat = rat + (it.previous()).rat;
				it.next();
			}

			// convert rat into a simulator tick time
			int trat = (int)((rat * 10) + 0.5);

			// create a new node and add it to the end of the list
			Airplane temp = new Airplane();
			temp.aid = i;		// set airplane id
			temp.rat = rat;		// set raw arrival time
			temp.cat = trat;	// set tick arrival time
			temp.state = 0;		// set state to transit
			it.add(temp);		// add the airplane to the list
		}

		// debug - display generated airplane list
		PrintAirplaneList();
	}

	public void PrintAirplaneList()
	{
		// list iterator
		ListIterator<Airplane> it = listAirplanes.listIterator();

		// display nice header for data
		System.out.println("aid      rat               cat               ");
		System.out.println("---------------------------------------------");

		// work until the end of the list
		while(it.hasNext())
		{
			// display airplane info
			Airplane temp = it.next();
			System.out.format("%-9d%-18.5f%-18d%n", temp.aid, temp.rat, temp.cat);
		}
	}

	final class AirportTowerThread implements Runnable
	{
		private int RequestedState;		// state to switch to next
		private long clocktick;			// current clock tick
		private int speedmultiplier;	// speedup multiplier set by slider control

		public void tsetup()
		{
			clocktick = 1;
			RequestedState = STATESTOPPED;
			speedmultiplier = 1;
		}

		public void tstate(int reqstate)
		{
			RequestedState = reqstate;
		}

		public void tspeed(int speed)
		{
			speedmultiplier = speed;
		}

	    public void run()
	    {
	    	// run until we stop the simulator
	    	while (RequestedState == STATERUNNING)
	    	{
	    		// is it time for the next event?
	    		if ((queueAirportEvent.peekFirst()).ap.cat == clocktick)
	    		{
	    			queueAirportEvent.removeFirst();
	    			System.out.println("airplane requeseted landing pattern at clocktick " + clocktick);
	    		}

	    		// sleep for a while
	    		try { Thread.sleep(1000/speedmultiplier); }
	    		catch (InterruptedException e) { e.printStackTrace(); }

	    		// move to next clock tick
		    	clocktick++;
				System.out.println("clocktick " + clocktick);

		    	// have we paused the simulator?
		    	while (RequestedState == STATEPAUSED)
		    	{
		    		// sleep for a second and check again
		    		try { Thread.sleep(1000); }
		    		catch (InterruptedException e) { e.printStackTrace(); }
		    	}

		    	// has all events been exhausted?
	    		if ((queueAirportEvent.peekFirst()) == null)
	    		{
	    			RequestedState = STATESTOPPED;
	    		}
	    	}

	    	if (RequestedState == STATESTOPPED)
	    	{
	    		// need to clean up everything here
	    		listAirplanes.clear();

	    		// notify the view of state change
	    		ModelEvent me = new ModelEvent(this, 1, "");
	    		me.command = 2;
	    		notifyChanged(me);
	    	}
	    }
	}
}

/**
 * @project AirportSimulator
 * @package AirportSimulator.Controller
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.1
 */
package airport.controller;

import java.util.Random;

import org.junit.Test;

import airport.model.*;
import airport.model.FuelTank.TankSize;
import airport.view.*;

// TODO: Auto-generated Javadoc
/**
 * The Class AirportTower.
 * @author Joshua Charles
 * @author Jeremy Allen
 * @version 3.1
 */
public final class Tower2 extends AbstractController {

	/**
	 * Instantiates a new airport tower.
	 * 
	 * @param args
	 *            the args
	 */
	public Tower2(String[] args) {
		setModel(new Airport2());
		setView(new Airport2View((Airport2) getModel(), this));
		((JFrameView) getView()).setVisible(true);
	}

	/**
	 * Operation.
	 * 
	 * @param actionCommand
	 *            the action command
	 */
	public void operation(String actionCommand) {
		// TODO Auto-generated method stub

	}

	/**
	 * Pause.
	 */
	public void pause() {
		((Airport2) getModel()).pause();
	}

	/**
	 * Resume.
	 */
	public void resume() {
		((Airport2) getModel()).resume();
	}

	/**
	 * Sets the speed.
	 * 
	 * @param current
	 *            the new speed
	 */
	public void setSpeed(int current) {
		((Airport2) getModel()).setSpeed(current);
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
		((Airport2) getModel()).start(listsize, arrivalrate);
	}

	/**
	 * Stop.
	 */
	public void stop() {
		((Airport2) getModel()).stop();
	}

/**
 * Example.
 */
@Test
void example() {
	double dblReserve = TankSize.RESERVE.size() * 2.0; // RESERVE size is set to 1600
	FuelTank largeReserve = new FuelTank(dblReserve);
	FuelTank tripleReserve = new FuelTank(TankSize.RESERVE.multi(3));
	FuelTank normalReserve = new FuelTank(TankSize.RESERVE);
	FuelTank miniTank = new FuelTank(2); // 2 Gallon tank
	FuelTank fiveGalTank = new FuelTank(5);
	FuelTank largeFuelTank = new FuelTank(TankSize.LARGE);
	Airplane smallPlane = new Airplane(new Random().nextInt(), Airline.AAL, largeFuelTank, AirplaneState.WAITINHANGAR, Airline.AAL.getHangar());
	Airplane p1 = new Airplane();
		p1.setId(1);
		p1.setOwner(Airline.getRandom());
		p1.setTank(new FuelTank(new Random().nextGaussian()*100));
		p1.setHolder(p1.getOwner().getHangar());

/**	//How a taxi would be created
 *	Taxi t1 = new Taxi(new Random().nextInt(), null, new FuelTank(TankSize.SMALL.multi((new Random().nextGaussian()*.5))), VehicleState.WAITING, Taxiway.A);
 * 	Taxi t2 = new Taxi();
 * 	t2.setId(2);
 * 	t2.setOwner(Airport.AUS);
 * 	t2.setTank(new FuelTank(new Random().nextGaussian()*15));
 * 	t2.setHolder(t2.getOwner().chooseTaxiway());
 */
		/*
	 * All Tanks are empty, you must either fill() or add(Fuel f)
	 * Vehicles can refuel() although this fills to FULL not MAX
	 */
	try {
		tripleReserve.fill(); // Magically fill tank to capacity
		largeReserve.fill(tripleReserve); // Fill tank from source
		normalReserve.fill(tripleReserve);
	} catch (FuelTankException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		assert (tripleReserve.isEmpty());
		assert (largeReserve.isFull());
		assert (normalReserve.isFull());
	}

	try {
		largeFuelTank.fill(normalReserve);
		fiveGalTank.fill(largeFuelTank);
		miniTank.fill(largeFuelTank);
		smallPlane.getTank().fill(largeFuelTank);

	} catch (FuelTankException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		assert (!largeFuelTank.isEmpty());
		assert (!normalReserve.isEmpty());
		assert (miniTank.isFull());
		assert (smallPlane.getTank().isFull());
	}

}

}
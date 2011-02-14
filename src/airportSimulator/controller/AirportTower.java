/**
 * @project AirportSimulator
 * @package AirportSimulator.Controller
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.0
 */
package airportSimulator.controller;

import airportSimulator.model.*;
import airportSimulator.view.*;

// TODO: Auto-generated Javadoc
/**
 * The Class AirportTower.
 * @author Joshua Charles
 * @author Jeremy Allen
 * @version 3.0
 */
public final class AirportTower extends AbstractController {

	/**
	 * Instantiates a new airport tower.
	 * 
	 * @param args
	 *            the args
	 */
	public AirportTower(String[] args) {
		setModel(new AirportModel());
		setView(new AirportView((AirportModel) getModel(), this));
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
		((AirportModel) getModel()).pause();
	}

	/**
	 * Resume.
	 */
	public void resume() {
		((AirportModel) getModel()).resume();
	}

	/**
	 * Sets the speed.
	 * 
	 * @param current
	 *            the new speed
	 */
	public void setSpeed(int current) {
		((AirportModel) getModel()).setSpeed(current);
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
		((AirportModel) getModel()).start(listsize, arrivalrate);
	}

	/**
	 * Stop.
	 */
	public void stop() {
		((AirportModel) getModel()).stop();
	}
}

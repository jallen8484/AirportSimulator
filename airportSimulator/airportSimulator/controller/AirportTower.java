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

/**
 * AirportTower Class
 * @author Joshua Charles
 * @author Jeremy Allen
 * @version 3.0
 */
public final class AirportTower extends AbstractController {

	public AirportTower(String[] args) {
		setModel(new AirportModel());
		setView(new AirportView((AirportModel) getModel(), this));
		((JFrameView) getView()).setVisible(true);
	}

	public void operation(String actionCommand) {	// TODO Auto-generated method stub	}
	public void pause() {	((AirportModel) getModel()).pause();	}
	public void resume() {	((AirportModel) getModel()).resume();	}
	public void setSpeed(int current) {	((AirportModel) getModel)).setSpeed(current);	}
	public void start(int listsize, double arrivalrate) {	((AirportModel) getModel()).start(listsize, arrivalrate);	}
	public void stop() {	((AirportModel) getModel()).stop();	}
}

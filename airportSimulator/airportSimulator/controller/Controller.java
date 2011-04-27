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

import airportSimulator.model.Model;
import airportSimulator.view.View;

/**
 * Controller Interface
 * @author Joshua Charles
 * @version 3.0
 */
public interface Controller {
	Model getModel();
	View getView();
	void setModel(Model model);
	void setView(View view);
}

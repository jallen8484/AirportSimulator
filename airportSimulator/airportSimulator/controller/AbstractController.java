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
 * AbstractController Class
 * @author Joshua Charles
 * @version 3.0
 */
public abstract class AbstractController implements Controller {
	private Model model;
	private View view;
	public Model getModel() {	return model;	}
	public View getView() {	return view;	}
	public void setModel(Model model) {	this.model = model;	}
	public void setView(View view) {	this.view = view;	}
}

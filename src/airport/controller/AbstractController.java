/**
 * @project AirportSimulator
 * @package AirportSimulator.Controller
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.0
 */
package airport.controller;

import airport.model.Model;
import airport.view.View;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractController.
 * @author Joshua Charles
 * @version 3.0
 */
public abstract class AbstractController implements Controller {

	/** The model. */
	private Model model;

	/** The view. */
	private View view;

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Controller.Controller#getModel()
	 */
	@Override
	public Model getModel() {
		return model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Controller.Controller#getView()
	 */
	@Override
	public View getView() {
		return view;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Controller.Controller#setModel(AirportSimulator.Model
	 * .Model)
	 */
	@Override
	public void setModel(Model model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Controller.Controller#setView(AirportSimulator.View.
	 * View)
	 */
	@Override
	public void setView(View view) {
		this.view = view;
	}
}

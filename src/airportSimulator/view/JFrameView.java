/**
 * @project AirportSimulator
 * @package airportSimulator.view
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.0
 */
package airportSimulator.view;

import javax.swing.JFrame;

import airportSimulator.controller.Controller;
import airportSimulator.model.*;

// TODO: Auto-generated Javadoc
/**
 * The Class JFrameView.
 * @author Joshua Charles
 * @version 3.0
 */

public abstract class JFrameView extends JFrame implements View, ModelListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 322272620567787604L;

	/** The controller. */
	private Controller controller;

	/** The model. */
	private Model model;

	/**
	 * Instantiates a new j frame view.
	 * 
	 * @param model
	 *            the model
	 * @param controller
	 *            the controller
	 */
	public JFrameView(Model model, Controller controller) {
		setModel(model);
		setController(controller);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.View.View#GetController()
	 */
	@Override
	public Controller getController() {
		return controller;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.View.View#GetModel()
	 */
	@Override
	public Model getModel() {
		return model;
	}

	/**
	 * Register with model.
	 */
	public void registerWithModel() {
		((AbstractModel) model).addModelListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.View.View#SetController(AirportSimulator.Controller.
	 * Controller)
	 */
	@Override
	public void setController(Controller controller) {
		this.controller = controller;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.View.View#SetModel(AirportSimulator.Model.Model)
	 */
	@Override
	public void setModel(Model model) {
		this.model = model;
		registerWithModel();
	}
}

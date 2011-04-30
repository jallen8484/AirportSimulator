/**
 * @project AirportSimulator
 * @package AirportSimulator.View
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 5.0
 */
package AirportSimulator.View;

import javax.swing.JFrame;

import AirportSimulator.Controller.Controller;
import AirportSimulator.Model.Model;
import AirportSimulator.Model.AbstractModel;
import AirportSimulator.Model.ModelListener;

/**
 * The Class JFrameView.
 * @author Joshua Charles
 * @version 5.0
 */
@SuppressWarnings("serial")
public abstract class JFrameView extends JFrame implements View, ModelListener
{
	/** The model. */
	private Model model;
	
	/** The controller. */
	private Controller controller;

	/**
	 * Instantiates a new jframe view.
	 * 
	 * @param model
	 *            the model
	 * @param controller
	 *            the controller
	 */
	public JFrameView(Model model, Controller controller)
	{
		SetModel(model);
		SetController(controller);
	}

	/**
	 * Register with model.
	 */
	public void RegisterWithModel()
	{
		((AbstractModel)model).addModelListener(this);
	}

	/**
	 * @see AirportSimulator.View.View#GetController()
	 */
	public Controller GetController()
	{
		return controller;
	}

	/**
	 * @see
	 * AirportSimulator.View.View#SetController(AirportSimulator.Controller.
	 * Controller)
	 */
	public void SetController(Controller controller)
	{
		this.controller = controller;
	}

	/**
	 * @see AirportSimulator.View.View#GetModel()
	 */
	public Model GetModel()
	{
		return model;
	}

	/**
	 * @see AirportSimulator.View.View#SetModel(AirportSimulator.Model.Model)
	 */
	public void SetModel(Model model)
	{
		this.model = model;
		RegisterWithModel();
	}
}

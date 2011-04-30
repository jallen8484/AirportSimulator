/**
 * @project AirportSimulator
 * @package AirportSimulator.Controller
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 5.0
 */
package AirportSimulator.Controller;

import AirportSimulator.Model.Model;
import AirportSimulator.View.View;

/**
 * The Class AbstractController.
 * @author Joshua Charles
 * @version 5.0
 */
public abstract class AbstractController implements Controller
{
	/** The view. */
	private View view;
	
	/** The model. */
	private Model model;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Controller.Controller#setModel(AirportSimulator.Model
	 * .Model)
	 */
	public void SetModel(Model model)
	{
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Controller.Controller#getModel()
	 */
	public Model GetModel()
	{
		return model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AirportSimulator.Controller.Controller#getView()
	 */
	public View GetView()
	{
		return view;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Controller.Controller#setView(AirportSimulator.View.
	 * View)
	 */
	public void SetView(View view)
	{
		this.view = view;
	}
}

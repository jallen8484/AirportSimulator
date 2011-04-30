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
 * The Interface Controller.
 * @author Joshua Charles
 * @version 5.0
 */
public interface Controller
{
	/**
	 * Sets the model.
	 * 
	 * @param model
	 *            the new model
	 */
	void SetModel(Model model);
	
	/**
	 * Gets the model.
	 * 
	 * @return the model
	 */
	Model GetModel();
	
	/**
	 * Gets the view.
	 * 
	 * @return the view
	 */
	View GetView();
	
	/**
	 * Sets the view.
	 * 
	 * @param view
	 *            the new view
	 */
	void SetView(View view);
}

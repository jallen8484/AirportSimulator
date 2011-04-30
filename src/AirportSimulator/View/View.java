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

import AirportSimulator.Controller.Controller;
import AirportSimulator.Model.Model;

/**
 * The Interface View.
 * @author Joshua Charles
 * @version 5.0
 */
public interface View
{
	/**
	 * Gets the controller.
	 * 
	 * @return the controller
	 */
	Controller GetController();
	
	/**
	 * Sets the controller.
	 * 
	 * @param controller
	 *            the controller
	 */
	void SetController(Controller controller);
	
	/**
	 * Gets the model.
	 * 
	 * @return the model
	 */
	Model GetModel();
	
	/**
	 * Sets the model.
	 * 
	 * @param model
	 *            the model
	 */
	void SetModel(Model model);
}

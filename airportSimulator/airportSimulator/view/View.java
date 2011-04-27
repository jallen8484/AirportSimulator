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

import airportSimulator.controller.Controller;
import airportSimulator.model.Model;

// TODO: Auto-generated Javadoc
/**
 * The Interface View.
 * @author Joshua Charles
 * @version 3.0
 */
public interface View {

	/**
	 * Gets the controller.
	 * 
	 * @return the controller
	 */
	Controller getController();

	/**
	 * Gets the model.
	 * 
	 * @return the model
	 */
	Model getModel();

	/**
	 * Sets the controller.
	 * 
	 * @param controller
	 *            the controller
	 */
	void setController(Controller controller);

	/**
	 * Sets the model.
	 * 
	 * @param model
	 *            the model
	 */
	void setModel(Model model);
}

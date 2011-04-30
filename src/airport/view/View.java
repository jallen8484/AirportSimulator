/**
 * @project AirportSimulator
 * @package airport.view
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.1
 */
package airport.view;

import airport.controller.Controller;
import airport.model.Model;

// TODO: Auto-generated Javadoc
/**
 * The Interface View.
 * @author Joshua Charles
 * @version 3.1
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

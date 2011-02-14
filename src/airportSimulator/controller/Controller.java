/**
 * @project AirportSimulator
 * @package AirportSimulator.Controller
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.0
 */
package AirportSimulator.Controller;

import AirportSimulator.Model.Model;
import AirportSimulator.View.View;

// TODO: Auto-generated Javadoc
/**
 * The Interface Controller.
 */
public interface Controller {

	/**
	 * Gets the model.
	 * 
	 * @return the model
	 */
	Model getModel();

	/**
	 * Gets the view.
	 * 
	 * @return the view
	 */
	View getView();

	/**
	 * Sets the model.
	 * 
	 * @param model
	 *            the new model
	 */
	void setModel(Model model);

	/**
	 * Sets the view.
	 * 
	 * @param view
	 *            the new view
	 */
	void setView(View view);
}

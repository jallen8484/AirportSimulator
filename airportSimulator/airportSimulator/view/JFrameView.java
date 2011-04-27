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

/**
 * JFrameView Class
 * @author Joshua Charles
 * @version 3.0
 */

public abstract class JFrameView extends JFrame implements View, ModelListener {

	private static final long serialVersionUID = 322272620567787604L;
	private Controller controller;
	private Model model;
	public JFrameView(Model model, Controller controller) {
		setModel(model);
		setController(controller);
	}
	public Controller getController() {	return controller;	}
	public Model getModel() {	return model;	}
	public void registerWithModel() {	((AbstractModel) model).addModelListener(this);	}
	public void setController(Controller controller) {	this.controller = controller;	}
	public void setModel(Model model) {
		this.model = model;
		registerWithModel();
	}
}

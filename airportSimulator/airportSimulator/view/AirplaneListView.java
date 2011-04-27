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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

import airportSimulator.controller.*;
import airportSimulator.model.*;

/**
 * AirplaneListView Class
 * @author Joshua Charles
 * @version 3.0
 */
public class AirplaneListView extends JFrameView {
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// ((airportTower)getController()).SimulatorOperation(e.getActionCommand());
		}
	}

	public AirplaneListView(AirportModel model, AirportTower controller) {
		super(model, controller);

		// set title and window properties
		this.setTitle("Airplane List View");
		this.setResizable(false);
		this.setLocation(100, 200);

		Handler handler = new Handler();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		pack();
	}

	public void modelChanged(ModelEvent event) {

	}
}

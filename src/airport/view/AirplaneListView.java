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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

import airport.controller.*;
import airport.model.*;

// TODO: Auto-generated Javadoc
/**
 * The Class AirplaneListView.
 * @author Joshua Charles
 * @version 3.1
 */
@SuppressWarnings("serial")
public class AirplaneListView extends JFrameView {

	/**
	 * The Class Handler.
	 */
	class Handler implements ActionListener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent
		 * )
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			((Tower1)getController()).operation(e.getActionCommand());
		}
	}

	/**
	 * Instantiates a new airplane list view.
	 * 
	 * @param model
	 *            the model
	 * @param controller
	 *            the controller
	 */
	@SuppressWarnings("unused")
	public AirplaneListView(Airport1 model, Tower1 controller) {
		super(model, controller);

		// set title and window properties
		this.setTitle("Airplane List View");
		this.setResizable(false);
		this.setLocation(100, 200);

		Handler handler = new Handler();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		pack();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Model.ModelListener#modelChanged(AirportSimulator.Model
	 * .ModelEvent)
	 */
	@Override
	public void modelChanged(ModelEvent event) {

	}
}

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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

import AirportSimulator.Controller.AirportSimulatorController;
import AirportSimulator.Model.AirportSimulatorModel;
import AirportSimulator.Model.ModelEvent;
import AirportSimulator.View.AirportSimulatorView.Handler;

/**
 * The Class AirplaneListView.
 * @author Joshua Charles
 * @version 5.0
 */
@SuppressWarnings("serial")
public class AirplaneListView extends JFrameView
{
	/**
	 * Instantiates a new airplane list view.
	 * 
	 * @param model
	 *            the model
	 * @param controller
	 *            the controller
	 */
	public AirplaneListView(AirportSimulatorModel model, AirportSimulatorController controller)
	{
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
	public void modelChanged(ModelEvent event)
	{

	}

	/**
	 * The Class Handler.
	 */
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
//			((AirportSimulatorController)GetController()).SimulatorOperation(e.getActionCommand());
		}
	}
}

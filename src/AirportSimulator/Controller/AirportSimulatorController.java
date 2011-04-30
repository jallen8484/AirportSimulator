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

import AirportSimulator.Model.AirportSimulatorModel;
import AirportSimulator.View.AirplaneListView;
import AirportSimulator.View.AirportSimulatorView;
import AirportSimulator.View.JFrameView;

/**
 * The Class AirportSimulatorController.
 * @author Joshua Charles
 * @version 5.0
 */
public class AirportSimulatorController extends AbstractController
{
	/**
	 * Instantiates a new AirportSimulatorController.
	 * 
	 * @param args
	 *            the args
	 */
	public AirportSimulatorController()
	{
		SetModel(new AirportSimulatorModel());
		SetView(new AirportSimulatorView((AirportSimulatorModel)GetModel(), this));
		((JFrameView)GetView()).setVisible(true);
	}

	/**
	 * Start.
	 * 
	 * @param listsize
	 *            the listsize
	 * @param arrivalrate
	 *            the arrivalrate
	 */
	public void SimulatorStart(int listsize, double arrivalrate)
	{
		((AirportSimulatorModel)GetModel()).StartSimulator(listsize, arrivalrate);
	}

	/**
	 * Stops the simulator.
	 */
	public void SimulatorStop()
	{
		((AirportSimulatorModel)GetModel()).StopSimulator();
	}

	/**
	 * Pauses the simulator.
	 */
	public void SimulatorPause()
	{
		((AirportSimulatorModel)GetModel()).PauseSimulator();
	}

	/**
	 * Resumes the simulator.
	 */
	public void SimulatorResume()
	{
		((AirportSimulatorModel)GetModel()).ResumeSimulator();
	}

	/**
	 * Sets the speed.
	 * 
	 * @param current
	 *            the new speed
	 */
	public void SimulatorSpeedChange(int current)
	{
		((AirportSimulatorModel)GetModel()).SpeedChangeSimulator(current);
	}
	
	/**
	 * Opens an airplane monitor view.
	 */
	public void SimulatorAirplaneMonitor()
	{
		AirplaneListView airplanelistview = new AirplaneListView(
				(AirportSimulatorModel)GetModel(),
				this);
		airplanelistview.setVisible(true);
	}
}

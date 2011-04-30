package airport.controller;

import airport.model.AirportSimulatorModel;
import airport.view.*;

public class AirportSimulatorController extends AbstractController
{
	public AirportSimulatorController()
	{
		setModel(new AirportSimulatorModel());
		setView(new AirportSimulatorView((AirportSimulatorModel)getModel(), this));
		((JFrameView)getView()).setVisible(true);
	}

	public void SimulatorStart(int listsize, double arrivalrate)
	{
		((AirportSimulatorModel)getModel()).StartSimulator(listsize, arrivalrate);
	}

	public void SimulatorStop()
	{
		((AirportSimulatorModel)getModel()).StopSimulator();
	}

	public void SimulatorPause()
	{
		((AirportSimulatorModel)getModel()).PauseSimulator();
	}

	public void SimulatorResume()
	{
		((AirportSimulatorModel)getModel()).ResumeSimulator();
	}

	public void SimulatorSpeedChange(int current)
	{
		((AirportSimulatorModel)getModel()).SpeedChangeSimulator(current);
	}
	
	public void SimulatorAirplaneMonitor()
	{
		AirplaneListView airplanelistview = new AirplaneListView(
				(AirportSimulatorModel)getModel(),
				this);
		airplanelistview.setVisible(true);
	}
}

package AirportSimulator.Controller;

import AirportSimulator.Model.AirportSimulatorModel;
import AirportSimulator.View.AirplaneListView;
import AirportSimulator.View.AirportSimulatorView;
import AirportSimulator.View.JFrameView;

public class AirportSimulatorController extends AbstractController
{
	public AirportSimulatorController()
	{
		SetModel(new AirportSimulatorModel());
		SetView(new AirportSimulatorView((AirportSimulatorModel)GetModel(), this));
		((JFrameView)GetView()).setVisible(true);
	}

	public void SimulatorStart(int listsize, double arrivalrate)
	{
		((AirportSimulatorModel)GetModel()).StartSimulator(listsize, arrivalrate);
	}

	public void SimulatorStop()
	{
		((AirportSimulatorModel)GetModel()).StopSimulator();
	}

	public void SimulatorPause()
	{
		((AirportSimulatorModel)GetModel()).PauseSimulator();
	}

	public void SimulatorResume()
	{
		((AirportSimulatorModel)GetModel()).ResumeSimulator();
	}

	public void SimulatorSpeedChange(int current)
	{
		((AirportSimulatorModel)GetModel()).SpeedChangeSimulator(current);
	}
	
	public void SimulatorAirplaneMonitor()
	{
		AirplaneListView airplanelistview = new AirplaneListView(
				(AirportSimulatorModel)GetModel(),
				this);
		airplanelistview.setVisible(true);
	}
}

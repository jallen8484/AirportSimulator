package airport.controller;

import airport.model.*;
import airport.view.*;

public class Tower1 extends AbstractController
{
	public Tower1()
	{
		setModel(new Airport1());
		setView(new Airport1View((Airport1)getModel(), this));
		((JFrameView)getView()).setVisible(true);
	}

	public void SimulatorStart(int listsize, double arrivalrate)
	{
		((Airport1)getModel()).StartSimulator(listsize, arrivalrate);
	}

	public void SimulatorStop()
	{
		((Airport1)getModel()).StopSimulator();
	}

	public void SimulatorPause()
	{
		((Airport1)getModel()).PauseSimulator();
	}

	public void SimulatorResume()
	{
		((Airport1)getModel()).ResumeSimulator();
	}

	public void SimulatorSpeedChange(int current)
	{
		((Airport1)getModel()).SpeedChangeSimulator(current);
	}
}

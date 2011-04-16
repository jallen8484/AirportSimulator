package controller;

import model.AirportSimulatorModel;
import view.AirportSimulatorView;
import view.JFrameView;

public class AirportSimulatorController extends AbstractController
{
	public AirportSimulatorController()
	{
		SetModel(new AirportSimulatorModel());
		SetView(new AirportSimulatorView((AirportSimulatorModel)GetModel(), this));
		((JFrameView)GetView()).setVisible(true);
	}
	
	public void SimulatorOperation(String option)
	{
		
	}
}

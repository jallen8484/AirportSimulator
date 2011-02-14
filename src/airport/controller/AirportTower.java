package airport.controller;

import airport.model.*;
import airport.view.*;

public final class AirportTower extends AbstractController {
	public AirportTower()
	{
		setModel(new AirportModel());
		setView(new AirportView((AirportModel)getModel(), this));
		((JFrameView)getView()).setVisible(true);
	}
	
	public void operation(String option)
	{
		
	}



}

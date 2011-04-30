package airport.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

import airport.controller.AirportSimulatorController;
import airport.model.AirportSimulatorModel;
import airport.model.ModelEvent;
import airport.view.AirportSimulatorView.Handler;

@SuppressWarnings("serial")
public class AirplaneListView extends JFrameView
{
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
	
	public void modelChanged(ModelEvent event)
	{

	}

	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
//			((AirportSimulatorController)GetController()).SimulatorOperation(e.getActionCommand());
		}
	}
}

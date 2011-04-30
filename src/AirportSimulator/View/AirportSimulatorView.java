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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import AirportSimulator.Controller.AirportSimulatorController;
import AirportSimulator.Model.AirportSimulatorModel;
import AirportSimulator.Model.ModelEvent;

/**
 * The Class AirportSimulatorView.
 * @author Joshua Charles
 * @version 5.0
 */
@SuppressWarnings("serial")
public class AirportSimulatorView extends JFrameView
{
	/** The Constant STARTSIM. */
	public static final String STARTSIM = "Start Simulator";
	
	/** The Constant STOPSIM. */
	public static final String STOPSIM = "Stop Simulator";
	
	/** The Constant PAUSESIM. */
	public static final String PAUSESIM = "Pause";
	
	/** The Constant RESUMESIM. */
	public static final String RESUMESIM = "Resume";

	/** The jbutton airplane monitor. */
    private JButton jButtonAirplaneMonitor = new JButton();
    
    /** The jbutton arrival monitor. */
    private JButton jButtonArrivalMonitor = new JButton();
    
    /** The jbutton departure monitor. */
    private JButton jButtonDepartureMonitor = new JButton();
    
    /** The jbutton start simulator. */
    private JButton jButtonStartSimulator = new JButton();
    
    /** The jbutton stop simulator. */
    private JButton jButtonStopSimulator = new JButton();
    
    /** The jbutton pause simulator. */
    private JButton jButtonPauseSimulator = new JButton();
    
    /** The jlabel1. */
    private JLabel jLabel1 = new JLabel();
    
    /** The jlabel2. */
    private JLabel jLabel2 = new JLabel();
    
    /** The jlabel3. */
    private JLabel jLabel3 = new JLabel();
    
    /** The jlabel4. */
    private JLabel jLabel4 = new JLabel();
    
    /** The jlabel5. */
    private JLabel jLabel5 = new JLabel();
    
    /** The jlabel6. */
    private JLabel jLabel6 = new JLabel();
    
    /** The jlabel7. */
    private JLabel jLabel7 = new JLabel();
    
    /** The jlabel8. */
    private JLabel jLabel8 = new JLabel();
    
    /** The jseparator1. */
    private JSeparator jSeparator1 = new JSeparator();
    
    /** The jseparator2. */
    private JSeparator jSeparator2 = new JSeparator();
    
    /** The jtext field airplane arrival rate. */
    private JTextField jTextFieldAirplaneArrivalRate = new JTextField();
    
    /** The jtext field number airplanes to generate. */
    private JTextField jTextFieldNumberAirplanesToGenerate = new JTextField();
    
    /** The jtext field tower state. */
    private JTextField jTextFieldTowerState = new JTextField();
    
    /** The jslider1. */
    private JSlider jSlider1 = new JSlider();

    
	/**
	 * Instantiates a new airport simulator view.
	 * 
	 * @param model
	 *            the model
	 * @param controller
	 *            the controller
	 */
	public AirportSimulatorView(AirportSimulatorModel model, AirportSimulatorController controller)
	{
		// execute superconstructor method
		super(model, controller);

		// set title and window properties
		setTitle("Airport Simulator");
		setResizable(false);
		setLocation(100, 200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// set the ehandler for this view
		Handler handler = new Handler();
		Handler2 handler2 = new Handler2();

        jButtonStartSimulator.setText(STARTSIM);
        jButtonStartSimulator.addActionListener(handler);

        jButtonPauseSimulator.setText(PAUSESIM);
        jButtonPauseSimulator.addActionListener(handler);
        jButtonPauseSimulator.setEnabled(false);

        jButtonStopSimulator.setText(STOPSIM);
        jButtonStopSimulator.addActionListener(handler);
        jButtonStopSimulator.setEnabled(false);

        jLabel1.setText("Number of Airplanes to Generate");
        jTextFieldNumberAirplanesToGenerate.setText("5");

        jLabel2.setText("Airplane Arrival Rate = Planes / Minute");
        jTextFieldAirplaneArrivalRate.setText("0.5");

        jLabel8.setText("Tower State");
        jTextFieldTowerState.setText("Stopped");
        jTextFieldTowerState.setEnabled(false);

        jLabel3.setText("Simulator");
        jLabel4.setText("Monitor Windows");

        jButtonAirplaneMonitor.setText("Airplanes");
        jButtonAirplaneMonitor.addActionListener(handler);

        jButtonArrivalMonitor.setText("Arrivals");
        jButtonArrivalMonitor.addActionListener(handler);

        jButtonDepartureMonitor.setText("Departures");
        jButtonDepartureMonitor.addActionListener(handler);

        jLabel5.setText("1x");
        jLabel6.setText("20x");
        jLabel7.setText("Simulation Speed");
        jLabel8.setText("Tower State");

        jSlider1.setMinimum(1);
        jSlider1.setMaximum(20);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setValue(1);
        jSlider1.addChangeListener(handler2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAirplaneMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonArrivalMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDepartureMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addGap(8, 8, 8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel7)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel4)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonStartSimulator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPauseSimulator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonStopSimulator))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTowerState, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldAirplaneArrivalRate)
                                .addComponent(jTextFieldNumberAirplanesToGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumberAirplanesToGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAirplaneArrivalRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTowerState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStartSimulator)
                    .addComponent(jButtonStopSimulator)
                    .addComponent(jButtonPauseSimulator))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAirplaneMonitor)
                    .addComponent(jButtonDepartureMonitor)
                    .addComponent(jButtonArrivalMonitor))
                .addGap(27, 27, 27))
        );

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

		if (event.command == 1)  //simulator start button pressed and success
		{
			// set some controls to disabled
			jButtonStartSimulator.setEnabled(false);
			jTextFieldNumberAirplanesToGenerate.setEnabled(false);
			jTextFieldAirplaneArrivalRate.setEnabled(false);

			// set some controls to enabled
			jButtonStopSimulator.setEnabled(true);
			jButtonPauseSimulator.setEnabled(true);

			// update tower state
			jTextFieldTowerState.setText("Running");
		}

		else if (event.command == 2) //simulator stop button pressed and success
		{

			// set some controls to disabled
			jButtonStopSimulator.setEnabled(false);
			jButtonPauseSimulator.setEnabled(false);

			// set some controls to enabled
			jButtonStartSimulator.setEnabled(true);	
			jTextFieldNumberAirplanesToGenerate.setEnabled(true);
			jTextFieldAirplaneArrivalRate.setEnabled(true);

			// update tower state
			jTextFieldTowerState.setText("Stopped");
		}

		else if (event.command == 3) //simulator pause button pressed and success
		{
			jButtonPauseSimulator.setText("Resume");
			jTextFieldTowerState.setText("Paused");
		}

		else if (event.command == 4) //simulator resume button pressed and success
		{
			jButtonPauseSimulator.setText("Pause");
			jTextFieldTowerState.setText("Running");
		}
	}

	/**
	 * The Class Handler.
	 */
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if ( e.getActionCommand() == STARTSIM)
			{
				// check variable for valid input
				try
					{ Integer.parseInt(jTextFieldNumberAirplanesToGenerate.getText()); }
				catch ( NumberFormatException nfe )
					{  }

				// check variable for valid input
				try
					{ Double.parseDouble(jTextFieldAirplaneArrivalRate.getText()); }
				catch ( NumberFormatException nfe )
					{ }

				// execute start method of controller
				((AirportSimulatorController)GetController()).SimulatorStart(
						Integer.parseInt(jTextFieldNumberAirplanesToGenerate.getText()),
						Double.parseDouble(jTextFieldAirplaneArrivalRate.getText()));
			}

			if ( e.getActionCommand() == STOPSIM)
			{
				// execute stop method of controller
				((AirportSimulatorController)GetController()).SimulatorStop();
			}

			if ( e.getActionCommand() == PAUSESIM)
			{
				// execute pause method of controller
				((AirportSimulatorController)GetController()).SimulatorPause();
			}

			if ( e.getActionCommand() == RESUMESIM)
			{
				// execute resume method of controller
				((AirportSimulatorController)GetController()).SimulatorResume();
			}
			
			if ( e.getActionCommand() == "Airplanes")
			{
				// execute resume method of controller
				((AirportSimulatorController)GetController()).SimulatorAirplaneMonitor();
			}
		}
	}

	/**
	 * The Class Handler2.
	 */
	class Handler2 implements ChangeListener
	{
		public void stateChanged(ChangeEvent e)
		{
			((AirportSimulatorController)GetController()).SimulatorSpeedChange(jSlider1.getValue());
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		new AirportSimulatorController();
	}
}

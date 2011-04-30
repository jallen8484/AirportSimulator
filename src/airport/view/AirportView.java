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

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import airport.controller.*;
import airport.model.*;

// TODO: Auto-generated Javadoc
/**
 * The Class AirportView.
 * @author Jeremy Allen
 * @version 3.1
 */

public class AirportView extends JFrameView {

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
			if (e.getActionCommand() == STARTSIM) {
				// check variable for valid input
				try {
					Integer.parseInt(jtNumberAirplanesToGenerate.getText());
					Double.parseDouble(jtAirplaneArrivalRate.getText());
				} catch (NumberFormatException nfe) {
				}

				// execute start method of controller
				((Tower) getController())
						.start(Integer.parseInt(jtNumberAirplanesToGenerate.getText()),
								Double.parseDouble(jtAirplaneArrivalRate.getText()));
			}

			if (e.getActionCommand() == STOPSIM) {
				// execute stop method of controller
				((Tower) getController()).stop();
			}

			if (e.getActionCommand() == PAUSESIM) {
				// execute pause method of controller
				((Tower) getController()).pause();
			}

			if (e.getActionCommand() == RESUMESIM) {
				// execute resume method of controller
				((Tower) getController()).resume();
			}
			((Tower) getController()).operation(e.getActionCommand());
		}
	}

	/**
	 * The Class Handler2.
	 */
	class Handler2 implements ChangeListener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.swing.event.ChangeListener#stateChanged(javax.swing.event.
		 * ChangeEvent)
		 */
		@Override
		public void stateChanged(ChangeEvent e) {
			((Tower) getController()).setSpeed(jsSpeed.getValue());
		}

	}

	/** The Constant PAUSESIM. */
	public static final String PAUSESIM = "Pause";

	/** The Constant RESUMESIM. */
	public static final String RESUMESIM = "Resume";

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8909611440559887146L;

	/** The Constant STARTSIM. */
	public static final String STARTSIM = "Start Simulator";

	/** The Constant STOPSIM. */
	public static final String STOPSIM = "Stop Simulator";

	/** The j button airplane monitor. */
	private JButton jbAirplaneMonitor = new JButton();

	/** The j button arrival monitor. */
	private JButton jbArrivalMonitor = new JButton();

	/** The j button departure monitor. */
	private JButton jbDepartureMonitor = new JButton();

	/** The j button pause simulator. */
	private JButton jbPause = new JButton();

	/** The j button start simulator. */
	private JButton jbStart = new JButton();

	/** The j button stop simulator. */
	private JButton jbStop = new JButton();

	/** The j label1. */
	private JLabel jLabel1 = new JLabel();

	/** The j label2. */
	private JLabel jLabel2 = new JLabel();

	/** The j label3. */
	private JLabel jLabel3 = new JLabel();

	/** The j label4. */
	private JLabel jLabel4 = new JLabel();

	/** The j label5. */
	private JLabel jLabel5 = new JLabel();

	/** The j label6. */
	private JLabel jLabel6 = new JLabel();

	/** The j label7. */
	private JLabel jLabel7 = new JLabel();

	/** The j label8. */
	private JLabel jLabel8 = new JLabel();

	/** The j separator1. */
	private JSeparator jSeparator1 = new JSeparator();

	/** The j separator2. */
	private JSeparator jSeparator2 = new JSeparator();

	/** The j slider1. */
	private JSlider jsSpeed = new JSlider();

	/** The j text field airplane arrival rate. */
	private JTextField jtAirplaneArrivalRate = new JTextField();

	/** The j text field number airplanes to generate. */
	private JTextField jtNumberAirplanesToGenerate = new JTextField();

	/** The j text field tower state. */
	private JTextField jtTowerState = new JTextField();

	/**
	 * Instantiates a new airport simulator view.
	 * 
	 * @param model
	 *            the model
	 * @param controller
	 *            the controller
	 */
	public AirportView(Airport model, Tower controller) {
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

		jbStart.setText(STARTSIM);
		jbStart.setActionCommand(STARTSIM);
		jbStart.addActionListener(handler);

		jbPause.setText(PAUSESIM);
		jbPause.addActionListener(handler);
		jbPause.setEnabled(false);

		jbStop.setText(STOPSIM);
		jbStop.addActionListener(handler);
		jbStop.setEnabled(false);

		jLabel1.setText("Number of Airplanes to Generate");
		jtNumberAirplanesToGenerate.setText("5");

		jLabel2.setText("Airplane Arrival Rate = Planes / Minute");
		jtAirplaneArrivalRate.setText("0.5");

		jLabel8.setText("Tower State");
		jtTowerState.setText("Stopped");
		jtTowerState.setEnabled(false);

		jLabel3.setText("Simulator");
		jLabel4.setText("Monitor Windows");

		jbAirplaneMonitor.setText("Airplanes");
		jbAirplaneMonitor.addActionListener(handler);

		jbArrivalMonitor.setText("Arrivals");
		jbArrivalMonitor.addActionListener(handler);

		jbDepartureMonitor.setText("Departures");
		jbDepartureMonitor.addActionListener(handler);

		jLabel5.setText("1x");
		jLabel6.setText("20x");
		jLabel7.setText("Simulation Speed");
		jLabel8.setText("Tower State");

		jsSpeed.setMinimum(1);
		jsSpeed.setMaximum(20);
		jsSpeed.setMinorTickSpacing(1);
		jsSpeed.setValue(1);
		jsSpeed.addChangeListener(handler2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(22, 22, 22)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jSeparator2,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														357, Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jbAirplaneMonitor,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		96,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jbArrivalMonitor,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		124,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jbDepartureMonitor,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		125,
																		Short.MAX_VALUE))
												.addComponent(
														jSeparator1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														357, Short.MAX_VALUE))
								.addGap(21, 21, 21))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(93, 93, 93)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
																.addComponent(
																		jsSpeed,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGroup(
																		layout.createSequentialGroup()
																				.addGap(10,
																						10,
																						10)
																				.addComponent(
																						jLabel5)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel6)
																				.addGap(8,
																						8,
																						8)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(61, 61,
																		61)
																.addComponent(
																		jLabel7)))
								.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup().addGap(151, 151, 151)
								.addComponent(jLabel4)
								.addContainerGap(167, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(56, 56, 56)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addComponent(
																		jbStart)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jbPause)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jbStop))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(
																										jLabel1)
																								.addComponent(
																										jLabel3,
																										javax.swing.GroupLayout.Alignment.TRAILING))
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jLabel8))
																.addGap(48, 48,
																		48)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jtTowerState,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						74,
																						Short.MAX_VALUE)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																								.addComponent(
																										jtAirplaneArrivalRate)
																								.addComponent(
																										jtNumberAirplanesToGenerate,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										74,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addGap(64, 64, 64)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel3)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jtNumberAirplanesToGenerate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jtAirplaneArrivalRate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8)
												.addComponent(
														jtTowerState,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										16, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jbStart)
												.addComponent(jbStop)
												.addComponent(jbPause))
								.addGap(18, 18, 18)
								.addComponent(jSeparator2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel7)
																.addGap(29, 29,
																		29))
												.addComponent(
														jsSpeed,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(jLabel6))
								.addGap(18, 18, 18)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel4)
								.addGap(13, 13, 13)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jbAirplaneMonitor)
												.addComponent(
														jbDepartureMonitor)
												.addComponent(jbArrivalMonitor))
								.addGap(27, 27, 27)));

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

		if (event.message() == STARTSIM) // simulator start
															// button pressed
															// and success
		{
			// set some controls to disabled
			jbStart.setEnabled(false);
			jtNumberAirplanesToGenerate.setEnabled(false);
			jtAirplaneArrivalRate.setEnabled(false);

			// set some controls to enabled
			jbStop.setEnabled(true);
			jbPause.setEnabled(true);

			// update tower state
			jtTowerState.setText("Running");
		}

		else if (event.message() == STOPSIM) // simulator stop
																// button
																// pressed and
		// success
		{

			// set some controls to disabled
			jbStop.setEnabled(false);
			jbPause.setEnabled(false);

			// set some controls to enabled
			jbStart.setEnabled(true);
			jtNumberAirplanesToGenerate.setEnabled(true);
			jtAirplaneArrivalRate.setEnabled(true);

			// update tower state
			jtTowerState.setText("Stopped");
		}

		else if (event.message() == PAUSESIM) // simulator pause
																// button
																// pressed and
		// success
		{

			jbPause.setText("Resume");
			jtTowerState.setText("Paused");
		}

		else if (event.message() == RESUMESIM) // simulator
																// resume button
																// pressed and
		// success
		{
			jbPause.setText("Pause");
			jtTowerState.setText("Running");
		}

	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		new Tower(args);
	}


}

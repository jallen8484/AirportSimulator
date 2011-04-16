package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import controller.AirportSimulatorController;
import model.AirportSimulatorModel;
import model.ModelEvent;


public class AirportSimulatorView extends JFrameView
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6967951883336893612L;
	private static final String DEFAULT_ARRIVAL_RATE = "1";
	private static final String DEFAULT_NUMBER_AIRPLANES = "10";
	private JButton jButtonAirplaneMonitor = new JButton();
    private JButton jButtonArrivalMonitor = new JButton();
    private JButton jButtonDepartureMonitor = new JButton();
    private JButton jButtonStartSimulator = new JButton();
    private JButton jButtonStopSimulator = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JSeparator jSeparator2 = new JSeparator();
    private JTextField jTextFieldAirplaneArrivalRate = new JTextField();
    private JTextField jTextFieldNumberAirplanesToGenerate = new JTextField();
	
	public AirportSimulatorView(AirportSimulatorModel model, AirportSimulatorController controller)
	{
		super(model, controller);

		
		// set title and window properties
		this.setTitle("Airport Simulator");
		this.setResizable(false);
		this.setLocation(100, 200);

		Handler handler = new Handler();
		
		
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        jButtonStartSimulator.setText("Start");
        jButtonStartSimulator.addActionListener(handler);
  
        jButtonStopSimulator.setText("Stop");
        jButtonStopSimulator.addActionListener(handler);

        jLabel1.setText("Number of Airplanes to Generate");
        jTextFieldNumberAirplanesToGenerate.setText(DEFAULT_NUMBER_AIRPLANES);

        jLabel2.setText("Airplane Arrival Rate");
        jTextFieldAirplaneArrivalRate.setText(DEFAULT_ARRIVAL_RATE);

        jLabel3.setText("Simulator");
        jLabel4.setText("Monitor Windows");

        jButtonAirplaneMonitor.setText("Airplanes");
        jButtonAirplaneMonitor.addActionListener(handler);

        jButtonArrivalMonitor.setText("Arrivals");
        jButtonArrivalMonitor.addActionListener(handler);
        
        jButtonDepartureMonitor.setText("Departures");
        jButtonDepartureMonitor.addActionListener(handler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAirplaneArrivalRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumberAirplanesToGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonStartSimulator)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonStopSimulator))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonDepartureMonitor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonArrivalMonitor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAirplaneMonitor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumberAirplanesToGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAirplaneArrivalRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStartSimulator)
                    .addComponent(jButtonStopSimulator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAirplaneMonitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonArrivalMonitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDepartureMonitor)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
		
	}
	
	public void modelChanged(ModelEvent event)
	{

	}

	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			((AirportSimulatorController)GetController()).SimulatorOperation(e.getActionCommand());
		}
	}
	
	

	public static void main(String[] args)
	{
		new AirportSimulatorController();
	}


}

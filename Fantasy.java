import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Fantasy {

	private JFrame frmFantasyCalculatorAlpha;
	private JTextField Kills;
	private JLabel lblTotal;
	private JTextField deaths;
	private JTextField ass;
	private JTextField tkill;
	private JTextField qkill;
	private JTextField pkill;
	private JTextField cs;
	private JLabel totalp;
	
	public static double calc(double kills, double assists, double deaths, double tkills, double qkills, double pkills, double cs)
	{
		double total;
		total = (kills * 2) + (assists * 1.5) + (tkills * 2) + (qkills * 5) + (cs * .01) + (pkills *10) + isSuperAssKill(kills, assists) - (deaths * .5);
		return total;
	}
	
	public static int isSuperAssKill(double kill, double assist)
	{
		if(kill >= 10)
		{
			return 2;
		}
		else if(assist >= 10)
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fantasy window = new Fantasy();
					window.frmFantasyCalculatorAlpha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fantasy()
	{
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFantasyCalculatorAlpha = new JFrame();
		frmFantasyCalculatorAlpha.setTitle("Fantasy Calculator Beta 2.0");
		frmFantasyCalculatorAlpha.setBounds(100, 100, 354, 436);
		frmFantasyCalculatorAlpha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFantasyCalculatorAlpha.getContentPane().setLayout(null);
		
		Kills = new JTextField();
		Kills.setText("0");
		Kills.setBounds(148, 54, 62, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(Kills);
		Kills.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					double kills = Double.parseDouble(Kills.getText());
					double assists = Double.parseDouble(ass.getText());
					double death = Double.parseDouble(deaths.getText());
					double tkills = Double.parseDouble(tkill.getText());
					double qkills = Double.parseDouble(qkill.getText());
					double pkills = Double.parseDouble(pkill.getText());
					double CS = Double.parseDouble(cs.getText());
					double points = calc(kills,assists,death,tkills,qkills,pkills,CS);
					
					totalp.setText(String.valueOf(points));
				}
				catch(NumberFormatException e)
				{
					totalp.setText("error");
				}
			}
			
			
		});
		btnCalculate.setBounds(185, 310, 97, 25);
		frmFantasyCalculatorAlpha.getContentPane().add(btnCalculate);
		
		JLabel label = new JLabel("Kills = ");
		label.setBounds(12, 54, 48, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(label);
		
		lblTotal = new JLabel("Total = ");
		lblTotal.setBounds(12, 314, 56, 16);
		frmFantasyCalculatorAlpha.getContentPane().add(lblTotal);
		
		JLabel lblDeaths = new JLabel("Deaths = ");
		lblDeaths.setBounds(12, 89, 56, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(lblDeaths);
		
		JLabel lblAssists = new JLabel("Assists = ");
		lblAssists.setBounds(12, 124, 56, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(lblAssists);
		
		JLabel lblTripleKills = new JLabel("Triple kills = ");
		lblTripleKills.setBounds(12, 159, 75, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(lblTripleKills);
		
		JLabel lblQuadraKills = new JLabel("Quadra kills = ");
		lblQuadraKills.setBounds(12, 194, 91, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(lblQuadraKills);
		
		JLabel lblPentaKills = new JLabel("Penta kills = ");
		lblPentaKills.setBounds(12, 226, 91, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(lblPentaKills);
		
		JLabel lblCs = new JLabel("CS = ");
		lblCs.setBounds(12, 261, 91, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(lblCs);
		
		deaths = new JTextField();
		deaths.setText("0");
		deaths.setColumns(10);
		deaths.setBounds(148, 89, 62, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(deaths);
		
		ass = new JTextField();
		ass.setText("0");
		ass.setColumns(10);
		ass.setBounds(148, 124, 62, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(ass);
		
		tkill = new JTextField();
		tkill.setText("0");
		tkill.setColumns(10);
		tkill.setBounds(148, 159, 62, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(tkill);
		
		qkill = new JTextField();
		qkill.setText("0");
		qkill.setColumns(10);
		qkill.setBounds(148, 194, 62, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(qkill);
		
		pkill = new JTextField();
		pkill.setText("0");
		pkill.setColumns(10);
		pkill.setBounds(148, 229, 62, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(pkill);
		
		cs = new JTextField();
		cs.setText("0");
		cs.setColumns(10);
		cs.setBounds(148, 264, 62, 22);
		frmFantasyCalculatorAlpha.getContentPane().add(cs);
		
		totalp = new JLabel("");
		totalp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		totalp.setBounds(80, 314, 56, 16);
		frmFantasyCalculatorAlpha.getContentPane().add(totalp);
	}
}

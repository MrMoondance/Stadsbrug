import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField blij;
	private JTextField bang;
	private JTextField boos;
	private JTextField bedroefd;
	private JTextField beschaamd;
	JTextArea opmerkingen;
	JComboBox<String> activiteit;
	JTextArea overig;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 805, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		blij = new JTextField();
		blij.setBounds(119, 11, 86, 20);
		frame.getContentPane().add(blij);
		blij.setColumns(10);
		
		bang = new JTextField();
		bang.setBounds(119, 42, 86, 20);
		frame.getContentPane().add(bang);
		bang.setColumns(10);
		
		boos = new JTextField();
		boos.setBounds(119, 73, 86, 20);
		frame.getContentPane().add(boos);
		boos.setColumns(10);
		
		bedroefd = new JTextField();
		bedroefd.setBounds(119, 104, 86, 20);
		frame.getContentPane().add(bedroefd);
		bedroefd.setColumns(10);
		
		beschaamd = new JTextField();
		beschaamd.setBounds(119, 136, 86, 20);
		frame.getContentPane().add(beschaamd);
		beschaamd.setColumns(10);
		
		JButton opslaan = new JButton("Opslaan");
		opslaan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO hier info verzamelen uit de textfields met .getText()
			}
		});
		opslaan.setBounds(678, 11, 101, 44);
		frame.getContentPane().add(opslaan);
		
		opmerkingen = new JTextArea();
		opmerkingen.setBounds(31, 179, 371, 218);
		frame.getContentPane().add(opmerkingen);
		
		
		activiteit = new JComboBox<String>(new String[] {"werk", "sociaal", "sporten", "reizen", "relaxen", "overig"});
		activiteit.setBounds(404, 14, 210, 84);
		frame.getContentPane().add(activiteit);		
		overig = new JTextArea();
		
		activiteit.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        if (activiteit.getSelectedItem().toString() == "overig") {
		        	
		        	JLabel lblOverig = new JLabel("Overig:");
		        	lblOverig.setBounds(404, 70, 210, 84);
		        	frame.getContentPane().add(lblOverig);
		        	overig.setVisible(true);
		    		overig.setBounds(404, 120, 210, 30);
		    		frame.getContentPane().add(overig);
		        }
		       
		    }
		});
		
		
		JLabel lblBlij = new JLabel("blij");
		lblBlij.setBounds(31, 14, 78, 14);
		frame.getContentPane().add(lblBlij);
		
		JLabel lblBang = new JLabel("bang");
		lblBang.setBounds(31, 45, 78, 14);
		frame.getContentPane().add(lblBang);
		
		JLabel lblBoos = new JLabel("boos");
		lblBoos.setBounds(31, 76, 78, 14);
		frame.getContentPane().add(lblBoos);
		
		JLabel lblBedroefd = new JLabel("bedroefd");
		lblBedroefd.setBounds(31, 107, 78, 14);
		frame.getContentPane().add(lblBedroefd);
		
		JLabel lblBeschaamd = new JLabel("beschaamd");
		lblBeschaamd.setBounds(31, 138, 78, 14);
		frame.getContentPane().add(lblBeschaamd);
		
		JLabel lblActiviteit = new JLabel("Activiteit:");
		lblActiviteit.setBounds(301, 45, 101, 14);
		frame.getContentPane().add(lblActiviteit);
	}	
}

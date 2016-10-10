import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tyre {

	private JFrame frmTyre;

	/**
	 * Launch the application.
	 */
	public static void tyre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tyre window = new Tyre();
					window.frmTyre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tyre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTyre = new JFrame();
		frmTyre.setTitle("Tyre");
		frmTyre.setBounds(100, 100, 260, 172);
		frmTyre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTyre.getContentPane().setLayout(null);
		
		JLabel lblBrand = new JLabel("Brand:");
		lblBrand.setBounds(16, 20, 61, 16);
		frmTyre.getContentPane().add(lblBrand);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Goodyear", "Michelin", "Hankook", "Nankang", "LingLong", "Triangle Plus"}));
		comboBox.setBounds(91, 16, 150, 27);
		frmTyre.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Size:");
		lblNewLabel.setBounds(16, 46, 61, 16);
		frmTyre.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"205 / 55 R16", "215 / 60 R16", "215 / 45 R17", "215 / 55 R17", "225 / 40 R18", "245 / 45 R18"}));
		comboBox_1.setBounds(91, 42, 150, 27);
		frmTyre.getContentPane().add(comboBox_1);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Your service is confirmed.");
			    
				frmTyre.setVisible(false);
				
			}
		});
		btnConfirm.setBounds(124, 81, 117, 29);
		frmTyre.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmTyre.dispose();
			}
		});
		btnBack.setBounds(124, 104, 117, 29);
		frmTyre.getContentPane().add(btnBack);
	}

}

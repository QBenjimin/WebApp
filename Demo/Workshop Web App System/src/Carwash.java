import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Carwash {

	private JFrame frmCarwash;

	/**
	 * Launch the application.
	 */
	public static void cw() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carwash window = new Carwash();
					window.frmCarwash.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Carwash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarwash = new JFrame();
		frmCarwash.setTitle("Carwash");
		frmCarwash.setBounds(100, 100, 273, 182);
		frmCarwash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarwash.getContentPane().setLayout(null);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(6, 19, 61, 16);
		frmCarwash.getContentPane().add(lblType);
		
		JTextField type = new JTextField();
		type.setBounds(91, 67, 235, 28);
		frmCarwash.getContentPane().add(null, "Type:");
		type.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(264, 146, 61, 16);
		frmCarwash.getContentPane().add(label);
		
		JLabel lblCarSize = new JLabel("Car Size:");
		lblCarSize.setBounds(6, 57, 61, 16);
		frmCarwash.getContentPane().add(lblCarSize);
		
		
		
		final JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Your service is confirmed.");
			    
				frmCarwash.setVisible(false);
				
			}
		});
		
		btnConfirm.setBounds(6, 114, 117, 29);
		frmCarwash.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmCarwash.dispose();
			}
		});
		btnBack.setBounds(135, 114, 117, 29);
		frmCarwash.getContentPane().add(btnBack);
		
		JComboBox cbType = new JComboBox();
		
		cbType.setModel(new DefaultComboBoxModel(new String[] {"Inner", "Outer"}));
		cbType.setBounds(88, 15, 163, 27);
		frmCarwash.getContentPane().add(cbType);
		
		JComboBox cbSize = new JComboBox();
		cbSize.setModel(new DefaultComboBoxModel(new String[] {"Small", "Medium", "Large"}));
		cbSize.setBounds(88, 53, 163, 27);
		frmCarwash.getContentPane().add(cbSize);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingDetails extends JFrame implements ActionListener {

	private JFrame frmBookingDetails;

	/**
	 * Launch the application.
	 */
	public static void bd() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingDetails window = new BookingDetails();
					window.frmBookingDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookingDetails = new JFrame();
		frmBookingDetails.setTitle("Booking Details");
		frmBookingDetails.setBounds(100, 100, 423, 228);
		frmBookingDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookingDetails.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type Of Service");
		lblNewLabel.setBounds(25, 26, 112, 16);
		frmBookingDetails.getContentPane().add(lblNewLabel);
		
		JLabel lblDateRequired = new JLabel("Date required");
		lblDateRequired.setBounds(25, 62, 100, 23);
		frmBookingDetails.getContentPane().add(lblDateRequired);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(149, 57, 213, 28);
		frmBookingDetails.getContentPane().add(dateChooser);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(25, 97, 75, 16);
		frmBookingDetails.getContentPane().add(lblTime);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"General Servicing", "Tyre Service", "Carwash Service"}));
		comboBox.setBounds(149, 22, 213, 27);
		frmBookingDetails.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0800 - 1000 hrs", "1000 - 1200 hrs", "1300 - 1500 hrs", "1500 - 1700 hrs"}));
		comboBox_1.setBounds(149, 93, 213, 27);
		frmBookingDetails.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {

				Receipt r = new Receipt();
				r.Rc();
				frmBookingDetails.setVisible(false);
			}
		});
		
		btnNewButton.setBounds(242, 141, 117, 29);
		frmBookingDetails.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmBookingDetails.setVisible(false);
				
			
			}
		});
		btnBack.setBounds(245, 170, 117, 29);
		frmBookingDetails.getContentPane().add(btnBack);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(366, 21, 51, 29);
		frmBookingDetails.getContentPane().add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receipt {

	public static Object txaServices;
	private JFrame frmReceipt;
	private JTextField txfDate;
	private JTextField txfTime;
	private JTextField txfBID;
	private JTextField txfTotal;
	private JTextField textFieldSvs;

	/**
	 * Launch the application.
	 */
	public static void Rc() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt window = new Receipt();
					window.frmReceipt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Receipt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReceipt = new JFrame();
		frmReceipt.setTitle("Receipt");
		frmReceipt.setBounds(100, 100, 279, 300);
		frmReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReceipt.getContentPane().setLayout(null);

		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(18, 51, 45, 16);
		frmReceipt.getContentPane().add(lblDate);

		txfDate = new JTextField();
		txfDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txfDate.setEditable(false);
		txfDate.setBounds(123, 45, 134, 28);
		frmReceipt.getContentPane().add(txfDate);
		txfDate.setColumns(10);

		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(18, 79, 61, 16);
		frmReceipt.getContentPane().add(lblTime);


		txfTime = new JTextField();
		txfTime.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});
		txfTime.setEditable(false);
		txfTime.setBounds(123, 73, 134, 28);
		frmReceipt.getContentPane().add(txfTime);
		txfTime.setColumns(10);

		JLabel lblBID = new JLabel("Booking ID:");
		lblBID.setBounds(18, 23, 78, 16);
		frmReceipt.getContentPane().add(lblBID);


		txfBID = new JTextField();
		txfBID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txfBID.setEditable(false);
		txfBID.setBounds(123, 17, 134, 28);
		frmReceipt.getContentPane().add(txfBID);
		txfBID.setColumns(10);

		JLabel lblServices = new JLabel("Services:");
		lblServices.setBounds(18, 116, 61, 16);
		frmReceipt.getContentPane().add(lblServices);

		textFieldSvs = new JTextField();
		textFieldSvs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BookingDetails book = new BookingDetails();
				book.bd();
			}
		});
		textFieldSvs.setBounds(123, 110, 134, 69);
		frmReceipt.getContentPane().add(textFieldSvs);
		textFieldSvs.setColumns(10);


		JLabel lblTotalPayable = new JLabel("Total payable:");
		lblTotalPayable.setBounds(18, 197, 88, 16);
		frmReceipt.getContentPane().add(lblTotalPayable);

		txfTotal = new JTextField();
		txfTotal.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}

		});


		txfTotal.setEditable(false);
		txfTotal.setText("$ ");
		txfTotal.setBounds(123, 191, 134, 28);
		frmReceipt.getContentPane().add(txfTotal);
		txfTotal.setColumns(10);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Your booking has been saved. You will now be directed back to the homepage.");

				frmReceipt.setVisible(false);

				Menu m = new Menu();
				m.menu();

			}
		});

		btnConfirm.setBounds(6, 243, 117, 29);
		frmReceipt.getContentPane().add(btnConfirm);

		final JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(e.getSource() == btnBack){

					frmReceipt.setVisible(false);
				}
			}

		});
		btnBack.setBounds(146, 243, 117, 29);
		frmReceipt.getContentPane().add(btnBack);
	}

	private Object getSelectedItem(JComboBox comboBox) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}

	public void ConnectDatabase(){
	}
}



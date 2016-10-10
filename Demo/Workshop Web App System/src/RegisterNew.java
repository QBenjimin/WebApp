import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterNew extends Login{

	private JFrame frmRegistration;
	private JTextField textFieldName;
	private JTextField textField_Address2;
	private JTextField textField_Address1;
	private JTextField textField_IC;
	private JTextField textField_other;
	private JTextField textField_model;
	public JButton btnBack;
	
	
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterNew window = new RegisterNew();
					window.frmRegistration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegisterNew() {
		initialize();

	}

	public void initialize(){
		frmRegistration = new JFrame();
		frmRegistration.setTitle("Registration");
		frmRegistration.setBounds(100, 100, 433, 354);
		frmRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistration.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(20, 19, 79, 16);
		frmRegistration.getContentPane().add(lblNewLabel);

		textFieldName = new JTextField();
		textFieldName.setBounds(124, 13, 295, 28);
		frmRegistration.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 48, 61, 16);
		frmRegistration.getContentPane().add(lblAddress);

		textField_Address2 = new JTextField();
		textField_Address2.setBounds(124, 42, 295, 28);
		frmRegistration.getContentPane().add(textField_Address2);
		textField_Address2.setColumns(10);
		

		

		textField_Address1 = new JTextField();
		textField_Address1.setColumns(10);
		textField_Address1.setBounds(124, 69, 295, 28);
		frmRegistration.getContentPane().add(textField_Address1);

		JLabel lblIcNumber = new JLabel("IC Number");
		lblIcNumber.setBounds(20, 107, 79, 16);
		frmRegistration.getContentPane().add(lblIcNumber);
		
		textField_IC = new JTextField();
		textField_IC.setColumns(10);
		textField_IC.setBounds(124, 101, 148, 28);
		frmRegistration.getContentPane().add(textField_IC);


		
		JLabel lblCarBrand = new JLabel("Car Brand");
		lblCarBrand.setBounds(20, 135, 79, 16);
		frmRegistration.getContentPane().add(lblCarBrand);

		JComboBox comboBox_Brand = new JComboBox();
		comboBox_Brand.setModel(new DefaultComboBoxModel(new String[] {"Toyota", "Honda", "Mazda", "Nissan", "Suzuki"}));
		comboBox_Brand.setMaximumRowCount(100);
		comboBox_Brand.setBounds(124, 131, 148, 27);
		frmRegistration.getContentPane().add(comboBox_Brand);

		JLabel lblOther = new JLabel("Other");
		lblOther.setBounds(20, 165, 61, 16);
		frmRegistration.getContentPane().add(lblOther);

		textField_other = new JTextField();
		textField_other.setBounds(124, 159, 148, 28);
		frmRegistration.getContentPane().add(textField_other);
		textField_other.setColumns(10);

		JLabel lblCarModel = new JLabel("Car Model/Year");
		lblCarModel.setBounds(20, 195, 102, 16);
		frmRegistration.getContentPane().add(lblCarModel);
		

		textField_model = new JTextField();
		textField_model.setColumns(10);
		textField_model.setBounds(124, 189, 148, 28);
		frmRegistration.getContentPane().add(textField_model);
		



		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(textFieldName.getText() != null && textFieldName.getText().equals("") && textField_Address2.getText() != null && textField_Address2.getText().equals("") && 
						textField_IC.getText() != null && textField_IC.getText().equals("") && textField_model.getText() != null && textField_model.getText().equals("")){
					
				    JOptionPane.showMessageDialog(null, "Field cannot be empty");    
				    
				    dispose();
				}

				else{
					JOptionPane.showMessageDialog(null, "Registration completed. Proceed to Booking.");
					BookingDetails book = new BookingDetails();
					book.bd();
				
					frmRegistration.dispose();
				}
				
				
				
			}
		});

		btnRegister.setBounds(302, 269, 117, 29);
		frmRegistration.getContentPane().add(btnRegister);

		final JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack){

					    
					    JFrame frame = new JFrame();
					    int answer = JOptionPane.showConfirmDialog(null, "Are you sure?");

					    if(answer == JOptionPane.YES_OPTION){
					    
					    dispose();
					    frmRegistration.setVisible(false);

					    	
					    }
					    
					    else {
					    	
					    	dispose();
					    	
					    }
					    
					  }

					}

				
				
			}
		);

		btnBack.setBounds(302, 297, 117, 29);
		frmRegistration.getContentPane().add(btnBack);
		}
	

	public static void invokeSomeMethod() {
		// TODO Auto-generated method stub
		
	}
}


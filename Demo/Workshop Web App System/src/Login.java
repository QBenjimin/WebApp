import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener{

	private static JFrame frmLoginPage;
	private static JTextField textField;
	private static JPasswordField passwordField;

	Connection conn;
	Statement st;
	ResultSet rs;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}

	public Login() {
		initialize();
		//ConnectDb();
	}

	

	public void initialize() {


		frmLoginPage = new JFrame();
		frmLoginPage.setTitle("Login Page");
		frmLoginPage.setBounds(100, 100, 469, 222);
		frmLoginPage.getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(6, 73, 84, 16);
		frmLoginPage.getContentPane().add(lblUsername);

		textField = new JTextField();
		textField.setBounds(91, 67, 235, 28);
		frmLoginPage.getContentPane().add(textField);
		textField.setColumns(10);


		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(6, 101, 61, 16);
		frmLoginPage.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(91, 95, 235, 28);
		frmLoginPage.getContentPane().add(passwordField);
		
		

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});  


		btnExit.setBounds(359, 163, 104, 29);
		frmLoginPage.getContentPane().add(btnExit);

		JButton btnQrLogin = new JButton("QR Login");
		btnQrLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				QR_Login qr = new QR_Login();
				qr.QR();
				

			}
		});
		
		btnQrLogin.setBounds(135, 163, 117, 29);
		frmLoginPage.getContentPane().add(btnQrLogin);

		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText() != null && textField.getText().equals("")
					&& passwordField.getText() != null && passwordField.getText().equals("")){
				
					
				
				    JOptionPane.showMessageDialog(null, "Field cannot be empty");    
				    
				    dispose();
					}
				
			
				else{

						dispose();
						BookingDetails book = new BookingDetails();
						book.bd();
				}
				
				
				}
		});

		btnLogin.setBounds(6, 163, 117, 29);
		frmLoginPage.getContentPane().add(btnLogin);

		final JButton btnSignUp = new JButton("+ Sign Up");
		btnSignUp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dispose();

				RegisterNew rn = new RegisterNew();
				rn.NewScreen();
				
			}
		});

		btnSignUp.setBounds(346, 6, 117, 29);
		frmLoginPage.getContentPane().add(btnSignUp);

		final JCheckBox chckbxShowPassword = new JCheckBox("show password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxShowPassword.isSelected()){     
				     
					passwordField.setEchoChar((char)0);
					
//					while(rs.next()){
//						dbUsername = rs.getString("username");
//						dbPassword = rs.getString("password");
//					}
//				     
				    }
				else{     
				     passwordField.setEchoChar('*');
				    }
			
			}
		});
		chckbxShowPassword.setBounds(91, 120, 134, 23);
		frmLoginPage.getContentPane().add(chckbxShowPassword);


		JLabel lblNewLabel = new JLabel("Please enter username and password to proceed with booking..");
		lblNewLabel.setBounds(6, 47, 448, 16);
		frmLoginPage.getContentPane().add(lblNewLabel);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void ConnectDb() {

		try {
			
			//String dbname = "workshopmanagementdatabase";
			String dburl = "jdbc:mysql://localhost:3307/workhopmanagement_login";  
			String dbusername = "root"; // Change to your username if you have mysql (eg root)
			String dbpassword = "mysql"; // Change to your password if you have mysql (eg root)

			st = conn.createStatement();
			String SQL = "SELECT * from username";
			rs = st.executeQuery(SQL);
			
			rs.next();
			String user_name = rs.getString("Username");
			String password = rs.getString("Password");
			
			System.out.println("Connection Established!");
			
		} catch (SQLException err) {
			JOptionPane.showMessageDialog(null, "Username/Password combination is incorrect. Please try again.");
		}
		
	}
	

}

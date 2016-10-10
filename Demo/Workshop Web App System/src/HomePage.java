import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class HomePage {

	private JFrame frmHome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.setTitle("Home");
		frmHome.setBounds(100, 100, 450, 300);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(180, 16, 117, 29);
		frmHome.getContentPane().add(btnAbout);
		
		JButton btnContactUs = new JButton("Contact Us");
		btnContactUs.setBounds(309, 16, 117, 29);
		frmHome.getContentPane().add(btnContactUs);
		
		textField = new JTextField();
		textField.setBounds(22, 62, 404, 173);
		frmHome.getContentPane().add(textField);
		textField.setColumns(10);
	}

}

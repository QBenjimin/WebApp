import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void menu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 222, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnProfile = new JButton("View Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProfile.setBounds(42, 28, 137, 29);
		contentPane.add(btnProfile);

		JButton btnViewReceipt = new JButton("View Receipt");
		btnViewReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);

				Receipt r = new Receipt();
				r.Rc();
				
				
			}
		});
		btnViewReceipt.setBounds(42, 56, 137, 29);
		contentPane.add(btnViewReceipt);

		JButton btnLocation = new JButton("Location");
		btnLocation.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.google.com.bn/maps/dir/4.9023767,114.9358288/4.8937548,114.9089722/@4.9013817,114.9222648,15z/am=t/data=!3m1!4b1").toURI());	
					
				} catch (MalformedURLException ex) {
					Logger.getLogger(Menu.class.getName()).log(Level.SEVERE,null, ex);
				}
				catch (URISyntaxException ex) {
					Logger.getLogger(Menu.class.getName()).log(Level.SEVERE,null, ex);
				}
				catch (IOException ex) {
					Logger.getLogger(Menu.class.getName()).log(Level.SEVERE,null, ex);
				}							

			}	
		
	});



		btnLocation.setBounds(42, 111, 137, 29);
		contentPane.add(btnLocation);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int selectedOption = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout and exit?","Confirm", JOptionPane.YES_NO_OPTION);
				if(selectedOption == JOptionPane.YES_OPTION){

					
					System.exit(0);
				}

			}

		});



		btnLogout.setBounds(42, 137, 137, 29);
		contentPane.add(btnLogout);

		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "SICTFYP4201, Members: Nur Abdul Sabur, Hamizah, Nuur Atiqah");
			}
		});
		btnAbout.setBounds(42, 84, 137, 29);
		contentPane.add(btnAbout);


}


}

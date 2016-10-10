import java.awt.EventQueue;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QR_Login {

	private JFrame frmSignIn;

	/**
	 * Launch the application.
	 */
	public static void QR() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QR_Login window = new QR_Login();
					window.frmSignIn.setVisible(true);

				}catch (Exception e) {
				}

			}
		});
	}







	/**
	  Create the application.
*/
	
	public QR_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
*/
	private void initialize() {
		frmSignIn = new JFrame();
		frmSignIn.setTitle("Sign In");
		frmSignIn.setBounds(100, 100, 288, 267);
		frmSignIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignIn.getContentPane().setLayout(null);

		JLabel lblScanYourQr = new JLabel("Scan your QR in the box below to sign in");
		lblScanYourQr.setBounds(16, 18, 266, 16);
		frmSignIn.getContentPane().add(lblScanYourQr);

		final JEditorPane editorPane = new JEditorPane();
		editorPane.setContentType("");
		editorPane.setBounds(16, 55, 250, 142);
		frmSignIn.getContentPane().add(editorPane);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmSignIn.dispose();

			}


		});
		btnBack.setBounds(183, 209, 92, 29);
		frmSignIn.getContentPane().add(btnBack);
		
		JButton btnScan = new JButton("Select");
		btnScan.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
	                JFileChooser openFile = new JFileChooser();
	                
	                int returnVal = openFile.showOpenDialog(null);
	                
	                if(returnVal == JFileChooser.APPROVE_OPTION){
	                	File file = openFile.getSelectedFile();
	                	String path = file.getAbsolutePath();
	                	
	                	String extension = getExtensionForFilter(openFile.getFileFilter());
	                	
	                	
	                	
	                				
	                } else {
	                	JOptionPane.showConfirmDialog(null, "File access cancelled.");
	                }
	                
	                
			
			}

				private String getExtensionForFilter(FileFilter fileFilter) {
					// TODO Auto-generated method stub
					return null;
				}
		});
		btnScan.setBounds(6, 209, 92, 29);
		frmSignIn.getContentPane().add(btnScan);
	}
}

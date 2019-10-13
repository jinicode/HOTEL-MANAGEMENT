import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ManagerLogin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerLogin window = new ManagerLogin();
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
	public ManagerLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JFrame frame1 = new JFrame("JPasswordField Demo");
		JLabel lblLoginWithCorrect = new JLabel("Login to access Receptionist's Account");
		lblLoginWithCorrect.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLoginWithCorrect.setBounds(95, 11, 377, 52);
		frame.getContentPane().add(lblLoginWithCorrect);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblUsername.setBounds(286, 107, 146, 59);
		frame.getContentPane().add(lblUsername);
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(292, 199, 140, 52);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		Image image=new ImageIcon(this.getClass().getResource("/login24.png")).getImage();
		btnLogin.setIcon(new ImageIcon(image));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField_1.getText().toString();
				String password=textField_2.getText().toString();
				String j="jinit";
				if(username.equals(j) && password.equals(j))
				{   
					JOptionPane.showMessageDialog( frame1,"Succesfully Logged In");	
					
					System.out.println("hello");
				}else
				{
					JOptionPane.showMessageDialog( frame1,"Failed to log In");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBounds(230, 304, 128, 52);
		frame.getContentPane().add(btnLogin);
		
		textField_1 = new JTextField();
		textField_1.setBounds(413, 119, 179, 43);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(413, 199, 177, 40);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRec = new JLabel("");
		Image image3=new ImageIcon(this.getClass().getResource("/recep128.png")).getImage();
		lblRec.setIcon(new ImageIcon(image3));
		lblRec.setBounds(49, 90, 128, 172);
		frame.getContentPane().add(lblRec);
		
		
		
		
	}
}

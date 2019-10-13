import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffLogin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLogin window = new StaffLogin();
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
	public StaffLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame1 = new JFrame("JPasswordField Demo");
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStaffLogin = new JLabel("Staff Login");
		lblStaffLogin.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblStaffLogin.setBounds(194, 22, 179, 34);
		frame.getContentPane().add(lblStaffLogin);
		
		JLabel lblStaffName = new JLabel("Staff Name:");
		lblStaffName.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblStaffName.setBounds(154, 126, 126, 34);
		frame.getContentPane().add(lblStaffName);
		
		textField = new JTextField();
		textField.setBounds(290, 125, 226, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblPassword.setBounds(165, 225, 115, 42);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(290, 229, 226, 41);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		Image image=new ImageIcon(this.getClass().getResource("/login24.png")).getImage();
		btnLogin.setIcon(new ImageIcon(image));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String password=textField_1.getText();
				String j="jinit";
				if(name.equals(j) && password.equals(j)) {
						JOptionPane.showMessageDialog( frame1,"Succesfully Logged In");	
					
					System.out.println("hello");
				}else
				{
					JOptionPane.showMessageDialog( frame1,"Failed to log In");
				}
			}
		});
		btnLogin.setBounds(194, 304, 120, 34);
		frame.getContentPane().add(btnLogin);
		
		JLabel label = new JLabel("");
		Image image4=new ImageIcon(this.getClass().getResource("/staff128.png")).getImage();
		label.setIcon(new ImageIcon(image4));
		label.setBounds(10, 102, 134, 204);
		frame.getContentPane().add(label);
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerLogin {

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
					CustomerLogin window = new CustomerLogin();
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
	public CustomerLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame1 = new JFrame("JPasswordField Demo");
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWelcomeDearCustomer = new JLabel("Welcome  dear Customer");
		lblWelcomeDearCustomer.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblWelcomeDearCustomer.setBounds(115, 21, 347, 72);
		frame.getContentPane().add(lblWelcomeDearCustomer);

		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblId.setBounds(215, 225, 136, 42);
		frame.getContentPane().add(lblId);

		JLabel lblRoomNo = new JLabel("Room No:");
		lblRoomNo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRoomNo.setBounds(144, 129, 136, 42);
		frame.getContentPane().add(lblRoomNo);

		JButton btnLogin = new JButton("Login");
		Image image=new ImageIcon(this.getClass().getResource("/login24.png")).getImage();
		btnLogin.setIcon(new ImageIcon(image));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roomno = textField.getText();
				String Id = textField_1.getText();
				String i = "101";
				String j = "101";
				String k = "102";
				String l = "103";
				String m="jinit";
//				if((roomno.equals(j) && Id.equals(j))||(roomno.equals(k) && Id.equals(k))||(roomno.equals(l) && Id.equals(l))) {
//						JOptionPane.showMessageDialog( frame1,"Succesfully Logged In");	
//						CustomerSupport customerSupport=new CustomerSupport(roomid);
//						customerSupport.main(null);
//					
//					System.out.println("hello");
//				}else
//				{
//					JOptionPane.showMessageDialog( frame1,"Failed to log In");
//				}
				if ((roomno.equals(j) && Id.equals(m))) {
					int roomid = 101;
					CustomerSupport customerSupport = new CustomerSupport(roomid);

				} else if ((roomno.equals(k) && Id.equals(m))) {
					int roomid = 102;
					CustomerSupport customerSupport = new CustomerSupport(roomid);
				} else if ((roomno.equals(l) && Id.equals(m))) {
					int roomid = 103;
					CustomerSupport customerSupport = new CustomerSupport(roomid);
				} else if ((roomno.equals(i) && Id.equals(m))) {
					int roomid = 103;
					CustomerSupport customerSupport = new CustomerSupport(roomid);
				} else {
					JOptionPane.showMessageDialog(frame1, "Failed to log In");
				}

			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogin.setBounds(166, 306, 185, 48);
		frame.getContentPane().add(btnLogin);

		textField = new JTextField();
		textField.setBounds(279, 129, 246, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(279, 232, 246, 35);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFam = new JLabel("");
		Image image2=new ImageIcon(this.getClass().getResource("/fam64.png")).getImage();
		lblFam.setIcon(new ImageIcon(image2));
		lblFam.setBounds(25, 158, 96, 98);
		frame.getContentPane().add(lblFam);
	}

}

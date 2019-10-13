import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hotellayout extends JPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotellayout window = new hotellayout();
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
	public hotellayout() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("MenuItem.selectionBackground"));
		frame.setBounds(100, 100, 547, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblJejajiClubs = new JLabel("THE HARBOUR HOTEL");
		lblJejajiClubs.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblJejajiClubs.setBounds(176, 11, 280, 57);
		frame.getContentPane().add(lblJejajiClubs);

		JButton btnManager = new JButton("RECEPTIONIST ");
		Image image=new ImageIcon(this.getClass().getResource("/receptionist-icon24.png")).getImage();
		btnManager.setIcon(new ImageIcon(image));
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerLogin managerLogin = new ManagerLogin();
				managerLogin.main(null);
				System.out.println("hello");
			}
		});
		btnManager.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnManager.setBounds(186, 67, 208, 51);
		frame.getContentPane().add(btnManager);

		JButton btnStaff = new JButton("STAFF LOGIN");
		Image image1=new ImageIcon(this.getClass().getResource("/staff24.png")).getImage();
		btnStaff.setIcon(new ImageIcon(image1));
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin staffLogin=new StaffLogin();
				staffLogin.main(null);
			}
		});
		btnStaff.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnStaff.setBounds(186, 129, 208, 51);
		frame.getContentPane().add(btnStaff);

		JButton btnCustomer = new JButton("CUSTOMER");
		
		Image image2=new ImageIcon(this.getClass().getResource("/family24.png")).getImage();
		btnCustomer.setIcon(new ImageIcon(image2));
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin customerLogin=new CustomerLogin();
				customerLogin.main(null);
			}
		});
		btnCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCustomer.setBounds(186, 191, 208, 51);
		frame.getContentPane().add(btnCustomer);

		JLabel lblNewLabel = new JLabel("© Go-Soft Pvt Ltd.");
		
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(213, 341, 156, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBookARoom = new JButton("BOOK A ROOM");
		Image image3=new ImageIcon(this.getClass().getResource("/roomfinal.png")).getImage();
		btnBookARoom.setIcon(new ImageIcon(image3));
		btnBookARoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomAvailability roomAvailability=new RoomAvailability();
				roomAvailability.main(null);
			}
		});
		btnBookARoom.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnBookARoom.setBounds(186, 253, 208, 49);
		frame.getContentPane().add(btnBookARoom);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(240, 230, 140));
		Image image4=new ImageIcon(this.getClass().getResource("/hotel128.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image4));
		lblNewLabel_1.setBounds(30, 24, 126, 202);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

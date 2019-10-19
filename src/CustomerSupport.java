import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;

public class CustomerSupport {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CustomerSupport window = new CustomerSupport();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});

		int a = 0;
		CustomerSupport window = new CustomerSupport(a);
		window.frame.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public CustomerSupport(int a) {
		frame = new JFrame();
		frame.setBounds(100, 50, 784, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setBounds(41, 11, 700, 571);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(120, 45, 83, 27);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblMenu);

		JCheckBox chckbxBurger = new JCheckBox("Burger");
		chckbxBurger.setBackground(new Color(124, 252, 0));
		chckbxBurger.setForeground(new Color(0, 0, 0));
		chckbxBurger.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxBurger.setBounds(6, 102, 99, 42);
		panel.add(chckbxBurger);

		JCheckBox chckbxPizza = new JCheckBox("Pizza");
		chckbxPizza.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxPizza.setBackground(new Color(124, 252, 0));
		chckbxPizza.setBounds(6, 170, 99, 34);
		panel.add(chckbxPizza);

		JCheckBox chckbxCheeseGarlicBread = new JCheckBox("Sandwich");
		chckbxCheeseGarlicBread.setBackground(new Color(124, 252, 0));
		chckbxCheeseGarlicBread.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxCheeseGarlicBread.setBounds(6, 236, 118, 34);
		panel.add(chckbxCheeseGarlicBread);

		JCheckBox chckbxMasalaDosa = new JCheckBox("Dosa");
		chckbxMasalaDosa.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxMasalaDosa.setBackground(new Color(124, 252, 0));
		chckbxMasalaDosa.setBounds(6, 292, 118, 34);
		panel.add(chckbxMasalaDosa);

		JCheckBox chckbxPavBhaji = new JCheckBox("Pav Bhaji");
		chckbxPavBhaji.setBackground(new Color(124, 252, 0));
		chckbxPavBhaji.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxPavBhaji.setBounds(6, 348, 118, 34);
		panel.add(chckbxPavBhaji);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner.setBounds(213, 113, 61, 20);
		panel.add(spinner);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner_1.setBounds(213, 177, 61, 20);
		panel.add(spinner_1);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner_2.setBounds(213, 237, 61, 20);
		panel.add(spinner_2);

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner_3.setBounds(213, 293, 61, 20);
		panel.add(spinner_3);

		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner_4.setBounds(213, 349, 61, 20);
		panel.add(spinner_4);

		JLabel lblRs = new JLabel("80 Rs");
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRs.setBounds(132, 107, 71, 27);
		panel.add(lblRs);

		JLabel lblRs_1 = new JLabel("100 Rs");
		lblRs_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRs_1.setBounds(132, 174, 71, 27);
		panel.add(lblRs_1);

		JLabel lblRs_2 = new JLabel("60 Rs");
		lblRs_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRs_2.setBounds(130, 236, 71, 27);
		panel.add(lblRs_2);

		JLabel lblRs_3 = new JLabel("50 Rs");
		lblRs_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRs_3.setBounds(132, 292, 71, 27);
		panel.add(lblRs_3);

		JLabel lblRs_4 = new JLabel("120 Rs");
		lblRs_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRs_4.setBounds(132, 352, 71, 27);
		panel.add(lblRs_4);

		JButton btnOrder = new JButton("Order");
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOrder.setBounds(105, 403, 108, 34);
		panel.add(btnOrder);

		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblReceipt.setBounds(505, 70, 108, 27);
		panel.add(lblReceipt);

		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTax.setBounds(412, 147, 77, 27);
		panel.add(lblTax);

		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblSubTotal.setBounds(412, 211, 139, 42);
		panel.add(lblSubTotal);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTotal.setBounds(412, 286, 77, 50);
		panel.add(lblTotal);

		JLabel lblThankYou = new JLabel("Thank You");
		Image image=new ImageIcon(this.getClass().getResource("/thankyou.png")).getImage();
		lblThankYou.setIcon(new ImageIcon(image));
		lblThankYou.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblThankYou.setBounds(505, 380, 177, 42);
		panel.add(lblThankYou);

		JLabel label_4 = new JLabel("0");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(579, 150, 49, 26);
		panel.add(label_4);

		JLabel label_5 = new JLabel("0");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(579, 227, 49, 26);
		panel.add(label_5);

		JLabel label_6 = new JLabel("0");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(579, 300, 49, 26);
		panel.add(label_6);

		JLabel lblExtras = new JLabel("Extras");
		lblExtras.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblExtras.setBounds(35, 448, 70, 50);
		panel.add(lblExtras);

		textField = new JTextField();
		textField.setBounds(131, 458, 131, 39);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblComplain = new JLabel("Complain");
		lblComplain.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblComplain.setBounds(28, 520, 96, 40);
		panel.add(lblComplain);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 520, 131, 39);
		panel.add(textField_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(132, 7, 71, 27);
		panel.add(lblNewLabel);
		lblNewLabel.setText("" + a);
		
		JLabel lblFood = new JLabel("");
		Image image1=new ImageIcon(this.getClass().getResource("/food164.png")).getImage();
		lblFood.setIcon(new ImageIcon(image1));
		lblFood.setBounds(251, 31, 93, 71);
		panel.add(lblFood);
		
		JLabel label_8 = new JLabel("");
		Image image2=new ImageIcon(this.getClass().getResource("/food264.png")).getImage();
		label_8.setIcon(new ImageIcon(image2));
		label_8.setBounds(17, 24, 93, 71);
		panel.add(label_8);
		 
		JFrame frame1 = new JFrame("Manager Logn");
		frame1.setTitle("Manager Login");
		
		JButton btnCheckout = new JButton("CheckOut");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root",
							"root");
					String rom=(""+a).toString();
					PreparedStatement pr = con.prepareStatement("delete from bookedroom where roomno=? ");
					PreparedStatement pr1 = con.prepareStatement("delete from staff where roomno=? ");
					pr.setString(1, rom);
					pr1.setString(1,rom );
					 pr.executeUpdate();
					pr1.executeUpdate();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				

				JOptionPane.showMessageDialog( frame1,"Our staff would reach out to you soon sir.");
			}
		});
		btnCheckout.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnCheckout.setBounds(487, 466, 164, 42);
		panel.add(btnCheckout);
		
		JLabel lblItIsUor = new JLabel("It is our pleasure to serve you!");
		lblItIsUor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblItIsUor.setBounds(287, 520, 378, 31);
		panel.add(lblItIsUor);

		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total = 0;

				String items = "";
				if (chckbxBurger.isSelected()) {
					for (int i = 1; i <= (Integer) spinner.getValue(); i++) {
						total += 80;

					}
					items += ("Burger" + "(" + (Integer) spinner.getValue() + ")");
				}
				if (chckbxPizza.isSelected()) {
					for (int i = 1; i <= (Integer) spinner_1.getValue(); i++) {
						total += 100;

					}
					items += ("Pizza" + "(" + (Integer) spinner_1.getValue() + ")");
				}
				if (chckbxCheeseGarlicBread.isSelected()) {
					for (int i = 1; i <= (Integer) spinner_2.getValue(); i++) {
						total += 60;

					}
					items += ("Sandwich" + "(" + (Integer) spinner_2.getValue() + ")");
				}
				if (chckbxMasalaDosa.isSelected()) {
					for (int i = 1; i <= (Integer) spinner_3.getValue(); i++) {
						total += 50;

					}
					items += ("Dosa" + "(" + (Integer) spinner_3.getValue() + ")");
				}
				if (chckbxPavBhaji.isSelected()) {
					for (int i = 1; i <= (Integer) spinner_4.getValue(); i++) {
						total += 120;

					}
					items += ("PavBhaji" + "(" + (Integer) spinner_4.getValue() + ")");
				}

				label_4.setText("" + ((total * 5) / 100) + "");
				label_5.setText("" + total + "");
				label_6.setText("" + (((total * 5) / 100) + total) + "");
				String tax1 = label_4.getText();
				String subtotal1 = label_5.getText();
				String total1 = label_6.getText();
				String extras1 = textField.getText();
				String complain1 = textField_1.getText();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management",
							"root", "root");
					PreparedStatement ps = connection.prepareStatement("insert into staff values(?,?,?,?,?,?,?) ");
					ps.setInt(1, a);
					ps.setString(2, items);
					ps.setString(3, subtotal1);
					ps.setString(4, tax1);
					ps.setString(5, total1);
					ps.setString(6, extras1);
					ps.setString(7, complain1);
					int i = ps.executeUpdate();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

	}
}

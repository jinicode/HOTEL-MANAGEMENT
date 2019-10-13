import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class StaffInfoScreen {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffInfoScreen window = new StaffInfoScreen();
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
	public StaffInfoScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 813, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblStaffInfo = new JLabel("Staff Info");
		lblStaffInfo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblStaffInfo.setBounds(305, 11, 157, 55);
		frame.getContentPane().add(lblStaffInfo);

		JButton btnGetDeatails = new JButton("Get Deatails");
		btnGetDeatails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root",
							"root");

					PreparedStatement pr1 = con.prepareStatement("select * from staff where roomno = 101");
					PreparedStatement pr2 = con.prepareStatement("select * from staff where roomno = 102");
					PreparedStatement pr3 = con.prepareStatement("select * from staff where roomno = 103");
					PreparedStatement pr4 = con.prepareStatement("select * from staff where roomno = 104");
					PreparedStatement pr5 = con.prepareStatement("select * from staff where roomno = 105");
					PreparedStatement pr6 = con.prepareStatement("select * from staff where roomno = 106");

					ResultSet rs1 = (ResultSet) pr1.executeQuery();
					ResultSet rs2 = (ResultSet) pr2.executeQuery();
					ResultSet rs3 = (ResultSet) pr3.executeQuery();
					ResultSet rs4 = (ResultSet) pr4.executeQuery();
					ResultSet rs5 = (ResultSet) pr5.executeQuery();
					ResultSet rs6 = (ResultSet) pr6.executeQuery();

					while (rs1.next()) {

						textField_1.setText(rs1.getString(2));
						textField_2.setText("" + rs1.getInt(3));
						textField_3.setText("" + rs1.getInt(4));
						textField_4.setText("" + rs1.getInt(5));
						textField_5.setText(rs1.getString(6));
						textField_6.setText(rs1.getString(7));
					}
					while (rs2.next()) {

						textField_8.setText(rs2.getString(2));
						textField_9.setText("" + rs2.getInt(3));
						textField_10.setText("" + rs2.getInt(4));
						textField_11.setText("" + rs2.getInt(5));
						textField_12.setText(rs2.getString(6));
						textField_13.setText(rs2.getString(7));
					}
					while (rs3.next()) {
						textField_15.setText(rs3.getString(2));
						textField_16.setText("" + rs3.getInt(3));
						textField_17.setText("" + rs3.getInt(4));
						textField_18.setText("" + rs3.getInt(5));
						textField_19.setText(rs3.getString(6));
						textField_20.setText(rs3.getString(7));
					}
					while (rs4.next()) {
						textField_22.setText(rs4.getString(2));
						textField_23.setText("" + rs4.getInt(3));
						textField_24.setText("" + rs4.getInt(4));
						textField_25.setText("" + rs4.getInt(5));
						textField_26.setText(rs4.getString(6));
						textField_27.setText(rs4.getString(7));
					}
					while (rs5.next()) {
						textField_29.setText(rs5.getString(2));
						textField_30.setText("" + rs5.getInt(3));
						textField_31.setText("" + rs5.getInt(4));
						textField_32.setText("" + rs5.getInt(5));
						textField_33.setText(rs5.getString(6));
						textField_34.setText(rs5.getString(7));
					}
					while (rs6.next()) {
						textField_36.setText(rs6.getString(2));
						textField_37.setText("" + rs6.getInt(3));
						textField_38.setText("" + rs6.getInt(4));
						textField_39.setText("" + rs6.getInt(5));
						textField_40.setText(rs6.getString(6));
						textField_41.setText(rs6.getString(7));
					}

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnGetDeatails.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGetDeatails.setBounds(300, 66, 162, 23);
		frame.getContentPane().add(btnGetDeatails);

		JLabel lblRoomNo = new JLabel("Room");
		lblRoomNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRoomNo.setBounds(10, 104, 78, 23);
		frame.getContentPane().add(lblRoomNo);

		JLabel lblItems = new JLabel("Items");
		lblItems.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItems.setBounds(148, 104, 82, 23);
		frame.getContentPane().add(lblItems);

		JLabel lblSutbtotal = new JLabel("Sutbtotal");
		lblSutbtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSutbtotal.setBounds(286, 104, 82, 23);
		frame.getContentPane().add(lblSutbtotal);

		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTax.setBounds(400, 104, 62, 23);
		frame.getContentPane().add(lblTax);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(484, 104, 62, 23);
		frame.getContentPane().add(lblTotal);

		JLabel lblExtras = new JLabel("Extras");
		lblExtras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExtras.setBounds(572, 104, 82, 23);
		frame.getContentPane().add(lblExtras);

		JLabel lblComplain = new JLabel("Complain");
		lblComplain.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComplain.setBounds(688, 104, 82, 23);
		frame.getContentPane().add(lblComplain);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 155, 190, 20);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(306, 155, 62, 20);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(389, 155, 62, 20);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(484, 155, 62, 20);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(556, 155, 96, 20);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(688, 155, 96, 20);
		frame.getContentPane().add(textField_6);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(81, 214, 190, 20);
		frame.getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(305, 214, 63, 20);
		frame.getContentPane().add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(389, 214, 62, 20);
		frame.getContentPane().add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(484, 214, 62, 20);
		frame.getContentPane().add(textField_11);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(556, 214, 98, 20);
		frame.getContentPane().add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(684, 214, 100, 20);
		frame.getContentPane().add(textField_13);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(81, 275, 190, 20);
		frame.getContentPane().add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(305, 275, 63, 20);
		frame.getContentPane().add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(389, 275, 62, 20);
		frame.getContentPane().add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(484, 275, 62, 20);
		frame.getContentPane().add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(556, 275, 98, 20);
		frame.getContentPane().add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(688, 275, 96, 20);
		frame.getContentPane().add(textField_20);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(81, 335, 190, 20);
		frame.getContentPane().add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(305, 335, 63, 20);
		frame.getContentPane().add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(389, 335, 62, 20);
		frame.getContentPane().add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(484, 335, 62, 20);
		frame.getContentPane().add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(556, 335, 98, 20);
		frame.getContentPane().add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(688, 335, 96, 20);
		frame.getContentPane().add(textField_27);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(81, 391, 190, 20);
		frame.getContentPane().add(textField_29);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(305, 391, 63, 20);
		frame.getContentPane().add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(389, 391, 62, 20);
		frame.getContentPane().add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(484, 391, 62, 20);
		frame.getContentPane().add(textField_32);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(556, 391, 98, 20);
		frame.getContentPane().add(textField_33);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(684, 391, 100, 20);
		frame.getContentPane().add(textField_34);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(80, 453, 191, 20);
		frame.getContentPane().add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(305, 453, 63, 20);
		frame.getContentPane().add(textField_37);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(389, 453, 62, 20);
		frame.getContentPane().add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(484, 453, 62, 20);
		frame.getContentPane().add(textField_39);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(556, 453, 98, 20);
		frame.getContentPane().add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(684, 453, 100, 20);
		frame.getContentPane().add(textField_41);

		label = new JLabel("101");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(10, 155, 61, 20);
		frame.getContentPane().add(label);

		label_1 = new JLabel("102");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(10, 217, 61, 20);
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("103");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(10, 275, 61, 20);
		frame.getContentPane().add(label_2);

		label_3 = new JLabel("104");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(10, 335, 61, 20);
		frame.getContentPane().add(label_3);

		label_4 = new JLabel("105");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(10, 387, 61, 20);
		frame.getContentPane().add(label_4);

		label_5 = new JLabel("106");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(10, 449, 61, 20);
		frame.getContentPane().add(label_5);
	}
}

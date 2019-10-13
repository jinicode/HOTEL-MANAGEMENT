import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

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

public class StaffInfoScreen {

	private JFrame frame;

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
		frame.setBounds(100, 100, 728, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStaffInfo = new JLabel("Staff Info");
		lblStaffInfo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblStaffInfo.setBounds(299, 24, 157, 55);
		frame.getContentPane().add(lblStaffInfo);
		
		JButton btnGetDeatails = new JButton("Get Deatails");
		btnGetDeatails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "root");
					PreparedStatement pr = con.prepareStatement("select * from staff");
					ResultSet rs = (ResultSet) pr.executeQuery();
					while (rs.next()) {
						System.out.print(rs.getString(1)+"--");
						System.out.print(rs.getString(2)+"--");
						System.out.print(rs.getInt(3)+"--");
						System.out.print(rs.getInt(4)+"--");
						System.out.print(rs.getInt(5)+"--");
						System.out.print(rs.getString(6)+"--");
						System.out.print(rs.getString(7)+"--");
						
					}

					System.out.println("_____________________________________________");
					ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
					System.out.println("No of Column are:" + rd.getColumnCount());
					System.out.println("Second Column Name is:" + rd.getColumnName(2));
					System.out.println("_____________________________________________");
					/*
					 * DatabaseMetaData ds = (DatabaseMetaData) con.getMetaData();
					 * System.out.println("Your Product Name is " + ds.getDatabaseProductName());
					 * System.out.println("Your Database Version" + ds.getDatabaseProductVersion());
					 * System.out.println("_____________________________________________");
					 * System.out.println("display");
					 */
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnGetDeatails.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGetDeatails.setBounds(294, 90, 162, 23);
		frame.getContentPane().add(btnGetDeatails);
	}
}

import java.awt.EventQueue;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JSpinner;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;

public class RoomAvailability {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomAvailability window = new RoomAvailability();
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
	public RoomAvailability() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame1 = new JFrame("Okay");
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblRoomType = new JLabel("Room Type:");
		lblRoomType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRoomType.setBounds(40, 146, 120, 31);
		frame.getContentPane().add(lblRoomType);

		JLabel lblRoomType_1 = new JLabel("Bed type:");
		lblRoomType_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRoomType_1.setBounds(66, 212, 120, 31);
		frame.getContentPane().add(lblRoomType_1);

		JLabel lblNoOfPeople = new JLabel("No of People:");
		lblNoOfPeople.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNoOfPeople.setBounds(40, 275, 132, 31);
		frame.getContentPane().add(lblNoOfPeople);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 4, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner.setBounds(182, 272, 251, 36);
		frame.getContentPane().add(spinner);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(184, 146, 169, 29);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("AC");
		comboBox.addItem("Non AC");

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(184, 210, 169, 31);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.addItem("Single Bed");
		comboBox_1.addItem("Double bed");

		JButton btnSave = new JButton("GET ROOM");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int k=((Math.random()*(5)) + 1);
				Random r=new Random();
				JOptionPane.showMessageDialog(frame1, "Your room no is R000" +(r.nextInt(6)+1)+  " and password is jinit");

			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBounds(182, 454, 251, 31);
		frame.getContentPane().add(btnSave);

		JLabel label = new JLabel();
		Image image = new ImageIcon(this.getClass().getResource("/hotel.png")).getImage();
		label.setIcon(new ImageIcon(image));
		label.setBounds(447, 47, 132, 196);
		frame.getContentPane().add(label);

		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblName.setBounds(87, 91, 67, 31);
		frame.getContentPane().add(lblName);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField.setBounds(182, 91, 137, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblWelcomeTo = new JLabel("Welcome to  THE HARBOUR HOTEL.");
		lblWelcomeTo.setForeground(Color.BLUE);
		lblWelcomeTo.setBackground(Color.CYAN);
		lblWelcomeTo.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblWelcomeTo.setBounds(53, 24, 415, 31);
		frame.getContentPane().add(lblWelcomeTo);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		spinner_1.setModel(
				new SpinnerDateModel(new Date(1570645800000L), new Date(1570645800000L), null, Calendar.DAY_OF_YEAR));
		spinner_1.setBounds(102, 336, 251, 36);
		frame.getContentPane().add(spinner_1);

		JLabel lblFrom = new JLabel("FROM");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblFrom.setForeground(Color.RED);
		lblFrom.setBounds(26, 336, 66, 36);
		frame.getContentPane().add(lblFrom);

		JLabel lblTo = new JLabel("TO");
		lblTo.setForeground(Color.RED);
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTo.setBounds(397, 336, 66, 36);
		frame.getContentPane().add(lblTo);

		JLabel label_2 = new JLabel("-");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 42));
		label_2.setBounds(366, 333, 32, 36);
		frame.getContentPane().add(label_2);

		JLabel lblPrice = new JLabel("0");
		lblPrice.setBackground(Color.GREEN);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(322, 394, 101, 43);
		frame.getContentPane().add(lblPrice);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(
				new SpinnerDateModel(new Date(1570905000000L), new Date(1570905000000L), null, Calendar.DAY_OF_YEAR));
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		spinner_2.setBounds(432, 336, 251, 36);
		frame.getContentPane().add(spinner_2);
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		JButton btnGetPrice = new JButton("GET PRICE");
		btnGetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			String str=spinner_1.getValue().toString();
//			String str2=spinner_2.getValue().toString();
//			System.out.println(""+str);

				String spinnerValue = formater.format((Date) spinner_1.getValue()).toString();
				String spinnerValue2 = formater.format((Date) spinner_2.getValue()).toString();
				System.out.println(spinnerValue);
				System.out.println(spinnerValue2);
				// if()
				int k = (Integer) spinner.getValue();
				// if(spinner.getValue()=="1") {
				lblPrice.setText("" + (spinnerValue2.compareTo(spinnerValue)) * 400 * k);
				// }
//				if(spinner.getValue()=="2"){
//					lblPrice.setText(""+(spinnerValue2.compareTo(spinnerValue))*800);
//				}
//				if(spinner.getValue()=="3"){
//					lblPrice.setText(""+(spinnerValue2.compareTo(spinnerValue))*1000);
//				}
//				if(spinner.getValue()=="4"){
//					lblPrice.setText(""+(spinnerValue2.compareTo(spinnerValue))*1200);
//				}
//				

				// System.out.println();

				// Date date=(Date)spinner_1.getValue();
				// LocalDate localDate = DateConverter.asLocalDate(date);
				// System.out.println(date);
			}
		});
		btnGetPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGetPrice.setBounds(28, 400, 251, 31);
		frame.getContentPane().add(btnGetPrice);

//		JLabel label = new JLabel("New label");
//		label.setBounds(493, 85, 49, 14);
//		frame.getContentPane().add(label);
//		frame.getContentPane().add(new JLabel(new ImageIcon("C:\\Users\\jinit jain\\Desktop\\download")));
	}
}

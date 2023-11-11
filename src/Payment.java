import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JFormattedTextField;

public class Payment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField;
	private JTextField textField3;
	JLabel TicketTypeLebel;
	
	JLabel FromLebel;
	JLabel QuantityLebel;
	JLabel ToLebel;
	JLabel DateLebel;
	JLabel TimeLebel ;
	JLabel PaymentLebel;
	JLabel PhoneLebel;
	JLabel ReferanceLebel;
	JLabel PriceLebel;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(34, 58, 401, 162);
		contentPane.add(panel);
		panel.setLayout(null);
		ButtonGroup group1=new ButtonGroup();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bikash");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 102));
		chckbxNewCheckBox.setForeground(new Color(255, 0, 128));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(77, 44, 121, 33);
		panel.add(chckbxNewCheckBox);
		group1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNogot = new JCheckBox("Nogot");
		chckbxNogot.setBackground(new Color(255, 255, 102));
		chckbxNogot.setForeground(new Color(255, 0, 0));
		chckbxNogot.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNogot.setBounds(77, 91, 121, 33);
		panel.add(chckbxNogot);
		group1.add(chckbxNogot);
		
		JLabel lblNewLabel_4 = new JLabel("Select Payment System ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(82, 11, 262, 14);
		panel.add(lblNewLabel_4);
		
		JLabel TitleLabel = new JLabel("Payment ");
		TitleLabel.setBounds(311, 11, 124, 32);
		TitleLabel.setForeground(new Color(0, 0, 255));
		TitleLabel.setBackground(new Color(0, 0, 160));
		TitleLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		contentPane.add(TitleLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(34, 264, 401, 196);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phone Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 126, 28);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		textField.setBounds(146, 12, 193, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(10, 49, 126, 28);
		panel_1.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Email :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 88, 126, 28);
		panel_1.add(lblNewLabel_1);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		textField3.setBounds(146, 89, 193, 28);
		panel_1.add(textField3);
		textField3.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBackground(new Color(255, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean isRoundTrip = chckbxNewCheckBox.isSelected();
				PaymentLebel.setText(isRoundTrip? "Bikash": "Nagad");
				
				String inputText1 = textField.getText();				
				PhoneLebel.setText(inputText1);
				
				String inputText3 = textField3.getText();
				ReferanceLebel.setText(inputText3);
				
				
				
				
		
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(115, 134, 109, 28);
		panel_1.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		passwordField.setBounds(146, 53, 193, 28);
		panel_1.add(passwordField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 255, 153));
		panel_2.setBounds(490, 58, 348, 413);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Ticket Type :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 86, 112, 16);
		panel_2.add(lblNewLabel_3);
		
		TicketTypeLebel = new JLabel("");
		TicketTypeLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		TicketTypeLebel.setBounds(159, 87, 112, 14);
		panel_2.add(TicketTypeLebel);
		
		JLabel lblNewLabel_3_1 = new JLabel("From :");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(10, 142, 112, 16);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("To ;");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(10, 169, 112, 16);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Date : ");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3.setBounds(10, 196, 112, 16);
		panel_2.add(lblNewLabel_3_3);
	
		QuantityLebel = new JLabel("");
		QuantityLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		QuantityLebel.setBounds(159, 112, 112, 14);
		panel_2.add(QuantityLebel);
		
		FromLebel = new JLabel("");
		FromLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		FromLebel.setBounds(159, 143, 112, 14);
		panel_2.add(FromLebel);
		
		ToLebel = new JLabel("");
		ToLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		ToLebel.setBounds(159, 170, 112, 14);
		panel_2.add(ToLebel);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Time : ");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3_1.setBounds(10, 223, 112, 16);
		panel_2.add(lblNewLabel_3_3_1);
		
		DateLebel = new JLabel("");
		DateLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		DateLebel.setBounds(159, 197, 112, 14);
		panel_2.add(DateLebel);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("Ticket Quantity :");
		lblNewLabel_3_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3_1_1.setBounds(10, 113, 112, 16);
		panel_2.add(lblNewLabel_3_3_1_1);
		
		TimeLebel = new JLabel("");
		TimeLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		TimeLebel.setBounds(159, 222, 112, 14);
		panel_2.add(TimeLebel);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("Payment By :");
		lblNewLabel_3_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3_1_2.setBounds(10, 250, 112, 16);
		panel_2.add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_3_1_3 = new JLabel("Email :");
		lblNewLabel_3_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3_1_3.setBounds(10, 307, 112, 16);
		panel_2.add(lblNewLabel_3_3_1_3);
		
		JLabel lblNewLabel_3_3_1_4 = new JLabel("Price :");
		lblNewLabel_3_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3_1_4.setBounds(10, 334, 112, 16);
		panel_2.add(lblNewLabel_3_3_1_4);
		
		PaymentLebel = new JLabel("");
		PaymentLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		PaymentLebel.setBounds(159, 252, 112, 14);
		panel_2.add(PaymentLebel);
		
		ReferanceLebel = new JLabel("");
		ReferanceLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		ReferanceLebel.setBounds(159, 309, 112, 14);
		panel_2.add(ReferanceLebel);
		
		PriceLebel = new JLabel("");
		PriceLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		PriceLebel.setBounds(119, 336, 196, 14);
		panel_2.add(PriceLebel);
		
		JButton btnNewButton_1 = new JButton("print ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AfterPayment frame = new AfterPayment();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(182, 375, 89, 27);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_3_1_2_1 = new JLabel("Phone Number :");
		lblNewLabel_3_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3_1_2_1.setBounds(10, 280, 112, 16);
		panel_2.add(lblNewLabel_3_3_1_2_1);
		
		PhoneLebel = new JLabel("");
		PhoneLebel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		PhoneLebel.setBounds(159, 282, 112, 14);
		panel_2.add(PhoneLebel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 51, 51));
		panel_3.setBounds(10, 11, 328, 64);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Dhaka Mass Transit Company Private Limited");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(21, 11, 286, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("------ Ticket ------");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(90, 36, 133, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblPortal = new JLabel("Portal");
		lblPortal.setForeground(new Color(255, 128, 64));
		lblPortal.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPortal.setBackground(new Color(0, 0, 160));
		lblPortal.setBounds(432, 11, 124, 32);
		contentPane.add(lblPortal);
	}
}

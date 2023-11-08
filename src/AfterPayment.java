import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AfterPayment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterPayment frame = new AfterPayment();
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
	
	
	public AfterPayment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 547);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wlcome To Metro Rail Management System ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(219, 11, 451, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Buy Ticket Again");
		btnNewButton.setBackground(new Color(51, 204, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MetroRailSystemHomepage();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(62, 117, 265, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Finish ");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(341, 184, 265, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View scadule ");
		btnNewButton_2.setBackground(new Color(255, 204, 51));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(341, 117, 265, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Emergancy Help");
		btnNewButton_3.setBackground(new Color(255, 102, 51));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(616, 117, 265, 35);
		contentPane.add(btnNewButton_3);
		
		JLabel lblYouHaveSuccessfuly = new JLabel("You Have Successfuly purchased a Ticket .............");
		lblYouHaveSuccessfuly.setForeground(new Color(0, 0, 0));
		lblYouHaveSuccessfuly.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYouHaveSuccessfuly.setBounds(123, 44, 534, 22);
		contentPane.add(lblYouHaveSuccessfuly);
		
		JLabel lblNewLabel_1 = new JLabel("Please Check Your Email  or collect it from below ..............................");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(123, 77, 451, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\projects\\CSE215L-projects-Metro-Rail-management-system\\r1.png"));
		lblNewLabel_2.setBounds(87, 247, 705, 227);
		contentPane.add(lblNewLabel_2);
	}
	
}

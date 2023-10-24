import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;



public class Login implements ActionListener {

	JFrame frame;
	private JTextField txtUsername;
	private JPasswordField  textField_1;
	JButton btnNewButton;
	JButton btnNewButton_1;
	String Username,Password;
	/**
	 * Create the application.
	 */
	public  Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	
	 */
	private void initialize() {
		frame = new JFrame("\"BANK LOGIN SYSTEM\"");
		frame.getContentPane().setBackground(new Color(0, 128, 255));
		frame.setBounds(80, 300, 450, 301);
		frame.setSize(794,635);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(188, 159, 196));
		panel.setBounds(76, 54, 615, 490);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setBounds(193, 45, 202, 43);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Enter your Username       :");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(54, 165, 221, 36);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Username");
		txtUsername.setBounds(305, 168, 189, 36);
		panel.add(txtUsername);
		txtUsername.setForeground(new Color(0, 0, 0));
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtUsername.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Enter your Password       :");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(54, 212, 221, 36);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		
		JPasswordField textField_1_1 = new JPasswordField();
		textField_1_1.setBounds(305, 213, 189, 36);
		panel.add(textField_1_1);
		textField_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1_1.setColumns(10);
		
		 btnNewButton = new JButton("Login");
		 btnNewButton.setBackground(new Color(174, 94, 255));
		 btnNewButton.setBounds(154, 341, 89, 38);
		 panel.add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String UserName_value =txtUsername.getText();
		 		String UserPass_value=textField_1_1.getText();
		 boolean x=CheckData(UserName_value, UserPass_value);
		 		if(x) {
		 			frame.setVisible(false);
		 			//new BankManagementGUI();
		 		}
		 		else {
		 		new	Login();
		 		}
		 		
		 	}
		 });
		 btnNewButton.setForeground(new Color(255, 0, 0));
		 btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		 btnNewButton.setFocusable(false);
		 
		 JCheckBox chckbxNewCheckBox = new JCheckBox(" Show Password");
		 chckbxNewCheckBox.setBounds(334, 278, 146, 23);
		 panel.add(chckbxNewCheckBox);
		 chckbxNewCheckBox.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(chckbxNewCheckBox.isSelected()) {
		 			textField_1_1.setEchoChar((char)0);
		 		}
		 		else
		 			textField_1_1.setEchoChar('*');
		 	}
		 });
		 chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		 chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		 chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		 chckbxNewCheckBox.setToolTipText("");
		 chckbxNewCheckBox.setBackground(new Color(188, 159, 196));
		 
		 JButton btnNewButton_1_1 = new JButton("Sign Up");
		 btnNewButton_1_1.setForeground(new Color(255, 0, 0));
		 btnNewButton_1_1.setBounds(323, 341, 101, 38);
		 panel.add(btnNewButton_1_1);
		 btnNewButton_1_1.setBackground(new Color(128, 255, 255));
		 btnNewButton_1_1.addActionListener(new ActionListener() {

		 	@Override
		 	public void actionPerformed(ActionEvent e) {
		 		if(e.getSource()==btnNewButton_1_1) {
		 			//new Register();
		 			frame.dispose();
		 		}
		 		
		 	}
		 	
		 }
		 		);
		 //btnNewButton_1.setBackground(new Color(185, 190, 184));
		 btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		 btnNewButton_1_1.setFocusable(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_1) {
			//new Register();
		}
		
	}
	
	 boolean CheckData(String UserName_value,String  UserPass_value){
		    
	        try {
	            RandomAccessFile raf = new RandomAccessFile("data1.txt", "rw");
	            
	            String line = raf.readLine();
	            Username=line.substring(10);
	            Password=raf.readLine().substring(10);
	           
	           
	         
	            if(UserName_value.equals(Username)& UserPass_value.equals(Password)){
                JOptionPane.showMessageDialog(null, "Password matched");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Wrong user/Password");
                return false;
	            }
	        } catch (FileNotFoundException ex) {
	           // Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IOException ex) {
	           // Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);
	        }
			return true;
	            
	    }
}


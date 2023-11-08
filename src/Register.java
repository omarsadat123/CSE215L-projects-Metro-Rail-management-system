import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Register extends JFrame {
	
	String textvalue ;
	 int ln;
	String Username,Password,Email;
	private JTextField textField;
	
	Register(){
		getContentPane().setBackground(new Color(255, 136, 255));
		
			
				
		
				JLabel label3=new JLabel("Full Name                   :");
				label3.setForeground(new Color(0, 0, 0));
				label3.setHorizontalAlignment(SwingConstants.LEFT);
				label3.setBounds(158, 96, 200, 45);
				label3.setFont(new Font("Tahoma", Font.BOLD, 16));
				getContentPane().add(label3);
	
		JLabel label1 = new JLabel("Username                   :");
		label1.setForeground(new Color(0, 0, 0));
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		label1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label1.setBounds(158, 152, 200, 45);
		getContentPane().add(label1);
		

		JTextField text3=new JTextField();
		text3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text3.setBackground(new Color(219, 214, 228));
		text3.setBounds(392, 96, 227, 45);
		text3.setForeground( new Color(255, 13, 13));
		text3.setColumns(10);
		getContentPane().add(text3);
		

		JTextField text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1.setBackground(new Color(219, 214, 228));
		text1.setBounds(392, 152, 227, 45);
		text1.setForeground(new Color(255, 13, 13));
		getContentPane().add(text1);
		text1.setColumns(10);

		JTextField text2=new JTextField();
		text2.setBackground(new Color(219, 214, 228));
		
		text2.setBounds(392, 206, 227, 45);
		text2.setColumns(10);
		text2.setForeground(new Color(255, 13, 13));
		text2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		getContentPane().add(text2);
		
		
		
		JLabel label2=new JLabel("Password                    :");
		label2.setForeground(new Color(0, 0, 0));
		label2.setBounds(158, 204, 200, 45);
		label2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		getContentPane().add(label2);

		
		
		
		JLabel label4 = new JLabel("Confirm Password      :");
		label4.setForeground(new Color(0, 0, 0));
		label4.setHorizontalAlignment(SwingConstants.LEFT);
		label4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label4.setBounds(158, 260, 200, 45);
		getContentPane().add(label4);
		
		JTextField text4= new JTextField();
		text4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text4.setForeground(new Color(255, 13, 13));
		text4.setBackground(new Color(219, 214, 228));
		text4.setBounds(392, 260, 227, 45);
		getContentPane().add(text4);
		text4.setColumns(10);
		
		
		
		JLabel label5= new JLabel("Gender                       :");
		label5.setForeground(new Color(0, 0, 0));
		label5.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label5.setBounds(158, 384, 200, 45);
		getContentPane().add(label5);
		

		JRadioButton radioButton1 = new JRadioButton(" Male");
		radioButton1.setForeground(new Color(0, 0, 0));
		radioButton1.setBackground(new Color(0, 136, 68));
		radioButton1.setFont(new Font("Tahoma", Font.BOLD, 16));
		radioButton1.setBounds(409, 393, 80, 23);
		radioButton1.setFocusable(false);
		getContentPane().add(radioButton1);
		
		
		JRadioButton radioButton_2 = new JRadioButton(" Female");
		radioButton_2.setForeground(new Color(0, 0, 0));
		radioButton_2.setBackground(new Color(0, 136, 68));
		radioButton_2 .setFont(new Font("Tahoma", Font.BOLD, 15));
		radioButton_2 .setBounds(500, 393, 100, 23);
		radioButton_2.setFocusable(false);
		getContentPane().add(radioButton_2 );
		
		ButtonGroup group=new ButtonGroup();
		group.add( radioButton1);
		group.add(radioButton_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(228, 477, 335, 47);
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String textUserName = text1.getText();
				String textPass=text2.getText();
//               
//				char y=textUserName.charAt(0);
//				System.out.println(y);
				
			addData(textUserName,textPass);
             text1.setText("");
             text2.setText("");
             JOptionPane.showMessageDialog(null, "Registration successfull");
             setVisible(false);
             new Login().frame.setVisible(true);
            
             
           
			}
			
		}
		);
		
		
		
		getContentPane().add(btnNewButton);
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(80, 300, 450, 301);
		this.setSize(794,635);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	    this.getContentPane().setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("Email                          :");
	    lblNewLabel.setForeground(new Color(0, 0, 0));
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblNewLabel.setBounds(158, 316, 200, 45);
	    getContentPane().add(lblNewLabel);
	    
	    textField = new JTextField();
	    textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    textField.setForeground(new Color(255, 13, 13));
	    textField.setBackground(new Color(219, 214, 228));
	    textField.setBounds(392, 316, 227, 45);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    JPanel panel = new JPanel();
	    panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    panel.setBackground(new Color(0, 136, 68));
	    panel.setForeground(new Color(64, 0, 128));
	    panel.setBounds(104, 17, 561, 562);
	    getContentPane().add(panel);
	    panel.setLayout(null);
	    
	    JLabel lblNewLabel_1 = new JLabel("CREATE NEW ID");
	    lblNewLabel_1.setBounds(155, 11, 237, 39);
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
	    lblNewLabel_1.setForeground(new Color(255, 255, 255));
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	    panel.add(lblNewLabel_1);
		this.setVisible(true);
	}



	  void addData(String usr,String pswd){
	        try {
	            RandomAccessFile raf = new RandomAccessFile("data1.txt", "rw");
	            for(int i=0;i<ln;i++){
	                raf.readLine();
	            }
	            //if condition added after video to have no lines on first entry
	            if(ln>0){
	            raf.writeBytes("\r\n");
	            raf.writeBytes("\r\n");
	            }
	            raf.writeBytes("Username: "+usr+ "\r\n");
	            raf.writeBytes("Password: "+pswd+ "\r\n");
	            raf.close();
	           
	        } catch (FileNotFoundException ex) {
	           // Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IOException ex) {
	          //  Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	    }
	

}



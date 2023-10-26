import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

import com.toedter.calendar.JDateChooser;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import java.awt.List;
import java.awt.Choice;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.TextField;

import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JFormattedTextField;

import javax.swing.JButton;

public class Ticket_Manage extends JFrame {
	private JTextField textField;
	
    
	      public Ticket_Manage(){
	      	
	    
	    JLabel lblNewLabel = new JLabel("From");
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel.setBounds(110, 305, 59, 43);
	    getContentPane().add(lblNewLabel);
	    
	    JLabel lblNewLabel_4 = new JLabel("TO");
	    lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_4.setBounds(110, 360, 59, 43);
	    getContentPane().add(lblNewLabel_4);
	    
	    textField = new JTextField();
	    textField.setBounds(232, 319, 86, 20);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	  
	    getContentPane().setBackground(new Color(47, 79, 79));
      	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	 this.setSize(1058,685);
	    getContentPane().setLayout(null);  
	    
	    JButton btnNewButton = new JButton("New button");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String input = textField.getText();
                if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Text field cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "You entered: " + input, "Validation Success", JOptionPane.INFORMATION_MESSAGE);
                }
	    	}
	    	
	    });
	    btnNewButton.setBounds(207, 464, 89, 23);
	    getContentPane().add(btnNewButton);
	    
	   
	    this.setVisible(true);
	}
	      
	    

	      public static void main(String[]args){
	    	  Ticket_Manage v=new Ticket_Manage();
	    	  }
	

	
}
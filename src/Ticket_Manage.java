import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JList;
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
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import javax.swing.JButton;

public class Ticket_Manage extends JFrame implements ActionListener {

	JLabel price_money;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	
	private String[] stations = {"Uttara North (Diyabari)","Uttara Centre", " Uttara South"};
    private double[][] prices = {{0.0, 5.0, 15.0}, {5.0, 0.0, 10.0}, {15.0, 10.0, 0.0}};
    
	      public Ticket_Manage(){
	      	getContentPane().setBackground(new Color(47, 79, 79));
	      	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      	 this.setSize(1058,685);
		    getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket type");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(66, 78, 94, 29);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adult");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setBounds(202, 78, 80, 29);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Child");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(316, 78, 80, 29);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(lblNewLabel_3);
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("  YES");
	    rdbtnNewRadioButton.setBackground(new Color(221, 160, 221));
	    rdbtnNewRadioButton.setFocusable(false);
	    rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
	    rdbtnNewRadioButton.setBounds(212, 118, 59, 34);
	    getContentPane().add(rdbtnNewRadioButton);
	    
	    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("  YES");
	    rdbtnNewRadioButton_1.setBackground(new Color(221, 160, 221));
	    rdbtnNewRadioButton_1.setFocusable(false);
	    rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	    rdbtnNewRadioButton_1.setBounds(326, 114, 72, 34);
	    getContentPane().add(rdbtnNewRadioButton_1);
	    
	    JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("   Single");
	    rdbtnNewRadioButton_2.setBackground(new Color(221, 160, 221));
	    rdbtnNewRadioButton_2.setFocusable(false);
	    rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
	    rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
	    rdbtnNewRadioButton_2.setBounds(51, 114, 94, 23);
	    getContentPane().add(rdbtnNewRadioButton_2);
	    
	    JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("   Return");
	    rdbtnNewRadioButton_3.setBackground(new Color(221, 160, 221));
	    rdbtnNewRadioButton_3.setFocusable(false);
	    rdbtnNewRadioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
	    rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
	    rdbtnNewRadioButton_3.setBounds(51, 144, 102, 23);
	    getContentPane().add(rdbtnNewRadioButton_3);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(221, 160, 221));
	    panel.setBounds(10, 25, 519, 233);
	    getContentPane().add(panel);
	    
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
	    
	    JLabel lblNewLabel_5 = new JLabel("DATE");
	    lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_5.setBounds(110, 420, 59, 43);
	    getContentPane().add(lblNewLabel_5);
	    
	    JLabel lblNewLabel_6 = new JLabel("TIME");
	    lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel_6.setBounds(110, 477, 59, 43);
	    getContentPane().add(lblNewLabel_6);
	    
	     comboBox = new JComboBox<>(stations);
	    
	    comboBox.setForeground(new Color(255, 0, 0));
	    comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
	    comboBox.setFocusable(false);
	    comboBox.setLayout(null);
	    comboBox.setBackground(new Color(245, 245, 245));
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."}));
	    comboBox.setBounds(300, 305, 203, 43);
	    getContentPane().add(comboBox);
	    
	    comboBox_1 = new JComboBox<>(stations);
	    comboBox_1.setForeground(new Color(255, 0, 0));
	    comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	    comboBox_1.setFocusable(false);
	    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" Uttara North (Diyabari)", " Uttara Centre", " Uttara South", " Pallabi", "Mirpur-11", " Mirpur-10", " Kazipara", "Shewrapara ", "Agargaon"}));
	    comboBox_1.setBounds(300, 360, 203, 43);
	    getContentPane().add(comboBox_1);
	    
	    JDateChooser dateChooser = new JDateChooser();
	    dateChooser.setDateFormatString("MMM,  dd,  yy");
	    dateChooser.setFont(new Font("Tahoma", Font.BOLD, 16));
	    dateChooser.setForeground(new Color(123, 104, 238));
	    dateChooser.setBounds(300, 415, 203, 43);
	    getContentPane().add(dateChooser);
	    
	    JComboBox comboBox_2 = new JComboBox();
	    comboBox_2.setForeground(new Color(147, 112, 219));
	    comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 16));
	    comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Time Select", "1-1.30", "1.30-2.30", "2.30-3.00", "3-3.30"}));
	    comboBox_2.setBounds(300, 477, 203, 43);
	    getContentPane().add(comboBox_2);
	    
	    price_money = new JLabel();
	    price_money.setFont(new Font("Tahoma", Font.BOLD, 20));
	    price_money.setHorizontalAlignment(SwingConstants.CENTER);
	    price_money.setBounds(616, 361, 311, 58);
	    getContentPane().add(price_money);
	    
	    JButton confirm = new JButton("CONFIRM");
	    confirm.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String departureStation = (String)comboBox.getSelectedItem();
	            String destinationStation = (String)comboBox_1.getSelectedItem();
	           // boolean isRoundTrip = returnCheckBox.isSelected();

	            int departureIndex = getIndex(departureStation);
	            int destinationIndex = getIndex(destinationStation);

	            double oneWayPrice = prices[departureIndex][destinationIndex];
	            //double roundTripPrice = isRoundTrip ? oneWayPrice * 2 : oneWayPrice;
	            price_money.setText("Ticket price for " + oneWayPrice);
	    	}
	    });
	    
	    confirm.setFont(new Font("Tahoma", Font.BOLD, 20));
	    confirm.setForeground(new Color(255, 0, 255));
	    confirm.setBounds(242, 549, 154, 34);
	    getContentPane().add(confirm);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(255, 240, 245));
	    panel_1.setBounds(10, 284, 519, 334);
	    getContentPane().add(panel_1);
	    
	    JLabel lblNewLabel_8 = new JLabel("PRICE");
	    lblNewLabel_8.setForeground(new Color(240, 255, 240));
	    lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_8.setBounds(642, 284, 163, 50);
	    getContentPane().add(lblNewLabel_8);
	   
	   
	  
		  
	    this.setVisible(true);
	}
	      
	      private int getIndex(String station) {
	          for (int i = 0; i < stations.length; i++) {
	              if (stations[i].equals(station)) {
	                  return i;
	              }
	          }
	          return -1;
	      }
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
}

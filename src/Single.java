import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

	public class Single extends Ticket_Manage {
    private JFrame frame;
    private JComboBox<String> departureStationComboBox;
    private JComboBox<String> destinationStationComboBox;
    private JCheckBox returnCheckBox;
    private JLabel resultLabel;
    private String date;
    private JPanel panel_3,panel;
    private  JDateChooser dateChooser;
    private JLabel lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6;
    private JLabel lblNewLabel_7,lblNewLabel_8,lblNewLabel_9,lblNewLabel_10,lblNewLabel_11;
    private JLabel lblNewLabel_12,lblNewLabel_13,lblNewLabel_14,lblNewLabel_17;
    private JComboBox comboBox;
	private  JComboBox comboBox_1;
    private String[] stations = {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."};
    private double[][] prices = {{0.0, 5.0, 10.0,15,20,25,30,35,40}, {5.0, 0.0, 10.0,15,20,25,30,35,40}, {5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40}
                                ,{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40}};
    private JTextField textField;
    private JLabel lblNewLabel_15;
    private JLabel lblNewLabel_20;
    
    private int selectedIndex;
    private  int ticket_Number;
    private String ticket_item;
   
    public Single() {
        frame = new JFrame("Metro Ticket Price Calculator");
        frame.getContentPane().setBackground(new Color(70, 130, 180));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1057, 698);

        JLabel departureLabel = new JLabel("FROM");
        departureLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        departureLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        departureLabel.setBounds(110, 328, 93, 43);
        departureStationComboBox = new JComboBox<>(stations);
        departureStationComboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
        departureStationComboBox.setForeground(Color.BLUE);
        departureStationComboBox.addItem("Uttara North (Diyabari)");
        departureStationComboBox.addItem("Uttara Centre");
        departureStationComboBox.addItem("Uttara South");
        departureStationComboBox.addItem("Pallabi");
        departureStationComboBox.addItem("Mirpur-11");
        departureStationComboBox.addItem("Mirpur-10");
        departureStationComboBox.addItem("Kazipara");
        departureStationComboBox.addItem("Shewrapara ");
        departureStationComboBox.addItem("Agargaon.");
        //departureStationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."}));
        departureStationComboBox.setBounds(300, 331, 203, 42);
        departureStationComboBox.setSelectedIndex(-1);

        JLabel destinationLabel = new JLabel("TO");
        destinationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        destinationLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        destinationLabel.setBounds(110, 390, 93, 43);
        destinationStationComboBox = new JComboBox<>(stations);
        destinationStationComboBox.setForeground(Color.BLUE);
        destinationStationComboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
        //destinationStationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."}));
        destinationStationComboBox.addItem("Uttara North (Diyabari)");
        destinationStationComboBox.addItem("Uttara Centre");
        destinationStationComboBox.addItem( " Uttara South");
        destinationStationComboBox.addItem(" Pallabi");
        destinationStationComboBox.addItem(" Mirpur-11");
        destinationStationComboBox.addItem(" Mirpur-10");
        destinationStationComboBox.addItem(" Kazipara");
        destinationStationComboBox.addItem(" Shewrapara ");
        destinationStationComboBox.addItem(" Agargaon.");
        destinationStationComboBox.setBounds(300, 388, 203, 42);
        destinationStationComboBox.setSelectedIndex(-1);
        
         lblNewLabel_5 = new JLabel("DATE");
	    lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_5.setBounds(110, 452, 93, 43);
	    frame.getContentPane().add(lblNewLabel_5);
	    
	    lblNewLabel_6 = new JLabel("TIME");
	    lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel_6.setBounds(110, 514, 93, 43);
	    frame.getContentPane().add(lblNewLabel_6);

        JButton calculateButton = new JButton("CONFIRM");
        calculateButton.setBackground(new Color(255, 222, 173));
        calculateButton.setForeground(new Color(255, 0, 0));
        calculateButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        calculateButton.setBounds(264, 576, 143, 43);
        calculateButton.addActionListener(new CalculateButtonListener());
        frame.getContentPane().setLayout(null);

        frame.getContentPane().add(departureLabel);
        frame.getContentPane().add(departureStationComboBox);
        frame.getContentPane().add(destinationLabel);
        frame.getContentPane().add(destinationStationComboBox);
        frame.getContentPane().add(calculateButton);
        
         dateChooser = new JDateChooser();     
         dateChooser.setForeground(new Color(0, 0, 255));
        dateChooser.setToolTipText("mm-dd-yy");
        dateChooser.setBounds(300, 445, 203, 41);
        dateChooser.setDateFormatString("yyyy-MM-dd");
        frame.getContentPane().add(dateChooser);
        
      
       
        
        comboBox = new JComboBox();
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
        comboBox.setForeground(Color.BLUE);
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Time Select", "1-1.30", "1.30-2.30", "2.30-3.00", "3-3.30"}));
        comboBox.setBounds(300, 502, 203, 42);
        frame.getContentPane().add(comboBox);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(221, 160, 221));
        panel_2.setBounds(10, 264, 530, 384);
        frame.getContentPane().add(panel_2);
        
        ButtonGroup group1=new ButtonGroup();
        
        ButtonGroup group=new ButtonGroup();
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(176, 196, 222));
        panel_1.setBounds(10, 52, 530, 201);
       
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        

        returnCheckBox = new JCheckBox(" Round Trip");
        returnCheckBox.setBounds(23, 107, 93, 23);
        panel_1.add(returnCheckBox);
        returnCheckBox.setBackground(new Color(176, 196, 222));
        returnCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
        group1.add(returnCheckBox);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("  Single");
        chckbxNewCheckBox.setBounds(23, 81, 87, 23);
        panel_1.add(chckbxNewCheckBox);
        chckbxNewCheckBox.setBackground(new Color(176, 196, 222));
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
        group1.add( chckbxNewCheckBox);
        
        JLabel lblNewLabel = new JLabel("TICKET TYPE");
        lblNewLabel.setBounds(23, 50, 103, 24);
        panel_1.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
        rdbtnNewRadioButton_1.setBounds(238, 75, 37, 23);
        panel_1.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.setBackground(new Color(176, 196, 222));
        rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        group.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("");
        rdbtnNewRadioButton.setBounds(169, 75, 37, 23);
        panel_1.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.setBackground(new Color(176, 196, 222));
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        group.add( rdbtnNewRadioButton);
        
        JLabel lblNewLabel_1 = new JLabel("ADULT ");
        lblNewLabel_1.setBounds(148, 50, 69, 24);
        panel_1.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        
        comboBox_1 = new JComboBox();
        comboBox_1.setBounds(336, 93, 103, 30);
        panel_1.add(comboBox_1);
        comboBox_1.setBackground(new Color(248, 248, 255));
        comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        //comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        comboBox_1.addItem("1");
        comboBox_1.addItem("2");
        comboBox_1.addItem("3");
        comboBox_1.addItem("4");
        comboBox_1.addItem("5");
        comboBox_1.setSelectedIndex(-1);
        
        JLabel lblNewLabel_2 = new JLabel("Number Of Tickets");
        lblNewLabel_2.setBounds(323, 50, 128, 24);
        panel_1.add(lblNewLabel_2);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        lblNewLabel_15 = new JLabel("CHILD");
        lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_15.setBounds(228, 50, 53, 24);
        panel_1.add(lblNewLabel_15);

        
        panel_3 = new JPanel();
        panel_3.setBackground(new Color(72, 209, 204));
        panel_3.setBounds(557, 22, 474, 269);
       
        panel_3.setLayout(null);
        panel_3.setVisible(false);
        frame.getContentPane().add(panel_3);

         
         textField = new JTextField();
         textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
         textField.setEditable(false);
         textField.setBounds(344, 180, 103, 23);
         panel_3.add(textField);
         textField.setBackground(new Color(173, 216, 230));
         textField.setColumns(10);
         
         
         JLabel lblNewLabel_11 = new JLabel("Ticket Type");
         lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
         lblNewLabel_11.setBounds(20, 25, 86, 29);
         panel_3.add(lblNewLabel_11);
         
          lblNewLabel_12 = new JLabel("From");
         lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
         lblNewLabel_12.setBounds(20, 95, 46, 25);
         panel_3.add(lblNewLabel_12);
         
          lblNewLabel_13 = new JLabel("New label");
          lblNewLabel_13.setForeground(new Color(0, 0, 205));
         lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_13.setBackground(new Color(255, 255, 255));
         lblNewLabel_13.setBounds(20, 115, 181, 29);
         panel_3.add(lblNewLabel_13);
         
         JLabel lblNewLabel_16 = new JLabel("To");
         lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 15));
         lblNewLabel_16.setBounds(20, 155, 46, 25);
         panel_3.add(lblNewLabel_16);
         
          lblNewLabel_17 = new JLabel("New label");
          lblNewLabel_17.setForeground(new Color(0, 0, 255));
         lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_17.setBounds(20, 175, 181, 29);
         panel_3.add(lblNewLabel_17);
         
         JLabel lblNewLabel_18 = new JLabel("Date :");
         lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 15));
         lblNewLabel_18.setBounds(288, 178, 46, 23);
         panel_3.add(lblNewLabel_18);
         
                 resultLabel = new JLabel(" Price is 0.0 TK");
                 resultLabel.setBounds(10, 225, 454, 30);
                 panel_3.add(resultLabel);
                 resultLabel.setVerticalAlignment(SwingConstants.TOP);
                 resultLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
                 resultLabel.setHorizontalAlignment(SwingConstants.LEFT);
                 
                 lblNewLabel_14 = new JLabel("New label");
                 lblNewLabel_14.setForeground(new Color(0, 0, 255));
                 lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
                 lblNewLabel_14.setBounds(20, 54, 86, 23);
                 panel_3.add(lblNewLabel_14);
                 
                 lblNewLabel_20 = new JLabel("ticket number ");
                 lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
                 lblNewLabel_20.setForeground(new Color(255, 0, 0));
                 lblNewLabel_20.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
                 lblNewLabel_20.setBounds(173, 63, 291, 57);
                 panel_3.add(lblNewLabel_20);
                                  
                                   panel = new JPanel();
                                  panel.setBackground(new Color(233, 150, 122));
                                  panel.setBounds(599, 351, 369, 167);
                                  
                                  panel.setLayout(null);
                                  
                                    //Payment Button er kaj shuru -->               
                                                   JButton btnNewButton1 = new JButton("Payment");
                                                   btnNewButton1.setBounds(120, 60, 118, 43);
                                                   panel.add(btnNewButton1);
                                                   btnNewButton1.addActionListener(new ActionListener() {
                                                   	public void actionPerformed(ActionEvent e) {
                                                   		Payment sp = new Payment();
                                                   		String inputText1 = lblNewLabel_14.getText();
                                                   		sp.TicketTypeLebel.setText(inputText1);
                                                   		
                                                   		String inputText2 = lblNewLabel_20.getText();
                                                   		sp.QuantityLebel.setText(inputText2);
                                                   		
                                                   		String inputText3 = lblNewLabel_13.getText();
                                                   		sp.FromLebel.setText(inputText3);
                                                   		
                                                   		String inputText4 = lblNewLabel_17.getText();
                                                   		sp.ToLebel.setText(inputText4);
                                                   		
                                                   		String inputText5 = textField.getText();
                                                   		sp.DateLebel.setText(inputText5);
                                                   		
//                 		String inputText6 = comboBox.getModel();
//                 		sp.TimeLebel.setText(inputText6);
//                 		
                                                   		String inputText7 = resultLabel.getText();
                                                   		sp.PriceLebel.setText(inputText7) ;                		
                                                   		
                                                   		frame.setVisible(false);
                                                   		sp.setVisible(true);
                                                   		
          //payment butto n er kaj -- >     
                	}
                                                   });
                                                   btnNewButton1.setForeground(new Color(0, 0, 0));
                                                   btnNewButton1.setBackground(new Color(255, 0, 0));
                                                   btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 17));
                 		
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

//    public int getselectedIndex() {
//    	 selectedIndex = comboBox.getSelectedIndex();
//    	return selectedIndex;
//    }
    public int getticket_Number() {
    	ticket_Number=comboBox_1.getSelectedIndex();
   	return (ticket_Number);
   }
    public String getTicket_Item() {
    	ticket_item=(String) comboBox_1.getSelectedItem();
   	return (ticket_item);
   }
    @Override
	public int getselectedIndex() {
		
		return 0;
	}
    public class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        
        	int selectedIndex=departureStationComboBox.getSelectedIndex();
        	int selectedIndex1=destinationStationComboBox.getSelectedIndex();
        	 Date selectedDate = dateChooser.getDate();
           
              
        	

           
            
            
            if (getticket_Number() == -1 || selectedIndex == -1 || selectedDate == null || selectedIndex1 == -1) {
        	    // Display an error message or take appropriate action
        	    JOptionPane.showMessageDialog(frame, "Please Fill Up all the Options.");
        	}
            else {
            	String departureStation1 = (String) departureStationComboBox.getSelectedItem();
                String destinationStation1 = (String) destinationStationComboBox.getSelectedItem();
                boolean isRoundTrip1 = returnCheckBox.isSelected();

                int departureIndex1 = getIndex(departureStation1);
                int destinationIndex1 = getIndex(destinationStation1);

                double oneWayPrice1 = prices[departureIndex1][destinationIndex1];
                double roundTripPrice1 = isRoundTrip1 ? oneWayPrice1 * 2 : oneWayPrice1;

                resultLabel.setText("Ticket price is: " + oneWayPrice1*Integer.parseInt(getTicket_Item()) + " TK" +
                        (isRoundTrip1 ? "(Round Trip Price: " + roundTripPrice1*Integer.parseInt(getTicket_Item()) + " TK)" : ""));
                
                lblNewLabel_14.setText(isRoundTrip1? "Round Trip": "Single");
                lblNewLabel_20.setText(getTicket_Item()+" Tickets ");
                lblNewLabel_13.setText(departureStation1);
                lblNewLabel_17.setText(destinationStation1);
               
                DateFormat ch=new SimpleDateFormat("dd-MM-yyyy");
                textField.setText(ch.format(dateChooser.getDate()));
            	int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to buy the Ticket ?"," Confirm",JOptionPane.YES_NO_OPTION);
                
                
				if(x==0) {
			    	panel_3.setVisible(true);
			    	frame.getContentPane().add(panel);
			    }
			    else {
			    	
			    }
            }
            
				}
			
            
        }
    
  
    private int getIndex(String station) {
        for (int i = 0; i < stations.length; i++) {
            if (stations[i].equals(station)) {
                return i;
            }
        }
        return -1;
    }
}

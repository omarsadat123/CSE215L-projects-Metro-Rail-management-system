import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Single {
    private JFrame frame;
    private JComboBox<String> departureStationComboBox;
    private JComboBox<String> destinationStationComboBox;
    private JCheckBox returnCheckBox;
    private JLabel resultLabel;
    private String date;String ticket_Number;
    private JPanel panel_2;
    private  JDateChooser dateChooser;
    private JLabel lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6;
    private JLabel lblNewLabel_7,lblNewLabel_8,lblNewLabel_9,lblNewLabel_10,lblNewLabel_11;
    private JLabel lblNewLabel_12,lblNewLabel_13,lblNewLabel_17;
    private JComboBox comboBox, comboBox_1;
    private String[] stations = {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."};
    private double[][] prices = {{0.0, 5.0, 10.0,15,20,25,30,35,40}, {5.0, 0.0, 10.0,15,20,25,30,35,40}, {5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40}
                                ,{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40}};
    private JTextField textField;

    /**
     * @wbp.parser.entryPoint
     */
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
        departureStationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."}));
        departureStationComboBox.setBounds(300, 331, 203, 42);
        departureStationComboBox.setSelectedIndex(-1);

        JLabel destinationLabel = new JLabel("TO");
        destinationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        destinationLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        destinationLabel.setBounds(110, 390, 93, 43);
        destinationStationComboBox = new JComboBox<>(stations);
        destinationStationComboBox.setForeground(Color.BLUE);
        destinationStationComboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
        destinationStationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."}));
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
	    

        returnCheckBox = new JCheckBox(" Round Trip");
        returnCheckBox.setBackground(new Color(176, 196, 222));
        returnCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
        returnCheckBox.setBounds(58, 133, 93, 23);

        JButton calculateButton = new JButton("CONFIRM");
        calculateButton.setBackground(new Color(255, 222, 173));
        calculateButton.setForeground(new Color(255, 0, 0));
        calculateButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        calculateButton.setBounds(264, 576, 143, 43);
        calculateButton.addActionListener(new CalculateButtonListener());

        resultLabel = new JLabel("Ticket Price is 0.0 TK");
        resultLabel.setVerticalAlignment(SwingConstants.TOP);
        resultLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        resultLabel.setHorizontalAlignment(SwingConstants.LEFT);
        resultLabel.setBounds(561, 387, 470, 30);
        frame.getContentPane().setLayout(null);

        frame.getContentPane().add(departureLabel);
        frame.getContentPane().add(departureStationComboBox);
        frame.getContentPane().add(destinationLabel);
        frame.getContentPane().add(destinationStationComboBox);
        frame.getContentPane().add(returnCheckBox);
        frame.getContentPane().add(calculateButton);
        JLabel lblFxdghfhfv = new JLabel();
        lblFxdghfhfv.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblFxdghfhfv.setText("Price");
        lblFxdghfhfv.setBounds(561, 303, 69, 57);
        frame.getContentPane().add(lblFxdghfhfv); // Empty cell
        frame.getContentPane().add(resultLabel);
        
         dateChooser = new JDateChooser();     
        dateChooser.setToolTipText("mm-dd-yy");
        dateChooser.setBounds(300, 445, 203, 41);
        dateChooser.setDateFormatString("yyyy-MM-dd");
        frame.getContentPane().add(dateChooser);
        
       //  date = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
       
        
         comboBox = new JComboBox();
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
        comboBox.setForeground(Color.BLUE);
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Time Select", "1-1.30", "1.30-2.30", "2.30-3.00", "3-3.30"}));
        comboBox.setBounds(300, 502, 203, 42);
        frame.getContentPane().add(comboBox);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(221, 160, 221));
        panel.setBounds(10, 264, 530, 384);
        frame.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("TICKET TYPE");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(58, 61, 103, 24);
        frame.getContentPane().add(lblNewLabel);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("  Single");
        chckbxNewCheckBox.setBackground(new Color(176, 196, 222));
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxNewCheckBox.setBounds(58, 95, 87, 23);
        frame.getContentPane().add(chckbxNewCheckBox);
        
        ButtonGroup group1=new ButtonGroup();
		group1.add( chckbxNewCheckBox);
		group1.add(returnCheckBox);
        
        JLabel lblNewLabel_1 = new JLabel("GENDER");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(209, 61, 69, 24);
        frame.getContentPane().add(lblNewLabel_1);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("  Male");
        rdbtnNewRadioButton.setBackground(new Color(176, 196, 222));
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnNewRadioButton.setBounds(202, 96, 109, 23);
        frame.getContentPane().add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("  Female");
        rdbtnNewRadioButton_1.setBackground(new Color(176, 196, 222));
        rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnNewRadioButton_1.setBounds(202, 134, 109, 23);
        frame.getContentPane().add(rdbtnNewRadioButton_1);
        
        ButtonGroup group=new ButtonGroup();
		group.add( rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
        
        JLabel lblNewLabel_2 = new JLabel("Number Of Tickets");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_2.setBounds(333, 61, 128, 24);
        frame.getContentPane().add(lblNewLabel_2);
        
        comboBox_1 = new JComboBox();
        comboBox_1.setBackground(new Color(248, 248, 255));
        comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"10", "2", "3", "4", "5"}));
        comboBox_1.setSelectedIndex(-1);
        
      
        
        comboBox_1.setBounds(346, 107, 103, 30);
        frame.getContentPane().add(comboBox_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(176, 196, 222));
        panel_1.setBounds(10, 22, 530, 201);
       
        frame.getContentPane().add(panel_1);
       
        
        JButton btnNewButton = new JButton("Payment");
        btnNewButton.setToolTipText("Payment");
        btnNewButton.setBackground(new Color(128, 128, 0));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
        btnNewButton.setBounds(697, 491, 134, 43);
        frame.getContentPane().add(btnNewButton);
        
        panel_2 = new JPanel();
        panel_2.setBounds(557, 22, 459, 242);
       
        panel_2.setLayout(null);
        panel_2.setVisible(false);
        frame.getContentPane().add(panel_2);

         
         textField = new JTextField();
         textField.setEditable(false);
         textField.setBounds(294, 147, 103, 23);
         panel_2.add(textField);
         textField.setBackground(new Color(173, 216, 230));
         textField.setColumns(10);
         
         
         JLabel lblNewLabel_11 = new JLabel("Ticket Type");
         lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_11.setBounds(20, 25, 86, 29);
         panel_2.add(lblNewLabel_11);
         
          lblNewLabel_12 = new JLabel("From");
         lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_12.setBounds(20, 75, 46, 25);
         panel_2.add(lblNewLabel_12);
         
          lblNewLabel_13 = new JLabel("New label");
          lblNewLabel_13.setForeground(new Color(0, 0, 205));
         lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_13.setBackground(new Color(255, 255, 255));
         lblNewLabel_13.setBounds(20, 115, 181, 29);
         panel_2.add(lblNewLabel_13);
         
         JLabel lblNewLabel_16 = new JLabel("To");
         lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_16.setBounds(20, 155, 46, 25);
         panel_2.add(lblNewLabel_16);
         
          lblNewLabel_17 = new JLabel("New label");
          lblNewLabel_17.setForeground(new Color(0, 0, 255));
         lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_17.setBounds(20, 185, 181, 29);
         panel_2.add(lblNewLabel_17);
         
         JLabel lblNewLabel_18 = new JLabel("Date :");
         lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_18.setBounds(238, 147, 46, 23);
         panel_2.add(lblNewLabel_18);
         
        frame.setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	int selectedIndex = comboBox.getSelectedIndex();
        	if (selectedIndex == -1) {
        	    // Display an error message or take appropriate action
        	    JOptionPane.showMessageDialog(null, "Please make a selection in the ComboBox.");
        	}
        	
            String departureStation = (String) departureStationComboBox.getSelectedItem();
            String destinationStation = (String) destinationStationComboBox.getSelectedItem();
            boolean isRoundTrip = returnCheckBox.isSelected();

            int departureIndex = getIndex(departureStation);
            int destinationIndex = getIndex(destinationStation);

            double oneWayPrice = prices[departureIndex][destinationIndex];
            double roundTripPrice = isRoundTrip ? oneWayPrice * 2 : oneWayPrice;

            resultLabel.setText("Ticket price is: " + oneWayPrice + " TK" +
                    (isRoundTrip ? "(Round Trip Price: " + roundTripPrice + " TK)" : ""));
            lblNewLabel_13.setText(departureStation);
            //lblNewLabel_13.setText(x);
            lblNewLabel_17.setText(destinationStation);
            DateFormat ch=new SimpleDateFormat("yyyy-MM-dd");
            textField.setText(ch.format(dateChooser.getDate()));
            int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to buy the Ticket ?"," Confirm",JOptionPane.YES_NO_OPTION);
             ticket_Number=comboBox_1.getSelectedItem().toString();
            System.out.println(ticket_Number);
            if(x==0) {
            	panel_2.setVisible(true);
            	 
            }
            else {
            	
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

    /**
     * @wbp.parser.entryPoint
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Single());
    }
}

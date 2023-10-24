import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Single {
    private JFrame frame;
    private JComboBox<String> departureStationComboBox;
    private JComboBox<String> destinationStationComboBox;
    private JCheckBox returnCheckBox;
    private JLabel resultLabel;

    private String[] stations = {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."};
    private double[][] prices = {{0.0, 5.0, 10.0,15,20,25,30,35,40}, {5.0, 0.0, 10.0,15,20,25,30,35,40}, {5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40}
                                ,{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40},{5.0, 5.0,0.0,15,20,25,30,35,40}};

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
        departureStationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."}));
        departureStationComboBox.setBounds(300, 331, 203, 42);

        JLabel destinationLabel = new JLabel("TO");
        destinationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        destinationLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        destinationLabel.setBounds(110, 390, 93, 43);
        destinationStationComboBox = new JComboBox<>(stations);
        destinationStationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Uttara North (Diyabari)", "Uttara Centre", " Uttara South", " Pallabi", " Mirpur-11", " Mirpur-10", " Kazipara", " Shewrapara ", " Agargaon."}));
        destinationStationComboBox.setBounds(300, 388, 203, 42);
        
        JLabel lblNewLabel_5 = new JLabel("DATE");
	    lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_5.setBounds(110, 452, 93, 43);
	    frame.getContentPane().add(lblNewLabel_5);
	    
	    JLabel lblNewLabel_6 = new JLabel("TIME");
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
        resultLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
        resultLabel.setHorizontalAlignment(SwingConstants.LEFT);
        resultLabel.setBounds(561, 387, 434, 43);
        frame.getContentPane().setLayout(null);

        frame.getContentPane().add(departureLabel);
        frame.getContentPane().add(departureStationComboBox);
        frame.getContentPane().add(destinationLabel);
        frame.getContentPane().add(destinationStationComboBox);
        frame.getContentPane().add(returnCheckBox);
        JLabel label = new JLabel();
        label.setBounds(629, 283, 109, 43);
        frame.getContentPane().add(label); // Empty cell
        frame.getContentPane().add(calculateButton);
        JLabel lblFxdghfhfv = new JLabel();
        lblFxdghfhfv.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblFxdghfhfv.setText("Price");
        lblFxdghfhfv.setBounds(639, 303, 77, 57);
        frame.getContentPane().add(lblFxdghfhfv); // Empty cell
        frame.getContentPane().add(resultLabel);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 445, 203, 41);
        frame.getContentPane().add(dateChooser);
        
        JComboBox comboBox = new JComboBox();
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
        
        JLabel lblNewLabel_2 = new JLabel("Number Of Tickets");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_2.setBounds(333, 61, 128, 24);
        frame.getContentPane().add(lblNewLabel_2);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBackground(new Color(248, 248, 255));
        comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        comboBox_1.setSelectedIndex(0);
        comboBox_1.setBounds(346, 107, 103, 30);
        frame.getContentPane().add(comboBox_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(176, 196, 222));
        panel_1.setBounds(10, 22, 581, 201);
        frame.getContentPane().add(panel_1);

        frame.setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String departureStation = (String) departureStationComboBox.getSelectedItem();
            String destinationStation = (String) destinationStationComboBox.getSelectedItem();
            boolean isRoundTrip = returnCheckBox.isSelected();

            int departureIndex = getIndex(departureStation);
            int destinationIndex = getIndex(destinationStation);

            double oneWayPrice = prices[departureIndex][destinationIndex];
            double roundTripPrice = isRoundTrip ? oneWayPrice * 2 : oneWayPrice;

            resultLabel.setText("Ticket price is: " + oneWayPrice + " TK" +
                    (isRoundTrip ? "\n (Round Trip Price: " + roundTripPrice + " TK)" : ""));
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

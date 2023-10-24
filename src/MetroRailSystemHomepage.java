import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetroRailSystemHomepage extends JFrame {
	public MetroRailSystemHomepage() {
        // Create a JFrame
       //frame.addlabel("Metro Rail Management System");
       

        // Create a JPanel
        
       // Set panel background color

        // Create buttons
        JButton viewScheduleButton = new JButton("View Schedule");
        viewScheduleButton.setBounds(382, 132, 322, 28);
        JButton bookTicketButton = new JButton("Book Ticket");
        bookTicketButton.setBounds(382, 188, 322, 28);

        // Set button colors
        viewScheduleButton.setBackground(new Color(255, 102, 102)); // Red
        bookTicketButton.setBackground(new Color(102, 255, 102)); // Green

        // Add action listeners to the buttons
        viewScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the schedule page
                JOptionPane.showMessageDialog(null, "View Schedule button clicked.");
            }
        });

        bookTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the ticket booking page
                JOptionPane.showMessageDialog(null, "Book Ticket button clicked.");
            }
        });
       getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Welcome to Metro Rail Management System");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(171, 61, 438, 35);
        getContentPane().add(lblNewLabel);

     
       
        getContentPane().add(viewScheduleButton);
       getContentPane().add(bookTicketButton);
                  
                    JButton checkBalanceButton = new JButton("Permanent Card");
                    checkBalanceButton.setBounds(31, 188, 322, 28);
                    checkBalanceButton.setBackground(new Color(255, 255, 102)); // Yellow
                    
                            checkBalanceButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // Add code to check balance
                                	new Ticket_Manage();
                                    JOptionPane.showMessageDialog(null, "Check Balance button clicked.");
                                }
                            });
                            getContentPane().add(checkBalanceButton);
                            this.setSize(804,645);
                            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.getContentPane().setBackground(new Color(51, 153, 255)); // Set background color
                            
                            JButton btnNewButton = new JButton("Daily Ticket");
                            btnNewButton.setBounds(31, 132, 322, 28);
                            getContentPane().add(btnNewButton);
                            
                            JLabel lblNewLabel1 = new JLabel("");
                        	lblNewLabel1.setHorizontalAlignment(SwingConstants.LEFT);
                        	lblNewLabel1.setIcon(new ImageIcon("D:\\Metro\\r1.png"));
                        	lblNewLabel1.setBounds(47, 321, 641, 274);
                        	lblNewLabel1.setFont(new Font("Tahoma", Font.ITALIC, 15));
                        	getContentPane().add(lblNewLabel1);
                            // Center the frame on the screen
                            this.setLocationRelativeTo(null);
					        // Make the frame visible
					        this.setVisible(true);
    }
}

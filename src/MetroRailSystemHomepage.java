import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetroRailSystemHomepage extends JFrame {
	
	public MetroRailSystemHomepage() {
        
        JButton viewScheduleButton = new JButton("View Schedule");
        viewScheduleButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        viewScheduleButton.setBounds(31, 188, 322, 28);
        JButton bookTicketButton = new JButton("Emergency Help");
        bookTicketButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        bookTicketButton.setBounds(382, 188, 322, 28);
        viewScheduleButton.setBackground(new Color(255, 102, 102)); // Red
        bookTicketButton.setBackground(new Color(102, 255, 102)); // Green

        // Add action listeners to the buttons
        viewScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the schedule page
            	SwingUtilities.invokeLater(() ->  new Schedeling());
               // JOptionPane.showMessageDialog(null, "View Schedule button clicked.");
            }
        });

        bookTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open user
            	
            	SwingUtilities.invokeLater(() -> new UserGUI());
            }
        });
       getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("Daily Ticket");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new Single();
        	
        	}
        	
        });
        
        JLabel lblNewLabel = new JLabel("Welcome to Metro Rail Management System");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(171, 61, 438, 35);
        getContentPane().add(lblNewLabel);
        btnNewButton.setBounds(31, 132, 322, 28);
        getContentPane().add(btnNewButton);

     
       
        getContentPane().add(viewScheduleButton);
       
         JButton checkBalanceButton = new JButton("Permanent Ticket");
         checkBalanceButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
         checkBalanceButton.setBounds(382, 132, 322, 28);
         checkBalanceButton.setBackground(new Color(255, 255, 102)); // Yellow
         
                 checkBalanceButton.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         // Add code to check balance
                   
                         new Login();
                         // new Ticket_Manage();
                     }
                 });
                 getContentPane().add(checkBalanceButton);
                 getContentPane().add(bookTicketButton);
                            this.setSize(804,645);
                            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.getContentPane().setBackground(new Color(51, 153, 255)); // Set background color
                            
                            JLabel lblNewLabel1 = new JLabel("");
                        	lblNewLabel1.setHorizontalAlignment(SwingConstants.LEFT);
                        	lblNewLabel1.setIcon(new ImageIcon("r1.png"));
                        	lblNewLabel1.setBounds(47, 289, 657, 295);
                        	lblNewLabel1.setFont(new Font("Tahoma", Font.ITALIC, 15));
                        	getContentPane().add(lblNewLabel1);
                            // Center the frame on the screen
                            this.setLocationRelativeTo(null);
					        // Make the frame visible
					        this.setVisible(true);
    }
}

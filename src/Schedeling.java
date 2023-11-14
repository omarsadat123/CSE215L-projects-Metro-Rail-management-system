
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
	public class Schedeling {
	    private JFrame frame;
	    private DefaultTableModel model;
		private char Uttara;
		private JTextField textField_1;

		 public static void main(String[] args) {
		        SwingUtilities.invokeLater(() -> new Schedeling());
		    }

	    public Schedeling() {
	        initialize();
	    }

	   
	    private void initialize() {
	    	
	    	int buttonCount = 0;

	        frame = new JFrame("Schedule Chart");
	        frame.setBounds(100, 100, 716, 477);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);
	        JPanel panel = new JPanel();
	        panel.setToolTipText("Select your current station");
	        frame.getContentPane().add(panel);
	        panel.setLayout(null);
	        
	        JButton btnNewButton = new JButton("North Uttara");
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        		
	        		

	        		
	        	}
	        	
	        	
	        });
	        btnNewButton.setBounds(30, 68, 114, 23);
	        panel.add(btnNewButton);
	        
	        JButton btnNewButton_1 = new JButton("Uttara Center");
	        btnNewButton_1.setBounds(30, 114, 114, 23);
	        panel.add(btnNewButton_1);
	       
	        
	       
	        
	        JButton btnNewButton_2 = new JButton("Uttara South");
	        btnNewButton_2.setBounds(30, 164, 114, 23);
	        panel.add(btnNewButton_2);
	        
	        JButton btnNewButton_3 = new JButton("Pallabi");
	        btnNewButton_3.setBounds(30, 223, 114, 23);
	        panel.add(btnNewButton_3);
	        
	        JButton btnNewButton_4 = new JButton("Mirpur-11");
	        btnNewButton_4.setBounds(30, 273, 114, 23);
	        panel.add(btnNewButton_4);
	        
	        JButton btnNewButton_5 = new JButton("Mirpur-10");
	        btnNewButton_5.setBounds(30, 325, 114, 23);
	        panel.add(btnNewButton_5);
	        
	        JButton btnNewButton_6 = new JButton("Kazipara");
	        btnNewButton_6.setBounds(30, 372, 114, 23);
	        panel.add(btnNewButton_6);
	        
	        JButton btnNewButton_7 = new JButton("Shewrapara");
	        btnNewButton_7.setBounds(177, 372, 121, 23);
	        panel.add(btnNewButton_7);
	        
	        JButton btnNewButton_8 = new JButton("Agargaon");
	        btnNewButton_8.setBounds(336, 372, 121, 23);
	        panel.add(btnNewButton_8);
	        
	        JButton btnNewButton_9 = new JButton("Bijoy Sarani");
	        btnNewButton_9.setBounds(496, 372, 113, 23);
	        panel.add(btnNewButton_9);
	        
	        JButton btnNewButton_10 = new JButton("Farmgate");
	        btnNewButton_10.setBounds(496, 325, 113, 23);
	        panel.add(btnNewButton_10);
	        
	        JButton btnNewButton_11 = new JButton(" Kawran Bazar");
	        btnNewButton_11.setBounds(496, 273, 113, 23);
	        panel.add(btnNewButton_11);
	        
	        JButton btnNewButton_12 = new JButton("Shahbagh");
	        btnNewButton_12.setBounds(496, 223, 113, 23);
	        panel.add(btnNewButton_12);
	        
	        JButton btnNewButton_13 = new JButton("Dhaka University");
	        btnNewButton_13.setBounds(496, 164, 113, 23);
	        panel.add(btnNewButton_13);
	        
	        JButton btnNewButton_14 = new JButton("Bangladesh Secretariat");
	        btnNewButton_14.setBounds(496, 114, 143, 23);
	        panel.add(btnNewButton_14);
	        
	        JButton btnNewButton_15 = new JButton("Motijheel");
	        btnNewButton_15.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        btnNewButton_15.setBounds(496, 68, 113, 23);
	        panel.add(btnNewButton_15);
	        
	        TextField textField = new TextField();
	        textField.setFont(new Font("Dialog", Font.BOLD, 20));
	        textField.setBackground(Color.PINK);
	        textField.setText("Select your current station");
	        textField.setBounds(187, 39, 265, 33);
	        panel.add(textField);
	        
	        textField_1 = new JTextField();
	        textField_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        		
	        		String Station_name=JOptionPane.showInputDialog(null,"Enter your current station");
	        		String Station_name2=JOptionPane.showInputDialog(null,"Enter your destination station");
	        		String Your_journey= " "+Station_name+ " To " +Station_name2;
	        		JOptionPane.showMessageDialog(null, "Your journey from"+Your_journey);
	        		String t=textField.getText();
	        		
	        		
	        		
	        	}
	        });
	        textField_1.setBounds(234, 91, 172, 33);
	        panel.add(textField_1);
	        textField_1.setColumns(10);
	        frame.setVisible(true);
	       
	    }
	}





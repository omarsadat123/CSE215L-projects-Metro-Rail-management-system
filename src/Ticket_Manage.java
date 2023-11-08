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

public abstract class Ticket_Manage  {
	
	
    
	      public Ticket_Manage(){
	    	
	    	 
	      	}
	    
	       abstract int getselectedIndex();
	      

}
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class AdminGUI {
    private JTextArea messageTextArea;
    private JTextField adminResponseField;
    private PrintWriter adminResponseWriter;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdminGUI adminGUI = new AdminGUI(); // Initialize the admin GUI
            adminGUI.startServer(); // Start the admin server
        });
    }

    /**
     * @wbp.parser.entryPoint
     */
    public AdminGUI() {
    	
    	
        JFrame adminFrame = new JFrame("Admin Help System");
        adminResponseField = new JTextField(20);
        adminResponseField.setBounds(21, 9, 219, 57);
        JButton sendResponseButton = new JButton("Send");
        sendResponseButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        sendResponseButton.setBounds(274, 11, 123, 52);
        adminFrame.getContentPane().setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 44, 328, 165);
        adminFrame.getContentPane().add(scrollPane);
        messageTextArea = new JTextArea();
        scrollPane.setViewportView(messageTextArea);
        messageTextArea.setEditable(false);
        JPanel responsePanel = new JPanel();
        responsePanel.setBounds(372, 80, 426, 74);
        responsePanel.setLayout(null);
        responsePanel.add(adminResponseField);
        responsePanel.add(sendResponseButton);
        adminFrame.getContentPane().add(responsePanel);

        adminFrame.setSize(831, 345);
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminFrame.setVisible(true);
    
        sendResponseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String adminResponse = adminResponseField.getText();
                if (adminResponseWriter != null) {
                    adminResponseWriter.println(adminResponse);
                }
                adminResponseField.setText("");
            }
        });
    }

    public void startServer() {
        new Thread(() -> {
            try {
                ServerSocket serverSocket = new ServerSocket(1234);

                while (true) {
                    System.out.println("Waiting for user messages...");
                    Socket userSocket = serverSocket.accept();
                    BufferedReader userReader = new BufferedReader(new InputStreamReader(userSocket.getInputStream()));

                    adminResponseWriter = new PrintWriter(userSocket.getOutputStream(), true);

                    String userMessage;
                    while ((userMessage = userReader.readLine()) != null) {
                        messageTextArea.append("User sent a message: " + userMessage + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

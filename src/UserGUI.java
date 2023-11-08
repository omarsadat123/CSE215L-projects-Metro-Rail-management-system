import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class UserGUI {
    private JTextArea messageTextArea;
    private JTextField messageField;
    private PrintWriter out;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserGUI userGUI = new UserGUI(); // Initialize the user GUI
        });
    }

    /**
     * @wbp.parser.entryPoint
     */
    public UserGUI() {
        JFrame userFrame = new JFrame("User Help System");
        userFrame.getContentPane().setLayout(null);
        messageField = new JTextField(20);
        messageField.setBounds(10, 15, 185, 53);
        JButton sendButton = new JButton("Send");
        sendButton.setBounds(214, 19, 96, 45);
        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(83, 123, 320, 86);
        inputPanel.setLayout(null);
        inputPanel.add(messageField);
        inputPanel.add(sendButton);
        userFrame.getContentPane().add(inputPanel);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(435, 49, 442, 182);
        userFrame.getContentPane().add(scrollPane);
        messageTextArea = new JTextArea();
        messageTextArea.setEditable(false);
        scrollPane.setViewportView(messageTextArea);
        
        JLabel lblNewLabel = new JLabel("Emergency Help");
        lblNewLabel.setBounds(101, 55, 202, 38);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        userFrame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Admin Response");
        lblNewLabel_1.setForeground(new Color(128, 0, 128));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_1.setBounds(517, 11, 229, 27);
        userFrame.getContentPane().add(lblNewLabel_1);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

        userFrame.setSize(985, 425);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userFrame.setVisible(true);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText();
                if (out != null) {
                    out.println(message);
                }
                messageField.setText("");
            }
        });

        connectToAdmin(); // Connect to the admin server after initializing the GUI
    }

    public void connectToAdmin() {
      //  new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 1234);
                out = new PrintWriter(socket.getOutputStream(), true);

                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;

                while ((message = reader.readLine()) != null) {
                    messageTextArea.append("Admin's response: " + message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
       // }).start();
    }
}

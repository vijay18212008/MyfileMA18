import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F1LoginPage extends JFrame implements ActionListener {

    // Components
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, clearButton;

    public F1LoginPage() {
        setTitle("🏎️ F1 Cars Login Page");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Title Label
        JLabel title = new JLabel("F1 Cars Login", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.RED);

        // Input Panel
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel userLabel = new JLabel("Driver Name:");
        usernameField = new JTextField();

        JLabel passLabel = new JLabel("Team Password:");
        passwordField = new JPasswordField();

        loginButton = new JButton("🏁 Login");
        clearButton = new JButton("❌ Clear");

        loginButton.setBackground(Color.RED);
        loginButton.setForeground(Color.WHITE);

        clearButton.setBackground(Color.GRAY);
        clearButton.setForeground(Color.WHITE);

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);

        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(clearButton);

        add(title, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Example check (you can replace with DB or file check)
            if (username.equalsIgnoreCase("Hamilton") && password.equals("Mercedes")) {
                JOptionPane.showMessageDialog(this, "Welcome Champion! 🏆");
            } else if (username.equalsIgnoreCase("Verstappen") && password.equals("RedBull")) {
                JOptionPane.showMessageDialog(this, "Welcome World Champion! 🏎️");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Driver or Team Password!");
            }
        } else if (e.getSource() == clearButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        new F1LoginPage();
    }
}
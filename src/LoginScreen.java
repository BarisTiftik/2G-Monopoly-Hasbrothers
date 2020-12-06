
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JButton logınButton;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JPanel panel1;
    private JTextPane textPane1;

    public LoginScreen(){
        add(panel1);
        setSize(600,400);
        setTitle("Monopoly Bilkent");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        logınButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to do
            }
        });
    }
}

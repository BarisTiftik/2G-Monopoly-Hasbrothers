import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame{

    private JPanel panel1;

    LoginScreen(){
        setTitle("Monopoly Bilkent");
        //font
        Font f = new Font("Serif", Font.BOLD, 20);
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,0));
        heading.setBounds(200,0,509,396);

        ImageIcon headingImg = new ImageIcon("png/loginscreen.png");
        Image img0 = headingImg.getImage();
        Image temp_img0 = img0.getScaledInstance(509,396,Image.SCALE_SMOOTH);
        headingImg = new ImageIcon( temp_img0);
        JLabel headingLabel = new JLabel("", headingImg, JLabel.CENTER);
        heading.add(headingLabel);

        //login panel
        JPanel login;
        login = new JPanel();
        login.setLayout(null);
        login.setSize(400, 200);
        login.setBackground(new Color(0,0,0,60));
        login.setBounds(200,400,500,300);
        //labels
        //username
        JLabel username = new JLabel();
        username.setText("Username :");
        username.setBounds(20, 40, 120, 50);
        username.setFont(f);
        login.add(username);
        //password
        JLabel password = new JLabel();
        password.setText("Password :");
        password.setBounds(20, 110, 120, 50);
        password.setFont(f);
        login.add(password);

        //text fields
        //username
        JTextField nameText = new JTextField();
        nameText.setBounds(150, 40, 300, 50);
        nameText.setFont(f);
        login.add(nameText);
        //PASSWORD
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(150, 110, 300, 50);
        passwordText.setFont(f);
        login.add(passwordText);

        //buttons
        JButton signup = new JButton("Sign Up");
        signup.setBounds(150, 180,130, 50);
        signup.setBackground(new Color(210,210,5));
        login.add(signup);

        JButton signIn = new JButton("Sign In");
        signIn.setBounds(320, 180,130, 50);
        signIn.setBackground(new Color(210,210,5));
        login.add(signIn);

        //frame
        setSize(900, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //background
        ImageIcon backgroundImg = new ImageIcon("png/background.jpg");
        Image img = backgroundImg.getImage();
        Image temp_img = img.getScaledInstance(900,800,Image.SCALE_SMOOTH);
        backgroundImg = new ImageIcon( temp_img);
        JLabel background = new JLabel("", backgroundImg, JLabel.CENTER);

        background.add(login);
        background.add(heading);
        background.setBounds(0,0,900,800);
        add(background);

        setVisible(true);
    }

}

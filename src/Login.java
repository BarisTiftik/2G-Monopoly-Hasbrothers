

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Login extends JFrame {
    private JPanel login7;

    public Login() throws HeadlessException {
        JPanel login = new JPanel();
        login.setLayout(null);
        login.setBackground(new Color(0,0,0,60));
        login.setBounds(0,0,1200,800);

        JTextField username = new JTextField();
        username.setBounds(440, 500,330, 50);
        login.add(username);

        JPasswordField password = new JPasswordField();
        password.setBounds(440, 555,330, 50);
        login.add(password);

        JButton signUp = new JButton("If you don't have an account, please sing up");
        signUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SignUp l = new SignUp();
            }
        });
        signUp.setBounds(440, 690,330, 50);
        signUp.setBackground(new Color(255,202,5));
        login.add(signUp);

        JButton singIn = new JButton("Sing In");
        singIn.setBounds(640, 620,130, 50);
        singIn.setBackground(new Color(255,202,5));
        login.add(singIn);

        singIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Boolean singIn = false;
                    File f = new File("users.txt");
                    if (f.exists() && !username.getText().equals(""))
                    {
                        File myObj = new File("users.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            if(data.toString().split("&&&")[0].toString().equals(username.getText()) & data.toString().split("&&&")[1].toString().equals(password.getText()))
                            {
                                singIn = true;
                                JOptionPane.showMessageDialog(new Frame(),
                                        "Login successful");
                                MainPage mainPage = new MainPage(data.toString().split("&&&")[0].toString(),data.toString().split("&&&")[1].toString());
                                dispose();
                                break;
                            }
                        }
                        myReader.close();
                    }
                    if(!singIn)
                    {
                        JOptionPane.showMessageDialog(new Frame(),
                                "Login Failed","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (FileNotFoundException ee) {
                    System.out.println("An error occurred.");
                    ee.printStackTrace();
                }
            }
        });

        JButton exit = new JButton("Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setBounds(440, 620,130, 50);
        exit.setBackground(new Color(255,202,5));
        login.add(exit);

        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,0));
        heading.setBounds(350,100,509,396);

        ImageIcon headingImg = new ImageIcon("png/loginscreen.png");
        Image img0 = headingImg.getImage();
        Image temp_img0 = img0.getScaledInstance(509,396,Image.SCALE_SMOOTH);
        headingImg = new ImageIcon( temp_img0);
        JLabel headingLabel = new JLabel("", headingImg, JLabel.CENTER);
        heading.add(headingLabel);

        ImageIcon backgroundImg = new ImageIcon("png/background.jpg");
        Image img = backgroundImg.getImage();
        Image temp_img = img.getScaledInstance(1200,800,Image.SCALE_SMOOTH);
        backgroundImg = new ImageIcon( temp_img);
        JLabel background = new JLabel("", backgroundImg, JLabel.CENTER);

        ImageIcon profileImg1 = new ImageIcon("png/info.png");
        Image pImg1 = profileImg1.getImage();
        Image ptemp_img1 = pImg1.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        profileImg1 = new ImageIcon( ptemp_img1);
        JLabel profileImgLabel2 = new JLabel("", profileImg1, JLabel.CENTER);

        profileImgLabel2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(new Frame(),
                        "If you are not a member, you must click the sign up button. If you are a member, you can login.");
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        profileImgLabel2.setBounds(1,1,30,30);
        login.add(profileImgLabel2);

        background.add(heading);
        background.add(login);
        background.setBounds(0,0,1200,800);
        this.add(background);
        this.setSize(1220,820);
        this.setVisible(true);


    }
}
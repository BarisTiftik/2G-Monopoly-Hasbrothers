import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class SignUp extends JFrame {
    private JPanel login7;

    public SignUp() throws HeadlessException {
        JPanel login = new JPanel();
        login.setLayout(null);
        login.setBackground(new Color(0,0,0,60));
        login.setBounds(0,0,1200,800);

        JTextField username = new JTextField();
        username.setBounds(440, 200,330, 50);
        login.add(username);

        JPasswordField password = new JPasswordField();
        password.setBounds(440, 255,330, 50);
        login.add(password);

        JButton singUp = new JButton("Sing Up");
        singUp.setBounds(640, 320,130, 50);
        singUp.setBackground(new Color(255,202,5));
        login.add(singUp);

        JButton exit = new JButton("Back");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        exit.setBounds(440, 320,130, 50);
        exit.setBackground(new Color(255,202,5));
        login.add(exit);

        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,0));
        heading.setBounds(350,100,509,396);

        ImageIcon backgroundImg = new ImageIcon("png/background.jpg");
        Image img = backgroundImg.getImage();
        Image temp_img = img.getScaledInstance(1200,800,Image.SCALE_SMOOTH);
        backgroundImg = new ImageIcon( temp_img);
        JLabel background = new JLabel("", backgroundImg, JLabel.CENTER);

        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        r1.setBounds(440,170,100,30);
        r2.setBounds(670,170,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        login.add(r1);
        login.add(r2);

        JComboBox selectProfile = new JComboBox();
        String[] male = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10" };
        String[] famale = { "11", "12", "13", "14", "15","16", "17", "18", "19", "20" };

        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectProfile.removeAllItems();
                for (String item:male)
                {
                    selectProfile.addItem(item);
                }
            }
        });
        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectProfile.removeAllItems();
                for (String item:famale)
                {
                    selectProfile.addItem(item);
                }
            }
        });

        singUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PrintWriter pw = null;
                try {
                    File file = new File("users.txt");
                    FileWriter fw = new FileWriter(file, true);
                    pw = new PrintWriter(fw);
                    pw.println(username.getText()+"&&&"+password.getText()+"&&&"+selectProfile.getSelectedItem());
                    JOptionPane.showMessageDialog(new Frame(),
                            "Registration Successful!");
                    dispose();
                } catch (IOException ee) {
                    ee.printStackTrace();
                    dispose();
                } finally {
                    if (pw != null) {
                        pw.close();
                    }
                }
            }
        });

        ImageIcon profileImg = new ImageIcon("png/ch/0.png");
        Image pImg = profileImg.getImage();
        Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImg = new ImageIcon( ptemp_img);
        JLabel profileImgLabel = new JLabel("", profileImg, JLabel.CENTER);

        selectProfile.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Image pImg = (new ImageIcon("png/ch/"+e.getItem()+".png")).getImage();
                Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                ImageIcon profileImg = new ImageIcon(ptemp_img);
                profileImgLabel.setIcon(profileImg);
            }
        });

        ImageIcon profileImg1 = new ImageIcon("png/info.png");
        Image pImg1 = profileImg1.getImage();
        Image ptemp_img1 = pImg1.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        profileImg1 = new ImageIcon( ptemp_img1);
        JLabel profileImgLabel2 = new JLabel("", profileImg1, JLabel.CENTER);

        profileImgLabel2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(new Frame(),
                        "Select your gender and pick an avatar.\n" +
                                "Enter username and password.\n" +
                                "Click sign up button.");
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

        selectProfile.setBounds(440, 120,330, 50);
        login.add(selectProfile);

        profileImgLabel.setBounds(560,0,90,150);
        login.add(profileImgLabel);
        login.add(selectProfile);



        background.add(heading);
        background.add(login);
        background.setBounds(0,0,1200,800);
        this.add(background);
        this.setSize(1220,820);
        this.setVisible(true);
    }
}
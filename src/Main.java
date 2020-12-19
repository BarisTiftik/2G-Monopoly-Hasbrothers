/*public class Main {
    public static void main(String[] args) {
        //System.out.println("aaa");
        //LoginScreen l = new LoginScreen();
        //l.setVisible(true);

        BoardGUI b = new BoardGUI();
        b.setVisible(true);

    }
}*/
/*
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BoardGUI();
            }
            BoardGUI l = new BoardGUI();

        });
    }
}*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main extends JFrame {
    private JPanel login7;
    private String username;
    private String profileImage;
    public Main(String username,String profileImage) throws HeadlessException {
        this.username = username;
        this.profileImage = profileImage;

        JPanel login = new JPanel();
        login.setLayout(null);
        login.setBackground(new Color(0,0,0,60));
        login.setBounds(0,0,1200,800);

        JButton loby = new JButton("Create Loby");
        loby.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    CreateLoby createLoby = new CreateLoby(username, profileImage);
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        loby.setBounds(440, 510,330, 50);
        loby.setBackground(new Color(255,202,5));
        login.add(loby);

        JButton how = new JButton("How to Play");
        how.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(new Frame(),
                        "Nasıl Oynanır?");
            }
        });
        how.setBounds(440, 570,330, 50);
        how.setBackground(new Color(255,202,5));
        login.add(how);

        JButton credits = new JButton("Credits");
        credits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(new Frame(),
                        "İsimleri Yazın");
            }
        });
        credits.setBounds(440, 630,330, 50);
        credits.setBackground(new Color(255,202,5));
        login.add(credits);

        JButton exit = new JButton("Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        exit.setBounds(440, 690,330, 50);
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

        ImageIcon profileImg = new ImageIcon("png/ch/0.png");
        Image pImg = profileImg.getImage();
        Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImg = new ImageIcon( ptemp_img);
        JLabel profileImgLabel = new JLabel("", profileImg, JLabel.CENTER);

        ImageIcon profileImg1 = new ImageIcon("png/info.png");
        Image pImg1 = profileImg1.getImage();
        Image ptemp_img1 = pImg1.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        profileImg1 = new ImageIcon( ptemp_img1);
        JLabel profileImgLabel2 = new JLabel("", profileImg1, JLabel.CENTER);

        profileImgLabel2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(new Frame(),
                        "Main Page Start Game");
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

        profileImgLabel.setBounds(560,0,90,150);
        login.add(profileImgLabel);

        background.add(heading);
        background.add(login);
        background.setBounds(0,0,1200,800);
        this.add(background);
        this.setSize(1220,820);
        this.setVisible(true);
    }
}
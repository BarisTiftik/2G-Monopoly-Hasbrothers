
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CreateLoby extends JFrame {
    private JPanel login7;
    private String[] usernames;
    private String username;
    private String[] profileImages;
    private String profileImage;
    
    public CreateLoby(String username, String profileImage) throws HeadlessException, FileNotFoundException {
        usernames = new String[6];
        profileImages = new String[6];
        this.username = username;
        this.profileImage = profileImage;

        JPanel login = new JPanel();
        login.setLayout(null);
        login.setBackground(new Color(0,0,0,60));
        login.setBounds(0,0,1200,800);

        JButton start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //StartPage startPage = new StartPage(usernames,profileImages);
            }
        });
        start.setBounds(440, 660,330, 50);
        start.setBackground(new Color(255,202,5));
        login.add(start);

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        back.setBounds(440, 720,330, 50);
        back.setBackground(new Color(255,202,5));
        login.add(back);

        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,0));
        heading.setBounds(350,10,509,396);

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

        /* user current */
        ImageIcon profileImgcurrent = new ImageIcon("png/ch/0.png");
        Image pImgcurrent = profileImgcurrent.getImage();
        Image ptemp_imgcurrent = pImgcurrent.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImgcurrent = new ImageIcon( ptemp_imgcurrent);
        JLabel profileImgLabelcurrent = new JLabel("", profileImgcurrent, JLabel.CENTER);

        profileImgLabelcurrent.setBounds(50,420,90,150);
        login.add(profileImgLabelcurrent);
        File f = new File("users.txt");
        if (f.exists() && !username.equals(""))
        {
            File myObj = new File("users.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.toString().split("&&&")[0].toString().equals(username))
                {
                    JOptionPane.showMessageDialog(new Frame(),
                            "Successful");
                    Image pImg = (new ImageIcon("png/ch/"+data.toString().split("&&&")[2].toString()+".png")).getImage();
                    Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                    ImageIcon profileImg = new ImageIcon(ptemp_img);
                    profileImgLabelcurrent.setIcon(profileImg);
                    usernames[0] = data.toString().split("&&&")[0].toString();
                    profileImages[0] = data.toString().split("&&&")[2].toString();
                }
            }
            myReader.close();
        }
        JLabel jLabel = new JLabel(username);
        jLabel.setBounds(15, 610,150, 50);
        login.add(jLabel);
        /* user 1 */
        ImageIcon profileImg = new ImageIcon("png/ch/0.png");
        Image pImg = profileImg.getImage();
        Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImg = new ImageIcon( ptemp_img);
        JLabel profileImgLabel = new JLabel("", profileImg, JLabel.CENTER);

        profileImgLabel.setBounds(210,420,90,150);
        login.add(profileImgLabel);

        JTextField username1 = new JTextField();
        username1.setBounds(175, 550,150, 50);
        login.add(username1);
        JButton search1 = new JButton("Search");
        search1.setBounds(175, 610,150, 50);
        search1.setBackground(new Color(255,202,5));
        search1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Boolean singIn = false;
                    File f = new File("users.txt");
                    if (f.exists() && !username1.getText().equals(""))
                    {
                        File myObj = new File("users.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            if(data.toString().split("&&&")[0].toString().equals(username1.getText()))
                            {
                                singIn = true;
                                JOptionPane.showMessageDialog(new Frame(),
                                        "Successful");
                                Image pImg = (new ImageIcon("png/ch/"+data.toString().split("&&&")[2].toString()+".png")).getImage();
                                Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                                ImageIcon profileImg = new ImageIcon(ptemp_img);
                                profileImgLabel.setIcon(profileImg);
                                usernames[1] = data.toString().split("&&&")[0].toString();
                                profileImages[1] = data.toString().split("&&&")[2].toString();
                            }
                        }
                        myReader.close();
                    }
                    if(!singIn)
                        JOptionPane.showMessageDialog(new Frame(),
                                "Not Exist User");
                } catch (FileNotFoundException ee) {
                    System.out.println("An error occurred.");
                    ee.printStackTrace();
                }
            }
        });
        login.add(search1);

        /* user 2 */
        profileImg = new ImageIcon("png/ch/0.png");
        pImg = profileImg.getImage();
        ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImg = new ImageIcon( ptemp_img);
        JLabel profileImgLabe2 = new JLabel("", profileImg, JLabel.CENTER);

        profileImgLabe2.setBounds(370,420,90,150);
        login.add(profileImgLabe2);

        JTextField username2 = new JTextField();
        username2.setBounds(335, 550,150, 50);
        login.add(username2);
        JButton search2 = new JButton("Search");
        search2.setBounds(335, 610,150, 50);
        search2.setBackground(new Color(255,202,5));
        search2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Boolean singIn = false;
                    File f = new File("users.txt");
                    if (f.exists() && !username2.getText().equals(""))
                    {
                        File myObj = new File("users.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            if(data.toString().split("&&&")[0].toString().equals(username2.getText()))
                            {
                                singIn = true;
                                JOptionPane.showMessageDialog(new Frame(),
                                        "Successful");
                                Image pImg = (new ImageIcon("png/ch/"+data.toString().split("&&&")[2].toString()+".png")).getImage();
                                Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                                ImageIcon profileImg = new ImageIcon(ptemp_img);
                                profileImgLabe2.setIcon(profileImg);
                                usernames[2] = data.toString().split("&&&")[0].toString();
                                profileImages[2] = data.toString().split("&&&")[2].toString();
                            }
                        }
                        myReader.close();
                    }
                    if(!singIn)
                        JOptionPane.showMessageDialog(new Frame(),
                                "Not Exist User");
                } catch (FileNotFoundException ee) {
                    System.out.println("An error occurred.");
                    ee.printStackTrace();
                }
            }
        });
        login.add(search2);

        /* user 3 */
        profileImg = new ImageIcon("png/ch/0.png");
        pImg = profileImg.getImage();
        ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImg = new ImageIcon( ptemp_img);
        JLabel profileImgLabe3 = new JLabel("", profileImg, JLabel.CENTER);

        profileImgLabe3.setBounds(530,420,90,150);
        login.add(profileImgLabe3);

        JTextField username3 = new JTextField();
        username3.setBounds(495, 550,150, 50);
        login.add(username3);
        JButton search3 = new JButton("Search");
        search3.setBounds(495, 610,150, 50);
        search3.setBackground(new Color(255,202,5));
        search3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Boolean singIn = false;
                    File f = new File("users.txt");
                    if (f.exists() && !username3.getText().equals(""))
                    {
                        File myObj = new File("users.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            if(data.toString().split("&&&")[0].toString().equals(username3.getText()))
                            {
                                singIn = true;
                                JOptionPane.showMessageDialog(new Frame(),
                                        "Successful");
                                Image pImg = (new ImageIcon("png/ch/"+data.toString().split("&&&")[2].toString()+".png")).getImage();
                                Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                                ImageIcon profileImg = new ImageIcon(ptemp_img);
                                profileImgLabe3.setIcon(profileImg);
                                usernames[3] = data.toString().split("&&&")[0].toString();
                                profileImages[3] = data.toString().split("&&&")[2].toString();
                            }
                        }
                        myReader.close();
                    }
                    if(!singIn)
                        JOptionPane.showMessageDialog(new Frame(),
                                "Not Exist User");
                } catch (FileNotFoundException ee) {
                    System.out.println("An error occurred.");
                    ee.printStackTrace();
                }
            }
        });
        login.add(search3);

        /* user 4 */
        profileImg = new ImageIcon("png/ch/0.png");
        pImg = profileImg.getImage();
        ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImg = new ImageIcon( ptemp_img);
        JLabel profileImgLabe4 = new JLabel("", profileImg, JLabel.CENTER);

        profileImgLabe4.setBounds(690,420,90,150);
        login.add(profileImgLabe4);

        JTextField username4 = new JTextField();
        username4.setBounds(655, 550,150, 50);
        login.add(username4);
        JButton search4 = new JButton("Search");
        search4.setBounds(655, 610,150, 50);
        search4.setBackground(new Color(255,202,5));
        search4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Boolean singIn = false;
                    File f = new File("users.txt");
                    if (f.exists() && !username4.getText().equals(""))
                    {
                        File myObj = new File("users.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            if(data.toString().split("&&&")[0].toString().equals(username4.getText()))
                            {
                                singIn = true;
                                JOptionPane.showMessageDialog(new Frame(),
                                        "Successful");
                                Image pImg = (new ImageIcon("png/ch/"+data.toString().split("&&&")[2].toString()+".png")).getImage();
                                Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                                ImageIcon profileImg = new ImageIcon(ptemp_img);
                                profileImgLabe4.setIcon(profileImg);
                                usernames[4] = data.toString().split("&&&")[0].toString();
                                profileImages[4] = data.toString().split("&&&")[2].toString();
                            }
                        }
                        myReader.close();
                    }
                    if(!singIn)
                        JOptionPane.showMessageDialog(new Frame(),
                                "Not Exist User");
                } catch (FileNotFoundException ee) {
                    System.out.println("An error occurred.");
                    ee.printStackTrace();
                }
            }
        });
        login.add(search4);

        /* user 5 */
        profileImg = new ImageIcon("png/ch/0.png");
        pImg = profileImg.getImage();
        ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
        profileImg = new ImageIcon( ptemp_img);
        JLabel profileImgLabe5 = new JLabel("", profileImg, JLabel.CENTER);

        profileImgLabe5.setBounds(850,420,90,150);
        login.add(profileImgLabe5);

        JTextField username5 = new JTextField();
        username5.setBounds(815, 550,150, 50);
        login.add(username5);
        JButton search5 = new JButton("Search");
        search5.setBounds(815, 610,150, 50);
        search5.setBackground(new Color(255,202,5));
        search5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Boolean singIn = false;
                    File f = new File("users.txt");
                    if (f.exists() && !username5.getText().equals(""))
                    {
                        File myObj = new File("users.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            if(data.toString().split("&&&")[0].toString().equals(username5.getText()))
                            {
                                singIn = true;
                                JOptionPane.showMessageDialog(new Frame(),
                                        "Successful");
                                Image pImg = (new ImageIcon("png/ch/"+data.toString().split("&&&")[2].toString()+".png")).getImage();
                                Image ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                                ImageIcon profileImg = new ImageIcon(ptemp_img);
                                profileImgLabe5.setIcon(profileImg);
                                usernames[5] = data.toString().split("&&&")[0].toString();
                                profileImages[5] = data.toString().split("&&&")[2].toString();
                            }
                        }
                        myReader.close();
                    }
                    if(!singIn)
                        JOptionPane.showMessageDialog(new Frame(),
                                "Not Exist User");
                } catch (FileNotFoundException ee) {
                    System.out.println("An error occurred.");
                    ee.printStackTrace();
                }
            }
        });
        login.add(search5);

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

        background.add(heading);
        background.add(login);
        background.setBounds(0,0,1200,800);
        this.add(background);
        this.setSize(1220,820);
        this.setVisible(true);
    }

    private Mode setMode(boolean bargain, boolean sounds, boolean animations, boolean timeLimit, int timeLimitValue,
            boolean newCards, boolean borrowMoney, boolean avatarFace){
        return new Mode( bargain, sounds, animations, timeLimit, timeLimitValue, newCards, borrowMoney, avatarFace);
    }

    private void gameUI(Mode gameMode){
        // change the variables according to the game mode
        // then soutput the gui
    }

}
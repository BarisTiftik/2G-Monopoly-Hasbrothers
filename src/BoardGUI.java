import javax.swing.*;
import java.awt.*;

public class BoardGUI extends JFrame {
    private JPanel left;
    private JPanel right;
    private JPanel users;


    public BoardGUI(String[] usernames, String[] profileImages, String selectedMode) {


        GridBagLayout grid = new GridBagLayout();
        setLayout(grid);

        //left = new JPanel();

        //board
        /*ImageIcon boardImg = new ImageIcon("png/board.png");
        Image img = boardImg.getImage();

        Image temp_img = img.getScaledInstance( 200, HEIGHT ,Image.SCALE_SMOOTH);
        boardImg = new ImageIcon( temp_img);
        JLabel left = new JLabel("", boardImg, JLabel.CENTER);*/
        JLabel left = new JLabel(new ImageIcon("png/board_final.png"));
        getContentPane().add(left, new GridBagConstraints(0, 0, 1, 1, 0, 1,
                GridBagConstraints.BASELINE, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

        //right background
        ImageIcon backgroundImg = new ImageIcon("png/background.jpg");
        Image img2 = backgroundImg.getImage();
        Image temp_img2 = img2.getScaledInstance(300,700, Image.SCALE_SMOOTH);
        backgroundImg = new ImageIcon( temp_img2);
        //JLabel right = new JLabel("", backgroundImg, JLabel.SOUTH_EAST);
        JLabel right = new JLabel(new ImageIcon("png/background.jpg"));


        //JScrollPane jsp = new JScrollPane(right, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        // <=== add with constraints here

        //buttons
        JButton endTurn = new JButton("End Turn");
        endTurn.setBounds(0, 750,130, 50);
        endTurn.setBackground(new Color(255, 3, 3, 255));
        right.add(endTurn);

        JButton rollDice = new JButton("Roll Dice");
        rollDice.setBounds(0, 700,130, 50);
        rollDice.setBackground(new Color(210,210,5));
        right.add(rollDice);

        //user pictures.
        //users = new JPanel()
        JLabel[] userLabels = new JLabel[6];
        JLabel[] names = new JLabel[6];
        JLabel[] accounts = new JLabel[6];
        Font myFont = new Font("Ariel", Font.BOLD, 20);
        int width = 1;
        ImageIcon profileImg;
        Image pImg;
        Image ptemp_img;
        for (int i = 0; i < 6; i++)
        {
            if(usernames[i] != null){
                //System.out.println(usernames[i]);
                //System.out.println(profileImages[i]);
                profileImg = new ImageIcon("png/ch/" + profileImages[i] + ".png");
                pImg = profileImg.getImage();
                ptemp_img = pImg.getScaledInstance(90,150,Image.SCALE_SMOOTH);
                profileImg = new ImageIcon( ptemp_img);
                userLabels[i] = new JLabel();
                userLabels[i].setIcon(profileImg);
                names[i] = new JLabel();
                names[i].setText(usernames[i]);
                names[i].setFont(myFont);
                //userLabels[i] = new JLabel(new ImageIcon(profileImages[i] + ".png"));
                //user avatars and names
                userLabels[i].setText(usernames[i]);
                userLabels[i].setBounds((width * i * 90) + (i * 10) , 0, 90, 150);
                names[i].setBounds((width * i * 90) + (30), 155,90, 50);

                //bank accounts
                accounts[i] = new JLabel("1500$");
                accounts[i].setBounds((width * i * 90) + (30), 205,90, 50);
                accounts[i].setFont(myFont);

                right.add(userLabels[i]);
                right.add(names[i]);
                right.add(accounts[i]);
            }
        }
        //game flow label representation
        JLabel gameFlow = new JLabel();
        Image gameFlowImg = (new ImageIcon("png/board/gameflow.png")).getImage();
        Image temp = gameFlowImg.getScaledInstance(454,205,Image.SCALE_SMOOTH);
        ImageIcon gfImg = new ImageIcon(temp);
        gameFlow.setIcon(gfImg);
        gameFlow.setBounds(0, 250,454, 205 );
        right.add(gameFlow);

        //Mode
        JLabel mode;
        JLabel modePic = new JLabel();
        Image modeImg = (new ImageIcon("png/board/"+ selectedMode +".png")).getImage();
        Image mtemp_img = modeImg.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon mImg = new ImageIcon(mtemp_img);
        modePic.setIcon(mImg);
        if(selectedMode == null){
            mode = new JLabel("Mode: Classic");
        }
        else{
            mode = new JLabel("Mode: " + selectedMode);
        }
        mode.setFont(myFont);
        mode.setBounds(400, 750,250, 50);
        modePic.setBounds(400, 500,200, 200);
        right.add(modePic);
        right.add(mode);

        add(right, new GridBagConstraints(1, 0, 1, 1, 100, 1,
                GridBagConstraints.BASELINE, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));


        setResizable(false);
        pack();
        validate();
        //frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Monopoly Bilkent");
        setVisible(true);
        setSize(getToolkit().getScreenSize());
        setLocationRelativeTo(null);
    }
}

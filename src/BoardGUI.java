

import javax.swing.*;
import java.awt.*;

public class BoardGUI extends JFrame {
    private JPanel left;
    private JPanel right;


    public BoardGUI() {


        GridBagLayout grid = new GridBagLayout();
        setLayout(grid);

        //left = new JPanel();

        //board
        /*ImageIcon boardImg = new ImageIcon("png/board.png");
        Image img = boardImg.getImage();

        Image temp_img = img.getScaledInstance( 200, HEIGHT ,Image.SCALE_SMOOTH);
        boardImg = new ImageIcon( temp_img);
        JLabel left = new JLabel("", boardImg, JLabel.CENTER);*/
        JLabel left = new JLabel(new ImageIcon("png/board.png"));
        getContentPane().add(left, new GridBagConstraints(0, 0, 1, 1, 0, 1,
                GridBagConstraints.BASELINE, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

        //right background
        /*ImageIcon backgroundImg = new ImageIcon("png/background.jpg");
        Image img2 = backgroundImg.getImage();
        Image temp_img2 = img2.getScaledInstance(300,700, Image.SCALE_SMOOTH);
        backgroundImg = new ImageIcon( temp_img2);*/
        JLabel right = new JLabel(new ImageIcon("png/background.jpg"));


        //JScrollPane jsp = new JScrollPane(right, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        // <=== add with constraints here
        getContentPane().add(right, new GridBagConstraints(1, 0, 1, 1, 100, 1,
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

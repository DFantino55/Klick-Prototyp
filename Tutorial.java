import javax.swing.*;
import java.awt.*;

public class Tutorial extends JFrame {

    JPanel southPanel = new JPanel(new GridLayout());
    JPanel btnPanel = new JPanel(new GridLayout(1,3));

    JFrame frame1 = new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();

    JButton next = new JButton(">");
    JButton back = new JButton("<");
    JButton close = new JButton("X");

    public Tutorial(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPanel.add(close);
        btnPanel.add(back);
        btnPanel.add(next);
        southPanel.add(btnPanel, BorderLayout.EAST);

        frame1.getContentPane().add(southPanel, BorderLayout.SOUTH);

        frame1.setVisible(true);
    }

    public static void main(String[] args) {
        new Tutorial();
    }

}

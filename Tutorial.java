import javax.swing.*;
import java.awt.*;

public class Tutorial extends JFrame {

    JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

    JFrame frame1 = new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();

    JButton next = new JButton(">");
    JButton back = new JButton("<");
    JButton close = new JButton("X");

    public Tutorial(){
        frame1.setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPanel.add(close);
        btnPanel.add(back);
        btnPanel.add(next);

        frame1.getContentPane().add(btnPanel, BorderLayout.SOUTH);

        frame1.setVisible(true);
    }

    public static void main(String[] args) {
        new Tutorial();
    }

}

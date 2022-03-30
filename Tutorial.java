import javax.swing.*;
import java.awt.*;

public class Tutorial extends JFrame {

    JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    JPanel searchpanel = new JPanel();

    JTextField searchbar = new JTextField("");

    JFrame frame1 = new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();

    JButton next = new JButton(">");
    JButton back = new JButton("<");
    JButton close = new JButton("X");
    JButton search = new JButton("suchen");

    public Tutorial(){
        addButtons(frame1);
        addButtons(frame2);
        addButtons(frame3);

        addSearchPanel(frame1);
        addSearchPanel(frame2);
        addSearchPanel(frame3);
    }

    public static void main(String[] args) {
        new Tutorial();
    }

    public void addButtons(JFrame frame){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPanel.add(close);
        btnPanel.add(back);
        btnPanel.add(next);

        frame.getContentPane().add(btnPanel, BorderLayout.SOUTH);

    }

    public void addSearchPanel(JFrame frame){
        searchpanel.setLayout(new FlowLayout());
        frame.getContentPane().add(searchpanel, BorderLayout.NORTH);
        searchbar.setPreferredSize(new Dimension(220, 30));
        searchpanel.add(searchbar);
        searchpanel.add(search);
        frame.setVisible(true);
    }



}

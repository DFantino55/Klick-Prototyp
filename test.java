import javax.swing.*;
import java.awt.*;

public class test extends JFrame {

    JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    JPanel searchpanel = new JPanel();
    JPanel arbeitsflaeche = new JPanel();
    JTextArea textArea1 = new JTextArea();
    JTextArea textArea2 = new JTextArea();

    JTextField searchbar = new JTextField("");

    JFrame frame1 = new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();

    JButton next = new JButton(">");
    JButton back = new JButton("<");
    JButton close = new JButton("X");
    JButton search = new JButton("suchen");

    public test(){
        addButtons(frame1);
        addButtons(frame2);
        addButtons(frame3);

        addSearchPanel(frame1);
        addSearchPanel(frame2);
        addSearchPanel(frame3);

        addTextArea(frame1);
        addTextArea(frame2);
        addTextArea(frame3);
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

    public void addTextArea(JFrame frame){
        frame.getContentPane().add(arbeitsflaeche, BorderLayout.CENTER);
        arbeitsflaeche.setLayout(new FlowLayout());
        arbeitsflaeche.add(textArea1);
        arbeitsflaeche.add(textArea2);
        textArea1.setPreferredSize(new Dimension(200,400));
        textArea2.setPreferredSize(new Dimension(200,400));
        textArea1.setLineWrap(true);
        textArea2.setLineWrap(true);
        textArea1.setText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
                "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum " +
                "dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod" +
                " tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam" +
                " et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem" +
                " ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
                "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At");
        textArea2.setText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
                "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum " +
                "dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
                "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam " +
                "et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
                "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
                "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At");
    }



}

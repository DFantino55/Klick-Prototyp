package src.src;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AfterFrame extends JFrame {
    JPanel sidebarPanel = new JPanel();
    JPanel btnPanel = new JPanel();
    JFrame frame1 = new JFrame();

    JPanel searchpanel = new JPanel();
    JPanel arbeitsflaeche = new JPanel();
    JTextArea textArea1 = new JTextArea();
    JTextArea textArea2 = new JTextArea();
    JButton file = new JButton("Anzeigen");
    JButton edit = new JButton("Erfassen");
    JButton help = new JButton("Eintragen");
    JTextField searchbar = new JTextField("");
    JButton search = new JButton("suchen");

    public AfterFrame(){
        addSideBarPanel(frame1);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addSearchPanel(frame1);
        frame1.setLocationRelativeTo(null);
        frame1.setSize(500,500);
        addTextArea(frame1);
        new Tutorial();

    }

    public void addSideBarPanel(JFrame frame){
        //frame = new JFrame("MenuSample Example");
        btnPanel.setLayout(new GridLayout(3,1));
        sidebarPanel.setLayout(new BorderLayout());
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel jLabel = new JLabel(new ImageIcon("Images/Kanti-Hottingen_Schriftzug.jpg"));




        btnPanel.add(file);
        file.addActionListener(new btnListener());
        btnPanel.add(edit);
        edit.addActionListener(new btnListener());
        btnPanel.add(help);
        help.addActionListener(new btnListener());


        sidebarPanel.add(btnPanel, BorderLayout.NORTH);
        sidebarPanel.add(new JLabel(), BorderLayout.CENTER);
        //sidebarPanel.add()
        frame.getContentPane().add(sidebarPanel, BorderLayout.WEST);
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
        //textArea2.setPreferredSize(new Dimension(200,400));
        textArea1.setLineWrap(true);
       // textArea2.setLineWrap(true);


        /*
        textArea2.setText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
                "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum " +
                "dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
                "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam " +
                "et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
                "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
                "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At");


         */
    }


    public static void main(String[] args) {
        new AfterFrame();
    }

    class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea1.setText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                    "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
                    "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum " +
                    "dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod" +
                    " tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam" +
                    " et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem" +
                    " ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
                    "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At");
        }
    }
}



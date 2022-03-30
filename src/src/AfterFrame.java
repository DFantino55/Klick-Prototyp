import javax.swing.*;
import java.awt.*;

public class AfterFrame extends JFrame {
    JPanel sidebarPanel = new JPanel();
    JFrame frame1 = new JFrame();

    public AfterFrame(){
        addSideBarPanel(frame1);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addSideBarPanel(JFrame frame){
        //frame = new JFrame("MenuSample Example");
        sidebarPanel.setLayout(new GridLayout(3,1));
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel jLabel = new JLabel(new ImageIcon("Images/Kanti-Hottingen_Schriftzug.jpg"));

        JButton file = new JButton("File");
        JButton edit = new JButton("Edit");
        JButton help = new JButton("Help");


        sidebarPanel.add(file);

        sidebarPanel.add(edit);
        sidebarPanel.add(help);
        //sidebarPanel.add(jLabel);

        //frame.setSize(350, 250);

        frame.getContentPane().add(sidebarPanel, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new AfterFrame();
    }
}

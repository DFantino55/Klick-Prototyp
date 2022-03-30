package src.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tutorial extends JFrame {

    JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

    JFrame frame1 = new JFrame();

    JButton next = new JButton(">");
    JButton back = new JButton("<");
    JButton close = new JButton("X");

    JTextArea textArea = new JTextArea("NEW 1 ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");

    public Tutorial(){

        frame1.add(textArea);
        textArea.setLineWrap(true);
        textArea.setEditable(false);

        addButtons(frame1);

    }

    public static void main(String[] args) {
        new Tutorial();
    }

    public void addButtons(JFrame frame){
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        btnPanel.add(close);
        btnPanel.add(back);
        btnPanel.add(next);

        frame.getContentPane().add(btnPanel, BorderLayout.SOUTH);
        frame.setVisible(true);

        next.addMouseListener(new MouseAdapter() {
            private int counter = 1;

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (counter == 1){
                    textArea.setText("NEW 2 ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
                    this.counter++;
                } else if (counter == 2){
                    textArea.setText("NEW 3 ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
                    next.setEnabled(false);
                }
            }
        });

        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.setVisible(false);
            }
        });

    }

}

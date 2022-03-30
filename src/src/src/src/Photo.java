package src.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class Photo extends JFrame {

    ImageIcon image = new ImageIcon("src/src/src/img.png");
    JLabel photoLabel = new JLabel(image);

    public Photo(){
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        photoLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addFunctionality();

        getContentPane().add(photoLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Photo();
    }

    public void addFunctionality(){
        photoLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=5qap5aO4i9A"));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

}

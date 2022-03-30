import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

class VerticalMenuBar extends JMenuBar {
    private static final LayoutManager grid = new GridLayout(0,1);
    public VerticalMenuBar() {
        setLayout(grid);
    }
}


public class Sidebar {

    public static void main(final String args[]) {
        JFrame frame = new JFrame("MenuSample Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new VerticalMenuBar();

        // File Menu, F - Mnemonic
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwingLoginExample implements ActionListener, KeyListener {


    private JFrame jFrame;
    private Container contentPane;

    //Komponenten
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userJTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton resetButton;
    private JCheckBox showPasswordBox;
    private JCheckBox hidePasswordBox; //Wird weggelassen im GUI, somit hidePasswordBox nicht mehr beachten

    private final String usernameString = "user123";
    private final String passwordString = "123456";


    public SwingLoginExample(){
        initUI(); //Fenster erstellt
        createMenu(); //Menü erstellt
        createComponent(); //Komponenten erstellt
        addCompenentsToConentPane(); //Komponenten hinzufügen
        setLayoutManager(); //setze das Layout für den Container
        setLocationAndSizeOfComponent(); //Position/Grösse von Komponenten bestimmen
    }


    //Fenster Jframe erstellen
    private void initUI(){
        jFrame = new JFrame("Login");
        jFrame.setSize(400, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        contentPane = jFrame.getContentPane();
        jFrame.setVisible(true);
    }

    //Menü erstellen

    private void createMenu(){
        //Menü -> JmenuBar -> Jmenu -> jMenuItem

        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu sourceMenu = new JMenu("Source");

        jMenuBar.add(fileMenu);
        jMenuBar.add(editMenu);
        jMenuBar.add(sourceMenu);

        JMenuItem exitItem = new JMenuItem("Exit", new ImageIcon("src/images/xmark.png"));

        /* //Anonyme Klasse
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
         */

        exitItem.addActionListener(e->{ //Lambda-Ausdruck
            System.exit(0);
        });

        //Shortcut für Exit Listitem, dass heisst alt+e schliesst das Programm sofort
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));

        fileMenu.add(exitItem);

        jFrame.setJMenuBar(jMenuBar); //Unbedingt jMenuBar!!! und nicht menubar!!!
    }

    //Kompententen erstellen
    private void createComponent(){
        userLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");

        userJTextField = new JTextField();
        userJTextField.addKeyListener(this);
        passwordField = new JPasswordField();
        passwordField.addKeyListener(this); //In dieser Klasse hinzugefügt

        loginButton = new JButton("Login");
        loginButton.addActionListener(this); //Listener hinzufügen

        resetButton = new JButton("reset");
        resetButton.addActionListener(this); //Listener hinzufügen

        showPasswordBox = new JCheckBox("Password anzeigen");
        showPasswordBox.addActionListener(this);

        hidePasswordBox = new JCheckBox("Password verbergen");
    }

    //Komponenten hinzufügen
    private void addCompenentsToConentPane(){
        contentPane.add(userLabel);
        contentPane.add(passwordLabel);
        contentPane.add(userJTextField);
        contentPane.add(passwordField);
        contentPane.add(hidePasswordBox);
        contentPane.add(showPasswordBox);
        contentPane.add(loginButton);
        contentPane.add(resetButton);


    }

    private void setLocationAndSizeOfComponent(){
        userLabel.setBounds(50, 150, 100, 30); //x-position, y-position, breite, höhe
        passwordLabel.setBounds(50,220, 100, 30);
        userJTextField.setBounds(150,150, 150, 30);
        passwordField.setBounds(150,220, 150, 30);
        //hidePasswordBox.setBounds(50,250, 150, 30);
        showPasswordBox.setBounds(150,250, 150, 30);
        loginButton.setBounds(50,300, 100, 30);
        resetButton.setBounds(200,300, 100, 30);


    }


    //Layout setzen
    private void setLayoutManager(){
       // FlowLayout flowLayout = new FlowLayout(FlowLayout.LEADING, 30, 30);

        //GridLayout gridLayout = new GridLayout(4, 2, 30, 30);
        contentPane.setLayout(null);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingLoginExample();
            }
        });
    }

    //Dialog erstellen
    private void createMessage(String message){
      new Tutorial();

    }



    //Event Handling
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginButton){
            checkInput();
        }
        if (e.getSource() == resetButton){
            userJTextField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == showPasswordBox){
            //Überprüfug ob Checkbox ausgewählt ist oder nicht
            if (showPasswordBox.isSelected()){
                passwordField.setEchoChar((char) 0); //Passwort lesbar anzeigen
            }else {
                passwordField.setEchoChar('*'); //Passwort unlesbar mit * anzeigen
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

       if (e.getKeyChar() == KeyEvent.VK_ENTER ){
           checkInput();
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void checkInput(){
        String userString = userJTextField.getText();
        char [] chars = passwordField.getPassword();
        String userPassword = new String(chars); //Umwandlung in String von Char

        if (usernameString.equalsIgnoreCase(userString) && passwordString.equalsIgnoreCase(userPassword)){
            System.out.println("Login erfolgreich");
            createMessage("Login erfolgreich");
        }else {
            System.out.println("Username oder Passwort falsch");
            createMessage("Username oder Passwort falsch");
        }
    }
}

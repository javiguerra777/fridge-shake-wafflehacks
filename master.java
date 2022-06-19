
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/*  ww  w . j  av a  2 s.  co m*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LoginFrame extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel welcomeLabel = new JLabel("Welcome! Please Login to FridgeShake");
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        welcomeLabel.setBounds(50, 100, 250,30 );
        userLabel.setBounds(50, 180, 100, 30);
        passwordLabel.setBounds(50, 250, 100, 30);
        userTextField.setBounds(150, 180, 150, 30);
        passwordField.setBounds(150, 250, 150, 30);
        showPassword.setBounds(150, 280, 150, 30);
        loginButton.setBounds(50, 350, 100, 30);
        resetButton.setBounds(200, 350, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(welcomeLabel);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }


}

public class master extends JFrame implements ActionListener {
    
    Container container = getContentPane();
    JLabel welcomeLabel = new JLabel("Welcome! Please Login to FridgeShake");
    JLabel userLabel = new JLabel("USERNAME");

    JFrame frame = new JFrame("FridgeShake");
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("Menu");
    JMenuItem m11 = new JMenuItem("Shake Fridge");
    JMenuItem m12 = new JMenuItem("View Recipes");
    JMenuItem m13 = new JMenuItem("Meet Experts");
    JMenuItem m14 = new JMenuItem("Login");
    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Enter Text");
    JTextField tf = new JTextField(10); // accepts upto 10 characters
    JButton button1 = new JButton("Sort by Ingredients");
    JButton button2 = new JButton("Sort by Time");
    JTextArea ta = new JTextArea();

    JButton shakeButton = new JButton("ShakeFridge");
    JButton recipeButton = new JButton("View Recipes");
    JButton expertButton = new JButton("Meet Experts");
    //Imageslider slide = new Imageslider();

    master() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addComponentsToPanel();
        addComponentsToFrame();
        addMenuComponents();
        addActionEvent();
    }

    public void setLayoutManager() {
        frame.setSize(500, 500);
        container.setLayout(null);
    }

    public void addComponentsToContainer() {
        container.add(welcomeLabel);
        container.add(shakeButton);
        container.add(recipeButton);
        container.add(expertButton);
        //container.add(slide);
    }

    public void addComponentsToPanel(){
        panel.add(label);
        panel.add(tf);
        panel.add(button1);
        panel.add(button2);
    }

    public void setLocationAndSize() {
        shakeButton.setBounds(100, 80, 250,50 );
        recipeButton.setBounds(100, 180, 250, 50);
        expertButton.setBounds(100, 280, 250,50);
    }
    public void addMenuComponents(){
        mb.add(m1);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
    }
    public void addComponentsToFrame(){
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, container); //ta
        frame.setVisible(true);

    }

    public void addActionEvent() {
        m1.addActionListener(this);
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m14.addActionListener(this);
        shakeButton.addActionListener(this);

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == m11) {
            System.out.println("first menu");
        }

        if (e.getSource() == m12) {
            System.out.println("second menu");
        }
        if (e.getSource() == m13) {
            System.out.println("third menu");
        }

        if (e.getSource() == m14) {
           // System.out.println("Login");
           LoginFrame log = new LoginFrame();
        }
    }

    
  public static void main (String[] args) {

    LoginFrame loginframe = new LoginFrame();
    
    loginframe.setTitle("Login Form");
    loginframe.setVisible(true);
    loginframe.setBounds(10, 10, 370, 600);
    loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    loginframe.setResizable(false);

   master mast = new master(); 
    //main.setTitle("Welcome to FridgeShake! ");
    //main.setVisible(true);
    //main.setBounds(10, 10, 370, 600);
    //main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //main.setResizable(false);

}
}






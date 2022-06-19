
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/*  ww  w . j  av a  2 s.  co m*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainScreen3 extends JFrame implements ActionListener {
    
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
    LoginFrame loginframe = new LoginFrame();
    Imageslider img2 = new Imageslider();
    profileFrame profile = new profileFrame();
    //Imageslider slide = new Imageslider();

    mainScreen3() {
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
        recipeButton.addActionListener(this);
        expertButton.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == m11) {
            System.out.println("first menu");
            Imageslider slide = new Imageslider();
            //slide.displayShakeFrame(slide);

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
           log.displayLoginFrame(log);
        }

        if (e.getSource() == shakeButton) {
            // System.out.println("Login");
            //Imageslider slide = new Imageslider();
            //slide.displayShakeFrame(slide);
         }
         if (e.getSource() == recipeButton) {
            // System.out.println("Login");
            //LoginFrame log = new LoginFrame();
             //log.displayLoginFrame(log);
         }
         if (e.getSource() == expertButton) {
            // System.out.println("Login");
            LoginFrame log = new LoginFrame();
             //log.displayLoginFrame(log);
         }
    }

    
  public static void main (String[] args) {
    LoginFrame loginframe = new LoginFrame();
    Imageslider img2 = new Imageslider();
    mainScreen3 main = new mainScreen3 (); 
   profileFrame frame = new profileFrame();
    //main.setTitle("Welcome to FridgeShake! ");
    //main.setVisible(true);
    //main.setBounds(10, 10, 370, 600);
    //main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //main.setResizable(false);

}
}






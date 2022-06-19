
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
/*  ww  w . j  av a  2 s.  co m*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.WindowConstants;
//import javax.swing.border.LineBorder;
//import javax.swing.border.TitledBorder;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

//class Imageslider extends JFrame implements ActionListener



public class mainScreen extends JFrame implements ActionListener {
    public void addActionEvent(JButton button) {
        button.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == button) {
            

        }
    }
  public static void main (String[] args) {
   // PanelModel panel = new PanelModel();
    //Creating the frame
    //Imageslider obj = new Imageslider();

    JFrame frame = new JFrame("FridgeShake");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(500, 500);
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("Menu");
//    JMenu m2 = new JMenu("Help");
    mb.add(m1);
//    mb.add(m2);
    JMenuItem m11 = new JMenuItem("Shake Fridge");
    JMenuItem m12 = new JMenuItem("View Recipes");
    JMenuItem m13 = new JMenuItem("Cooking Hacks");
    JMenuItem m14 = new JMenuItem("Login");
    
    m1.add(m11);
    m1.add(m12);
    m1.add(m13);
    m1.add(m14);

    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Enter Text");
    JTextField tf = new JTextField(10); // accepts upto 10 characters

    JButton button1 = new JButton("Sort by Ingredients");
    JButton button2 = new JButton("Sort by Time");
    panel.add(label);
    panel.add(tf);
    panel.add(button1);
    panel.add(button2);
    // frame.getContentPane().add(button1); // Adds Button to content pane of frame
    // frame.getContentPane().add(button2);
    JTextArea ta = new JTextArea();
    Imageslider slide = new Imageslider();

    //JPanel pa = new JPanel(new FlowLayout()); 
    //slide = new Imageslider();
    //slide = 
    //b2 = new JButton(">>");
    //pa.add(slide);
    //p.add(b2);
    //add(pa,BorderLayout.CENTER); 
    //add(panel,BorderLayout.SOUTH);



    frame.getContentPane().add(BorderLayout.SOUTH, panel);
    frame.getContentPane().add(BorderLayout.NORTH, mb);
//    frame.getContentPane().add(BorderLayout.CENTER,pa);
    frame.getContentPane().add(BorderLayout.CENTER, ta); //ta
    frame.setVisible(true);

}
}






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

class Imageslider extends JFrame implements ActionListener
{
  ImageIcon s[]; 
  JLabel l;
  JButton b1,b2; 
  int i, l1; 
  JPanel p;

  public Imageslider()
  {
    setLayout(new BorderLayout());
    setSize(100,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    JPanel p = new JPanel(new FlowLayout()); 
    b1 = new JButton("<<");
    b2 = new JButton(">>");
    p.add(b1);
    p.add(b2);
    add(p,BorderLayout.SOUTH); 
    b1.addActionListener(this); 
    b2.addActionListener(this); 
    s= new ImageIcon[2]; 
    s[0] = new ImageIcon("strawberryCake.jpg"); 
    s[1] = new ImageIcon("strawberryWaffle.jpg"); 
    l = new JLabel("", JLabel.CENTER); 
    add(l,BorderLayout.CENTER); 
    l.setIcon(s[0]);
  }

  public void actionPerformed(ActionEvent e)
  {
      if(e.getSource()==b1)
      {
          if(i==0)
          {
              JOptionPane.showMessageDialog(null,"This is First Image");
          }
          else
              {
              i=i-1;
              l.setIcon(s[i]);
          }
      }
      if(e.getSource()==b2)
      {
          if(i==s.length-1)
          {
              JOptionPane.showMessageDialog(null,"This is LastImage");
          }
          else
              {
              i=i+1;
              l.setIcon(s[i]);
              }
          }
       }
    }


public class mainScreen {
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
    
    m1.add(m11);
    m1.add(m12);
    m1.add(m13);

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





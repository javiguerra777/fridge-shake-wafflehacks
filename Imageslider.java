import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
    setSize(300,300);
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
    public static void main(String args[]){

        Imageslider img2 = new Imageslider();
/* 
        JFrame f = new JFrame();
        f.setTitle("Example2");
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(new JButton("Menu Button"));
        
        //JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //Imageslider img1 = new Imageslider();
        //p2.add(img1);

        //JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //Imageslider img2 = new Imageslider();
        //p3.add(img2);

        JPanel p3 = new JPanel(new Imageslider());
        JPanel p3 = new JPanel(new Imageslider());


        JPanel global = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.weighty = 1.0f; // added
        gbc.gridy = 0;
        global.add(p1, gbc);
        gbc.gridy++;
        global.add(p2, gbc);
        gbc.gridy++;
        global.add(p3, gbc);
    
        f.add(global);
        f.pack();
        f.setVisible(true);
        */

    }

    }
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Imageslider extends JFrame implements ActionListener
{
  ImageIcon s[]; 
  JLabel l;
  JButton b1,b2; 
  int i, l1; 
  JPanel p;
  JTextField ingredient;
  JTextField time;

  public void displayShakeFrame(Imageslider slide){
    slide.setTitle("Display ShakeFrame");
    slide.setVisible(true);
    slide.setBounds(10, 10, 370, 600);
    slide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    slide.setResizable(false);
}

  public Imageslider()
  {
    setLayout(new BorderLayout());
    setSize(400,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    JLabel Imageslider = new JLabel("<html><font size ='4' color =orange> Shake your Fridge /n after setting time and ingredients!  </font></html>");

    add(Imageslider,BorderLayout.NORTH); 
    JPanel p = new JPanel(new FlowLayout()); 
    b1 = new JButton("<<");
    ingredient  = new JTextField("type ingredients to shake");
    time  = new JTextField("type max time to cook");
    b2 = new JButton(">>");
    p.add(b1);
    p.add(ingredient);
    p.add(time);
    p.add(b2);
    add(p,BorderLayout.SOUTH); 
    b1.addActionListener(this); 
    b2.addActionListener(this); 
    s= new ImageIcon[3]; 

    ImageIcon imageIcon = new ImageIcon("applePieBread.jpg");
    Image image = imageIcon.getImage();
    Image newimg = image.getScaledInstance(200,200,java.awt.Image.SCALE_SMOOTH);
    ImageIcon foodIcon= new ImageIcon(newimg);

    ImageIcon imageIcon2 = new ImageIcon("cinammonEggyBread.jpg");
    ImageIcon imageIcon3 = new ImageIcon("CurriedEggSalad.jpg");
    //Image image3 = imageIcon3.getImage();
    //Image newimg3 = image3.getScaledInstance(200,200,java.awt.Image.SCALE_SMOOTH);
    //ImageIcon foodIcon3= new ImageIcon(newimg3);

    s[0] = foodIcon; 
    s[1] = imageIcon2;
    s[2] = imageIcon3; 
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
        slide.setTitle("Display ShakeFrame");
        slide.setVisible(true);
        slide.setBounds(10, 10, 370, 600);
        slide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slide.setResizable(false);
    }

    }


    
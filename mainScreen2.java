
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


public class mainScreen2  {
  public static void main (String[] args) {
  
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints(); 
    if (shouldFill){
        //natural height, maximum width
        c.fill = GridBagConstraints.VERTICAL;
    }

    ImageSlider carousel1 = new ImageSlider(); 
    
    if (shouldWeightX){
        c.weightx =0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0; 
    c.gridy =0; 
    pane.add(button,c);

    filler = new JButton(""); 
    c.weightx =0.5;
    c.gridx =1;
    c.gridy =0; 
    pane.add(filler,c);

    button = new JButton("Menu");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx =0.5; 
    c.gridx =2; 
    c.gridy =0; 
    pane.add(button,c);

    ImageSlider carousel = new ImageSlider();
    


}
}





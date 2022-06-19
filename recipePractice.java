import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon; 
import java.awt.Image;

class recipiesFrame extends JFrame implements ActionListener {
    ///label.setFont(this.font);
    Container container = getContentPane();

    JLabel recipeHead = new JLabel("Recipies");
    ImageIcon imageIcon1 = new ImageIcon("cinnamonEggyBread.jpeg");
    Image image1 = imageIcon1.getImage();
    Image newimg1 = image1.getScaledInstance(300,80,java.awt.Image.SCALE_SMOOTH);
    ImageIcon recipeIcon1= new ImageIcon(newimg1);
    JLabel recipe1 = new JLabel(recipeIcon1);
    JLabel recipe1Label = new JLabel("<html><fontsize = 9; color = blue> Eggy Bread with Steweed Apples </font></html>");
    JLabel recipe1Descript = new JLabel("<html> <fontsize =7> Time taken : 10 minutes Rating: 9/10 Extra Ingredients Needed : Butter, Milk </font></html>");
    JButton viewButton = new JButton("View Recipe");

    recipiesFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        recipeHead.setBounds(100,50,100,30);
        recipe1.setBounds(30, 400, 100,100 );
        recipe1Label.setBounds(180, 100, 80,20 );
        recipe1Descript.setBounds(180, 120, 100,80 );
        viewButton.setBounds(180,500,100,20);
        //showPassword.setBounds(200, 1500, 120, 30);
        
    }

    public void addComponentsToContainer() {
        container.add(recipeHead);
        container.add(recipe1);
        container.add(recipe1Label);
        container.add(recipe1Descript);
        container.add(viewButton);
    }

    public void addActionEvent() {
        viewButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == viewButton) {
            
            System.out.println("Recipe");
            //JOptionPane.showMessageDialog(this, "The recipe is ...");}

        }
    }

static class recipe {
    public static void main(String[] args) {
        recipiesFrame frame = new recipiesFrame();
        frame.setTitle("Recipes");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}
}

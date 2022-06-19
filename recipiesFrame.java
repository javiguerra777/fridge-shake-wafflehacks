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
    ImageIcon imageIcon1 = new ImageIcon ("cinnamonEggyBread.jpg");
    Image image1 = imageIcon1.getImage();
    Image newimg1 = image1.getScaledInstance(100,150,java.awt.Image.SCALE_SMOOTH);
    ImageIcon recipeIcon1= new ImageIcon(newimg1);
    JLabel recipe1 = new JLabel(recipeIcon1);
    JLabel recipe1Label = new JLabel("<html><fontsize = 9; color = blue> Eggy Bread with Steweed Apples </font></html>");
    JLabel recipe1Descript = new JLabel("<html> <fontsize =7> Time taken : 10 minutes \n Rating: 9/10 \n Extra Ingredients Needed : Butter, Milk </font></html>");
   
    ImageIcon imageIcon2 = new ImageIcon("CurriedEggSalad.jpg");
    Image image2 = imageIcon2.getImage();
    Image newimg2 = image2.getScaledInstance(100,150,java.awt.Image.SCALE_SMOOTH);
    ImageIcon recipeIcon2= new ImageIcon(newimg2);
    JLabel recipe2 = new JLabel(recipeIcon2);
    JLabel recipe2Label = new JLabel("<html><fontsize = 9; color = blue> Cinnamon Apple Pie Bread </font></html>");
    JLabel recipe2Descript = new JLabel("<html> <fontsize =7> Time taken : 25 minutes \n Rating: 8.5/10 \n Extra Ingredients Needed : Cinnamon </font></html>");
    JLabel alert2 = new JLabel("<html><fontsize=5> Need to have a mixer!</font></html>");

    ImageIcon imageIcon3 = new ImageIcon("CurriedEggSalad.jpg");
    Image image3 = imageIcon3.getImage();
    Image newimg3 = image3.getScaledInstance(100,150,java.awt.Image.SCALE_SMOOTH);
    ImageIcon recipeIcon3= new ImageIcon(newimg3);
    JLabel recipe3 = new JLabel(recipeIcon3);
    JLabel recipe3Label = new JLabel("<html><fontsize = 9; color = blue> Curried Apple Egg Salad Sandwich </font></html>");
    JLabel recipe3Descript = new JLabel("<html> <fontsize =7> Time taken : 30 minutes \n Rating: 9.5/10 \n Extra Ingredients Needed : lime, mayonnaise, red onnion </font></html>");
    JButton viewButton = new JButton("View Recipe");

<<<<<<< HEAD
    ImageIcon imageIcon = new ImageIcon("chef.jpeg");
    Image image = imageIcon.getImage();
    Image newimg = image.getScaledInstance(100,150,java.awt.Image.SCALE_SMOOTH);
    ImageIcon profileIcon= new ImageIcon(newimg);
    JLabel profilePic = new JLabel(profileIcon);
    JLabel commentLabel = new JLabel("Comment");
    JLabel nameLabel = new JLabel("<html><font size ='7' color = blue> Michelle </font></html>"); //Get Name Later 
    //JLabel userLabel = new JLabel("Create User Name"); 
    JLabel hashTagLabel = new JLabel("#SalmonLover #Healthy");
    JTextField commentField = new JTextField();
    JButton messageButton = new JButton("Message");
    JButton sessionButton = new JButton("Book A Session");
    JButton followButton = new JButton("Follow");
    //JCheckBox showPassword = new JCheckBox("Show Password");

    void profileFrame() {
=======
    recipiesFrame() {
>>>>>>> 341100fe9162ce927264efe055ffd8d61cc95ef3
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

        recipe1.setBounds(30, 100, 100,100 );
        recipe2.setBounds(30, 240, 100, 100);
        recipe3.setBounds(30, 400, 100, 100);

        recipe1Label.setBounds(180, 100, 80,20 );
        recipe2Label.setBounds(180, 240, 80, 20);
        recipe3Label.setBounds(180, 400, 80, 20);

        recipe1Descript.setBounds(180, 120, 100,80 );
        recipe2Descript.setBounds(180, 260, 100, 80);
        recipe3Descript.setBounds(180, 420, 100, 80);

        alert2.setBounds(180,300,100,20);

        viewButton.setBounds(180,500,100,20);
        //showPassword.setBounds(200, 1500, 120, 30);
        
    }

    public void addComponentsToContainer() {
        container.add(recipeHead);
        container.add(recipe1);
        container.add(recipe1Label);
        container.add(recipe1Descript);
        container.add(recipe2);
        container.add(recipe2Label);
        container.add(recipe2Descript);
        container.add(alert2);
        container.add(recipe3);
        container.add(recipe3Label);
        container.add(recipe3Descript);
        container.add(viewButton);
    }

    public void addActionEvent() {
        viewButton.addActionListener(this);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == viewButton) {
            
            JOptionPane.showMessageDialog(this, "The recipe is ...");}

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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon; 
import java.awt.Image;

class profileFrame extends JFrame implements ActionListener {
    ///label.setFont(this.font);
    Container container = getContentPane();
    JLabel profileHead = new JLabel("<html><font size ='5' color =orange> My Saved Favorite Expert </font></html>");
    //JLabel profilePic = new JLabel( new ImageIcon ("chef"));
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

    profileFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        profileHead.setBounds(80, 10, 300,150 );
        profilePic.setBounds(115, 100, 100,150 );
        nameLabel.setBounds(100, 260, 150, 30);
        hashTagLabel.setBounds(100, 300, 150, 30);
        followButton.setBounds(100, 340, 150, 30);
        messageButton.setBounds(100, 380, 150, 30);
        sessionButton.setBounds(100, 420, 150, 30);
        commentLabel.setBounds(100, 460, 150,30);
        commentField.setBounds(100,460, 150, 30);
        //showPassword.setBounds(200, 1500, 120, 30);
        
    }

    public void addComponentsToContainer() {
        container.add(profileHead);
        container.add(profilePic);
        container.add(nameLabel);
        container.add(hashTagLabel);
        container.add(followButton);
        container.add(messageButton);
        container.add(sessionButton);
        container.add(commentLabel);
        container.add(commentField);
    }

    public void addActionEvent() {
        followButton.addActionListener(this);
        messageButton.addActionListener(this);
        sessionButton.addActionListener(this);
        commentField.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        /*if (e.getSource() == loginButton) {
            
            //String userText;
            //String pwdText;
            String commentText;

            commentText = commentField.getText();
            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Registration Successful"); // WE NEED TO FIX THIS
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password"); //USERNAME ALREADY TAKEN
                //userTextField.setText("");
            }

        }*/
        
      
       //Coding Part of showPassword JCheckBox
       
       /* 
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
           


        } */
    
    }


static class profile {
    public static void main(String[] args) {
        profileFrame frame = new profileFrame();
        frame.setTitle("Profile");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon; 
import java.awt.Image;

class recipiesFrame extends JFrame implements ActionListener {
    ///label.setFont(this.font);
    Container container = getContentPane();


    JLabel profileHead = new JLabel("Recipies");

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
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        profilePic.setBounds(115, 80, 100,150 );
        nameLabel.setBounds(100, 240, 150, 30);
        hashTagLabel.setBounds(100, 280, 150, 30);
        followButton.setBounds(100, 320, 150, 30);
        messageButton.setBounds(100, 360, 150, 30);
        sessionButton.setBounds(100, 400, 150, 30);
        commentLabel.setBounds(100, 440, 150,30);
        commentField.setBounds(100,440, 150, 30);
        //showPassword.setBounds(200, 1500, 120, 30);
        
    }

    public void addComponentsToContainer() {
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

import java.io.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

class RegistrationFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel registerLabel = new JLabel("<html><font size ='8' color = blue> Create your FridgeShake Account </font></html>");
    JLabel nameLabel = new JLabel("Enter Full Name");
    JLabel userLabel = new JLabel("Create User Name");
    JLabel passwordLabel = new JLabel("Create Password");
    JTextField nameTextField = new JTextField("");
    JTextField userTextField = new JTextField("");
    JPasswordField passwordField = new JPasswordField("");
    JButton loginButton = new JButton("Back to Login");
    JButton registerButton = new JButton("Register");
    JCheckBox showPassword = new JCheckBox("Show Password");


    RegistrationFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        registerLabel.setBounds(80, 100, 250,50 );
        nameLabel.setBounds(50, 180, 120, 30);
        userLabel.setBounds(50, 250, 120, 30);
        passwordLabel.setBounds(50, 320, 100, 30);
        nameTextField.setBounds(200, 180, 120, 30);
        userTextField.setBounds(200, 250, 120, 30);
        passwordField.setBounds(200, 320, 120, 30);
        showPassword.setBounds(200, 1500, 120, 30);
        loginButton.setBounds(50, 400, 120, 30);
        registerButton.setBounds(200, 400, 120, 30);


    }

    public void addComponentsToContainer() {
        container.add(registerLabel);
        container.add(nameLabel);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(nameTextField);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(registerButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            
            String userText;
            String pwdText;
            String nameText;

            userText = userTextField.getText();
            nameText = nameTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Registration Successful"); // WE NEED TO FIX THIS
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password"); //USERNAME ALREADY TAKEN
                //userTextField.setText("");
            }

        }
      
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }

}

class Registration {
    public static void main(String[] args) {
        RegistrationFrame frame = new RegistrationFrame();
        frame.setTitle("Registration Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}
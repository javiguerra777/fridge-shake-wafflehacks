import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginFrame extends JFrame implements ActionListener {
  // private static final String USER_AGENT = "Mozilla/5.0";
  // private static final String POST_URL = "http://localhost:3000/authusers";

  // public static String POST_PARAMS;

  // private static void sendPOST() throws IOException {
  //   URL obj = new URL(POST_URL);
  //   HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
  //   httpURLConnection.setRequestMethod("POST");
  //   httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);

  //   // For POST only - START
  //   httpURLConnection.setDoOutput(true);
  //   OutputStream os = httpURLConnection.getOutputStream();
  //   os.write(POST_PARAMS.getBytes());
  //   os.flush();
  //   os.close();
  //   // For POST only - END

  //   int responseCode = httpURLConnection.getResponseCode();
  //   System.out.println("POST Response Code :: " + responseCode);

  //   if (responseCode == HttpURLConnection.HTTP_OK) { // success
  //     BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
  //     String inputLine;
  //     StringBuffer response = new StringBuffer();

  //     while ((inputLine = in.readLine()) != null) {
  //       response.append(inputLine);
  //     }
  //     in.close();

  //     // print result
  //     System.out.println(response.toString());
  //   } else {
  //     System.out.println("POST request not worked");
  //   }
  // }
    Container container = getContentPane();
    JLabel welcomeLabel = new JLabel("Welcome! Please Login to FridgeShake");
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        welcomeLabel.setBounds(50, 100, 250,30 );
        userLabel.setBounds(50, 180, 100, 30);
        passwordLabel.setBounds(50, 250, 100, 30);
        userTextField.setBounds(150, 180, 150, 30);
        passwordField.setBounds(150, 250, 150, 30);
        showPassword.setBounds(150, 280, 150, 30);
        loginButton.setBounds(50, 350, 100, 30);
        resetButton.setBounds(200, 350, 100, 30);
    }

    public void addComponentsToContainer() {
      container.add(welcomeLabel);
      container.add(userLabel);
      container.add(passwordLabel);
      container.add(userTextField);
      container.add(passwordField);
      container.add(showPassword);
      container.add(loginButton);
      container.add(resetButton);
    }

    public void addActionEvent() {
      loginButton.addActionListener(this);
      resetButton.addActionListener(this);
      showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //Coding Part of LOGIN button
      if (e.getSource() == loginButton) {
        String userText;
        String pwdText;
        userText = userTextField.getText();
        pwdText = passwordField.getText();
        // POST_PARAMS = "email=" + userText + "&password=" + pwdText;
        // sendPost();
        if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
          JOptionPane.showMessageDialog(this, "Login Successful");
        } else {
          JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
      }
      //Coding Part of RESET button
      if (e.getSource() == resetButton) {
        userTextField.setText("");
        passwordField.setText("");
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

class Login {

  public static void main(String[] a) {
    LoginFrame frame = new LoginFrame();
    frame.setTitle("Login Form");
    frame.setVisible(true);
    frame.setBounds(10, 10, 370, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
   }
}
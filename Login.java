import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    
    JPanel panel;
    JLabel user_label, password_label, msg;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;

    Login(){
        user_label = new JLabel();
        user_label.setText("User NAme :");
        userName_text = new JTextField();

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(3, 1));

                
    }
}
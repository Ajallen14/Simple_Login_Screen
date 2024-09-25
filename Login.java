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

        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);

        msg = new JLabel();
        panel.add(msg);
        panel.add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Login ");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActiveEvent e){
        String userName = userName_text.getText();
        String password = password_text.getText();
        if(userName.trim().equals("Jhon") && password.trim().equals("Jhon@123")){
            msg.setText("WELCOME");
        }else{
            msg.setText("Invalid User\n Please try again");
        }
    }
}
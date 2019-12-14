import java.awt.event.*;
import javax.swing.*;

class LoginForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");
        JButton b = new JButton("Submit");
        JButton b1 = new JButton("Exit");
        JTextField tf = new JTextField("Enter UserName");
        JTextField tf1 = new JTextField("Enter PassWord");
        b.setBounds(90,220,90,30);
        b1.setBounds(220,220,90,30);
        tf.setBounds(50, 100,300,40);
        tf1.setBounds(50, 150,300,40);

        b1.addActionListener((ActionEvent e) -> {
           System.exit(0);
  
        });b.addActionListener((ActionEvent e) -> {
            System.exit(0);
    });
        f.add(b);
        f.add(b1);
        f.add(tf);
        f.add(tf1);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);

}         
}
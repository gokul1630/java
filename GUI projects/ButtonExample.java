
import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {

    public static void main(String[] args) {
        JFrame f = new JFrame("GUI-Programming using Java");
        JButton b = new JButton("click here	");
        JTextField tf = new JTextField();
        b.setBounds(140, 100, 90, 30);
        tf.setBounds(50, 50, 300, 40);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hii There");
            }
        });
        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}

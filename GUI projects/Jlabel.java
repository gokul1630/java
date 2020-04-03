import javax.swing.*;
import java.awt.*;

public class Jlabel {
    public static void main(String[] args) {
        JFrame frame=new JFrame("java label");
        JLabel label=new JLabel("First name");
        JLabel label1=new JLabel("last name");
        label.setBounds(50, 100, 90, 10);
        label1.setBounds(50,150,90,10);
        frame.add(label);
        frame.add(label1);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
   }
}
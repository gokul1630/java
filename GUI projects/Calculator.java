
import javax.swing.*;
import java.awt.event.*;

public class Calculator{
    public static void main(String[] args){

        JButton b1,b2,b3,b4;

        JFrame f=new JFrame("GUI");
        JTextField tf=new JTextField();
        JTextField tf1=new JTextField();
        JTextField tf2=new JTextField();
        JLabel label=new JLabel("Result");
    
        b1=new JButton("Add");
        b2=new JButton("sub");
        b3=new JButton("Mul");
        b4=new JButton("Div");

        tf.setBounds(100,100,200,30);
        tf1.setBounds(100,140,200,30);
        tf2.setBounds(200,180,80,30);
        tf2.setEditable(false);

        b1.setBounds(50,230,70,30);
        b2.setBounds(130,230,70,30);
        b3.setBounds(210,230,70,30);
        b4.setBounds(290,230,70,30);
        label.setBounds(150,180,40,30);

        f.add(tf);
        f.add(tf2);
        f.add(tf1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String s1=tf.getText();
            String s2=tf1.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=0;
            if(e.getSource()==b1){
                c=a+b;
            }
            String res=String.valueOf(c);
            tf2.setText(res);
        }
    });
    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String s1=tf.getText();
            String s2=tf1.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=0;
            if(e.getSource()==b2){
                c=a-b;
            }
            String res=String.valueOf(c);
            tf2.setText(res);
        }
    });
    b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String s1=tf.getText();
            String s2=tf1.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=0;
            if(e.getSource()==b3){
                c=a*b;
            }
            String res=String.valueOf(c);
            tf2.setText(res);
        }
    });
    b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String s1=tf.getText();
            String s2=tf1.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=0;
            if(e.getSource()==b4){
                c=a/b;
            }
            String res=String.valueOf(c);
            tf2.setText(res);
        }
    });
  }
}

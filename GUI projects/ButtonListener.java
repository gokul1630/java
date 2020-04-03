import javax.swing.*;
import java.awt.event.*;
public class ButtonListener{
	public static void main(String[] args) {
		JFrame f=new JFrame("ButtonListener");
		JButton b=new JButton("click");
		JTextField field=new JTextField();
		field.setBounds(50,50,150,20);
		b.setBounds(50,100,95,30);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				field.setText("welcome to java swing");
			}
		});
		f.add(field);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
	}
}
import javax.swing.*;

public class ButtonInheritance extends JFrame { // inherits frame class
	JFrame f;

	ButtonInheritance() {
		JButton b = new JButton("click here");
		b.setBounds(100, 100, 90, 30);
		add(b);
		setLayout(null);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonInheritance();
	}
}
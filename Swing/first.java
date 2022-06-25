import java.awt.*;  
import javax.swing.*;

class first {
	public static void main(String []k) {
		new abc();
	}
}

class abc extends JFrame {//folows card layout by default
	public abc() {
		setLayout(new FlowLayout());//other layout are FlowLayout,gridLayout,null
		JLabel l = new JLabel("Hello world");
		JLabel l1 = new JLabel("Welcome Back");
		add(l);
		add(l1);
		setVisible(true);
		setSize(600,400);
	}
}
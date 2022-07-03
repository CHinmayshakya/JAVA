import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class add {
    public static void main(String[] args) {
        calc a = new calc();
    }
}

class calc extends JFrame implements ActionListener {
    JButton b;
    JRadioButton jr1,jr2,jr3,jr4;
    JTextField jf1,jf2;
    JLabel jl1,jl2;
    calc() {
        setLayout(new FlowLayout());
        jl1 = new JLabel("Claculator");
        b = new JButton("Claculate");
        jr1 = new JRadioButton("Addition");
        jr2 = new JRadioButton("Subtraction");
        jr3 = new JRadioButton("Multiplication");
        jr4 = new JRadioButton("division");
        jf1 = new JTextField(20);
        jf2 = new JTextField(20);
        jl2 = new JLabel("");
        ButtonGroup bg  = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        bg.add(jr4);
        add(jl1);
        add(jf1);
        add(jf2);
        add(jr1);
        add(jr2);
        add(jr3);
        add(jr4);
        add(b);
        add(jl2);
        b.addActionListener(this);
        setVisible(true);
		setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(jf1.getText());
        int n2 = Integer.parseInt(jf2.getText());
        int res;
        if (jr1.isSelected()) {
            res = n1 + n2;
        }
        else if (jr2.isSelected()) {
            res = n1 - n2;
        }
        else if (jr3.isSelected()) {
            res = n1 * n2;
        }
        else {
            res = n1 / n2;
        }
        jl2.setText(res + "");
        add(jl2);
    }
}

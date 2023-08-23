package JAVA_LAB.Event_Handling;
import java.awt.*;
import java.awt.event.*;

// write a program to implement ice cream parlor using event handling
class IceCreamParlorE extends Frame implements ActionListener {
    TextField tf;
    Button b1, b2, b3, b4, b5, b6;
    // textbox and button
    IceCreamParlorE() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        b1 = new Button("Vanilla");
        b1.setBounds(100, 120, 80, 30);
        b1.addActionListener(this);
        b2 = new Button("Strawberry");
        b2.setBounds(100, 160, 80, 30);
        b2.addActionListener(this);
        b3 = new Button("Chocolate");
        b3.setBounds(100, 200, 80, 30);
        b3.addActionListener(this);
        b4 = new Button("Butterscotch");
        b4.setBounds(100, 240, 80, 30);
        b4.addActionListener(this);
        b5 = new Button("Pista");
        b5.setBounds(100, 280, 80, 30);
        b5.addActionListener(this);
        b6 = new Button("Mango");
        b6.setBounds(100, 320, 80, 30);
        b6.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(tf);
        setSize(300, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        tf.setText(s + " Ice Cream");
    }
}

public class IceCreamParlor {
    public static void main(String args[]) {
        IceCreamParlorE f = new IceCreamParlorE();
    }
}
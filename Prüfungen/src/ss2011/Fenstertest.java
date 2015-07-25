package ss2011;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Unantastbar on 16.07.2015.
 */
public class Fenstertest extends JFrame {

    public Fenstertest(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Erholungsurlaub an der Hochschule");
        setLayout(new BorderLayout());
        JPanel pN = new JPanel(new GridLayout(1,3));
        JPanel p0 = new JPanel(new GridLayout(1,3));
        JPanel p1 = new JPanel(new GridLayout(4,1));
        JPanel p2 = new JPanel(new GridLayout(3,1));
        JPanel p3 = new JPanel(new GridLayout(5,1));
        JPanel p4 = new JPanel(new FlowLayout());
        JLabel l1 = new JLabel("Preis:");
        JLabel l2 = new JLabel("Zimmer");
        JLabel l3 = new JLabel("Essen");
        JLabel l4 = new JLabel("Zahlungsart");
        JRadioButton r1=new JRadioButton("Einzel");
        JRadioButton r2=new JRadioButton("Zweier");
        JRadioButton r3=new JRadioButton("Hoersaal");
        JButton b1=new JButton("Buchen");
        JButton b2=new JButton("Abbrechen");
        JTextField tf= new JTextField(10);

        this.add(p0);
        this.add(p4, BorderLayout.SOUTH);
        this.add(pN, BorderLayout.NORTH);
        p0.add(p1);
        p0.add(p2);
        p0.add(p3);

        p4.add(l1);
        p4.add(tf);
        p4.add(b1);
        p4.add(b2);
        pN.add(l2);
        pN.add(l3);
        pN.add(l4);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);
        this.pack();
        this.setVisible(true);

    }
    public static void main (String args []){
        new Fenstertest();
    }
}

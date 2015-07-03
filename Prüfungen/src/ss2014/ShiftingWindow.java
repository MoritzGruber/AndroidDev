package ss2014; /**
 * Created by Unantastbar on 03.07.2015.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ShiftingWindow extends JFrame implements ActionListener
{
    public ShiftingWindow(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new JLabel("press a button to move the window"), BorderLayout.NORTH);
        JPanel p= new JPanel(new GridLayout(3,3));
//        add(p, BorderLayout.CENTER);
//        p.add(new Button("unten"), BorderLayout.SOUTH);
//        p.add(new Button("links"),BorderLayout.WEST);
//        p.add(new Button("oben"),BorderLayout.NORTH);
//        p.add(new Button("rechts"), BorderLayout.EAST);
//        add(new JButton("exit"), BorderLayout.SOUTH);

        p.add(new JLabel(""));
        p.add(new Button("oben"));
        p.add(new JLabel(""));
        p.add(new Button("links"));
        p.add(new JLabel(""));
        p.add(new Button("rechts"));
        p.add(new JLabel(""));
        p.add(new Button("unten"));
        p.add(new JLabel(""));
        add(new JButton("exit"),BorderLayout.SOUTH);
        add(p,BorderLayout.CENTER);
        pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args)
    {
        new ShiftingWindow();

    }

}
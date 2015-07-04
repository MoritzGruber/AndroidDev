package ss2013.a4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Unantastbar on 04.07.2015.
 */
class Schiebepuzzle extends JFrame implements ActionListener {
    private Feld frei; // hier halten wir eine Referenz auf das AKTUELL freie Feld

    // das nutzt uns spaeter, weil wir es nicht lange suchen muessen
    public Schiebepuzzle(int[][] ia) {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < ia.length; i++) {
            int[] ints = ia[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                Feld a = new Feld(i, j, anInt);
                a.setBackground(Color.LIGHT_GRAY);
                if (anInt == 0) {
                    a.setBackground(Color.WHITE);
                    frei=a;
                }
                a.addActionListener(this);
                add(a);
            }
        }
        pack();
        setVisible(true);
    } // end Schiebepuzzle

    @Override
    public void actionPerformed(ActionEvent e) {
        Feld f = (Feld) e.getSource();
        int a=frei.getS()-f.getS();
        int b=frei.getZ()-f.getZ();
        if(a+b==1 || a+b==-1)
        System.out.println("Feld(z,s) = (" + f.getZ() + "," + f.getS() + ")");

    } // end actionPerformed

    public static void main(String[] args) {
        new Schiebepuzzle(new int[][]{
                {11, 5, 12, 14},
                {15, 2, 0, 9},
                {13, 7, 6, 1},
                {3, 10, 4, 8}
        });
    }


} // end class Schiebepuzzle

package ss2013.a4;

import javax.swing.*;

/**
 * Created by Unantastbar on 04.07.2015.
 */
class Feld extends JButton {
    private int zeile, spalte;
    public Feld(int z, int s, int zahl) { zeile = z; spalte = s; if (zahl==0) setText(""); else setText(""+zahl); }
    public int getZ( ) { return zeile; }
    public int getS( ) { return spalte; }
}

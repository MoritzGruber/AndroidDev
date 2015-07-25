package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //
        GraphicsEnvironment ge = GraphicsEnvironment.
                getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        for (GraphicsDevice g : gs) {

            String b= g.getIDstring();
            System.out.println(b);
        }

    }
}

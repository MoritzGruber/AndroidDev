package com.teamtreehouse.funfacts;

/**
 * Created by Moritz on 29.06.2015.
 */
import java.io.*;

class ReadFile
{
    //Wenn lineNumber kleiner 1 oder größer als die Anzahl der Zeilen ist wird null zurückgegeben anstonsten die Zeile
    public static String readLine(String datei, int lineNumber) throws IOException{
        if (lineNumber<1)
            return null;

        LineNumberReader f = new LineNumberReader(new FileReader(datei));
        while (f.getLineNumber()<lineNumber-1){
            if (f.readLine()==null) break;
        }
        return f.readLine();
    }
}
package ss2014;

import java.util.*;

/**
 * Created by Unantastbar on 03.07.2015.
 */
public class Statistics implements Reportable{

    String mHeader;
    List<String> mLegend;
    Map<String, List<Integer>> mLines;

    public Statistics(String s, String[] arr) {
        mHeader=s;
        mLegend= Arrays.asList(arr);
        mLines= new HashMap<String, List<Integer>>();
    }

    public java.lang.String getHeader() {
        return mHeader;
    }

    public java.util.List<java.lang.String> getLegend() {
        return mLegend;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> getLines() {
        return mLines;
    }

    public void add(String s, int[] iarr){
        List<Integer> a= new LinkedList<Integer>(); // neue Liste erstellen
        for (int i : iarr) {    //�ber das �bergebee array laufen
            a.add(i);               //element der liste hinzuf�gen
        }
        mLines.put(s,a); //Mlines ein element hinzuf�gen
    }
}

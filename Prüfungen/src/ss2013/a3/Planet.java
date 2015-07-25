package ss2013.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Unantastbar on 04.07.2015.
 */
public class Planet extends HK {
    List<Mond> mList;
    public Planet(String s, int i){
        super(s,i);
        mList= new ArrayList<>();
    }
    public void add(Mond m){
        mList.add(m);
    }
}

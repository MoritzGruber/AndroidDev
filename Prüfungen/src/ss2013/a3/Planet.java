package ss2013.a3;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Unantastbar on 04.07.2015.
 */
public class Planet {
    String mName="";
    long mDurchmesser=0;
    List<Mond> mMonde;

    public Planet(String name, long durchmesser) {
        mName = name;
        mDurchmesser = durchmesser;
        mMonde=new LinkedList<Mond>();
    }
    public void add (Mond m){
        mMonde.add(m);
    }
}

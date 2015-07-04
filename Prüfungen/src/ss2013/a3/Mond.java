package ss2013.a3;

/**
 * Created by Unantastbar on 04.07.2015.
 */
public class Mond implements Comparable<Mond>{
    String mName="";
    long mDurchmesser=0;

    public Mond(String name, long durchmesser) {
        mName = name;
        mDurchmesser = durchmesser;
    }

    @Override
    public int compareTo(Mond m) {
        return (int)(m.mDurchmesser-this.mDurchmesser);
    }
}

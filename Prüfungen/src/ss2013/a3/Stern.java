package ss2013.a3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Unantastbar on 04.07.2015.
 */
public class Stern {
    String mName = "";
    long mDurchmesser = 0;
    List<Planet> mPlaneten;

    public Stern(String name, long durchmesser) {
        mName = name;
        mDurchmesser = durchmesser;
        mPlaneten = new LinkedList<Planet>();
    }

    public void add(Planet p) {
        mPlaneten.add(p);
    }

    public List<Mond> alleMonde() {
        List<Mond> alleMonde;
        alleMonde = new LinkedList<Mond>();
        for (Planet p : mPlaneten) {
            for (Mond m : p.mMonde) {
                alleMonde.add(m);
            }
        }
        Collections.sort(alleMonde);
        return  alleMonde;
    }
    public void print(){
        List<Mond> alleMonde=alleMonde();
        for (Mond mond : alleMonde) {
            System.out.println(mond.mName+": "+mond.mDurchmesser);
        }
    }

    public static void main(String[] args) {
        Stern sonne = new Stern ("Sonne", 1390000);
        Planet merkur = new Planet("Merkur", 4880);
        Planet venus = new Planet("Venus", 12100); // usw. Erde, Mars etc.
        sonne.add(merkur); sonne.add(venus); // usw.
        // und noch die Monde:
        merkur.add(new Mond("Mond", 3480));
        venus.add(new Mond("Phobos", 27));
        venus.add(new Mond("Deimos", 15));
        // usw. Jupiter etc.
        sonne.print();
    }

}
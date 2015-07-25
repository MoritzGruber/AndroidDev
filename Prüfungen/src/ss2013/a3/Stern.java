package ss2013.a3;

import java.util.*;

/**
 * Created by Unantastbar on 04.07.2015.
 */
public class Stern extends HK {
        List<Planet> mList;
        public Stern(String s, int i){
            super(s,i);
            mList= new ArrayList<>();
        }
        public void add(Planet p){
            mList.add(p);
        }

        public List<Mond> alleMonde(){
            List<Mond> mondList=new ArrayList<>();
            for (Planet p : mList)
                for (Mond m : p.mList)
                    mondList.add(m);
            Collections.sort(mondList, new Comparator<Mond>() {
                @Override
                public int compare(Mond o1, Mond o2) {
                    return o2.mDM-o1.mDM;
                }
            });
            return mondList;
        }
        public void print() {
            List<Mond> alleMonde = alleMonde();
            for (Mond mond : alleMonde) {
                System.out.println(mond.mName + ": " + mond.mDM);
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

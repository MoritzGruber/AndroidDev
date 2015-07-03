package ss2014; /**
 * Created by Unantastbar on 03.07.2015.
 */
import java.util.*;
interface Reportable {
    String getHeader();
    List<String> getLegend();
    Map <String, List<Integer>> getLines ();
}

public class ReportGenerator {

    public static void main(String[] args) {
        Statistics roboStat = new Statistics(
                "Zahl der Industrieroboter in Tausend",
                new String[]{"Land", "2010", "2011", "2012"});
        roboStat.add("Japan", new int[]{308, 307, 311});
        roboStat.add("USA", new int[]{180, 193, 207});
        roboStat.add("D", new int[]{148, 157, 162});
        printReport(roboStat);
    }

    private static void printReport(Reportable r) {

        System.out.println(r.getHeader());
        for (String s : r.getLegend()) {
            System.out.print(s + "\t");
        }
        System.out.println();
        Map<String, List<Integer>> m;
        m = r.getLines();
        for (String s : m.keySet()) {
            System.out.print(s + "\t\t");
            for (Integer i : m.get(s)) {
                System.out.print(i + "\t\t");
            }
            System.out.println("");
        }
    }
}




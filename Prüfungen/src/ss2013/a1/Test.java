package ss2013.a1;

import java.util.Arrays;

/**
 * Created by Unantastbar on 03.07.2015.
 */
class A {
    protected int x = 3; public A( ) { x++; } public String toString( ) { return "A"+x; }
}
class B extends A {
    protected int y = 5; public B( ) { y = y+x; } public String toString( ) { return "B"+y; }
}
class C extends B {
    private int z = 7; public C( ) { z = z+y; } public String toString( ) { return "C"+z; }
}
class Test {
    private static String re(String s) {
        if (s.isEmpty( )) return "";
        else return s.charAt(s.length( )-1) + re(s.substring(0, s.length( )-1));
    }
    public static void main(String[ ] args) {
        System.out.println("1= " + new A( ) + "-" + new B( ) + "-" + new C( ));
        String[ ] namen1 = {"Berta", "Doro", "Chris", "Adam"}, namen2 = namen1;
        Arrays.sort(namen2); // wie Collections.sort( ), aber fuer Arrays
        System.out.println("2= " + namen1[0] + ", " + namen2[3]);
        String s = "Mississippi", t = s.substring(0, s.lastIndexOf('s'));
        System.out.println("3= " + t + " " + re(t.substring(1)));
        System.out.println("4= " + 2 + 3);
        System.out.println("5= " + (3 + 2));
        System.out.println(2 + 3 + "Ende");


    }
}
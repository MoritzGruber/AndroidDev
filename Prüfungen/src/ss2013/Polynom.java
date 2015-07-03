package ss2013;

/**
 * Created by Unantastbar on 04.07.2015.
 */
public class Polynom {

    String mResult="";
    public Polynom(int[] ia) {

         mResult=berechen(ia);
    }

    @Override
    public String toString() {
        return mResult;
    }

    private String berechen(int[] ia) {


        for (int i = 0; i < ia.length ; i++) {
            if(ia[i]!=0){
                if(i==ia.length-2){
                    if(ia[i]<0){
                        mResult= mResult+" - "+(-1*ia[i])+"x";}
                    else{
                        mResult= mResult+" + "+ia[i]+"x";
                    }
                }else if(i==ia.length-1){
                    if(ia[i]<0){
                        mResult= mResult+" - "+(-1*ia[i]);}
                    else{
                        mResult= mResult+" + "+ia[i];
                    }
                }else if(i==0){
                    if(ia[i]<0){
                        mResult= mResult+"-"+(-1*ia[i])+"x^"+(ia.length-1-i);}
                    else{
                        mResult= mResult+""+ia[i]+"x^"+(ia.length-1-i);
                    }
                }else{
                    if(ia[i]<0){
                    mResult= mResult+" - "+(-1*ia[i])+"x^"+(ia.length-1-i);}
                    else{
                        mResult= mResult+" + "+ia[i]+"x^"+(ia.length-1-i);
                }
                }
            }
        }


        return mResult;
    }
    public static void main(String[] args){
        System.out.println(new Polynom(new int[ ] { 4, 0, -2, 7} ));
        System.out.println(new Polynom(new int[ ] { -3, 2, 0} ));
        System.out.println(new Polynom(new int[ ] { 1, -1, 1, -1} ));
        System.out.println(new Polynom(new int[ ] {-2, 5, 0, 3} ));
    }
}

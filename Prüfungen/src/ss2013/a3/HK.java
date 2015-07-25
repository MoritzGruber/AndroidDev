package ss2013.a3;

/**
 * Created by Unantastbar on 15.07.2015.
 */
public class HK { //HK ==Oberklasse Himmelskörper
    String mName="";
    int mDM=0;

    public HK(String s, int i){
        mName=s;
        mDM=i;
    }
    @Override
    public String toString(){
        return mName+": "+mDM;
    }
}

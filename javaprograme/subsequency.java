import java.util.HashSet;

public class subsequency {
    /*
    public static void subseq(String str,int idx,String newstring)
    {
        // base condtion
        if(idx==str.length())
        {
            System.out.println(newstring);
            return;

        }

        char curentchar=str.charAt(idx);

        // to be add
        subseq(str, idx+1, newstring+curentchar);

        // not be add
        subseq(str, idx+1, newstring);
    }

    public static void main(String[] args) {
        String str="abc";
        subseq(str, 0, "");
    }
    */

    //print unqie subsequncy

    public static void unqiesubseq(String str,int idx,String newsString,HashSet<String> set)
    {
        // base case

        if(idx==str.length())
        {
            if(set.contains(newsString))
            {
                return;
            }
            else
            {
                System.out.println(newsString);
                set.add(newsString);
                return;
            }
        }

    

        char curentchar=str.charAt(idx);

        // to be add

        unqiesubseq(str, idx+1, newsString+curentchar, set);

        //to not be add

        unqiesubseq(str, idx+1, newsString, set);
    }

    public static void main(String[] args) {
        String str="aaa";

        HashSet<String> set=new HashSet<>();

        unqiesubseq(str, 0, "",set);
    }
    
}

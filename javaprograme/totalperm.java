import java.time.chrono.MinguoChronology;

public class totalperm {
    public static void PrintPerm(String str,int idx,String perm)
    {
        // base case

        if(str.length()==0)
        {
            System.out.println(perm);
            return;

        }
        

        for(int i=0;i<str.length();i++)
        {
            char curchar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            PrintPerm(newString, i, perm+curchar);

        }
    }

    public static void main(String[] args) {
        String str="ABC";
        PrintPerm(str, 0, "");
    }
    
}

import java.util.Currency;

public class findpermutation {
    public static void Permutation(String str, String ans)
    {
        // base case
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        // recursion

        for(int i=0;i<str.length();i++)
        {
            char cur=str.charAt(i);
            // "abcde"=>"ab"+"de"  :here 'c' is missing
            String newstr=str.substring(0,i) + str.substring(i+1);
            Permutation(newstr, ans+cur);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        Permutation(str, "");
    }
    
}

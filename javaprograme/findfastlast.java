import java.io.ObjectInputFilter.Status;
import java.net.StandardSocketOptions;

public class findfastlast {
    public static int first=-1;
    public static int last=-1;
    public static void findFirstLastocurance(String str,int idx,char element)
    {
        if(idx==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char curentchar=str.charAt(idx);

        if(curentchar==element)
        {
            if(first==-1)
            {
                first=idx;
            }
            else
            {
                last=idx;
            }
        }
        findFirstLastocurance(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str="abaacdabca";

        findFirstLastocurance(str, 0, 'a');
    }
    
}

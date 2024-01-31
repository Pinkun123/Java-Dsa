public class removeduplicatestr {
    public static boolean map[]=new boolean[26];
    
    // for recursion
    public static void removeduplicate(String str,int idx ,String  newString)
    {
        // base case
        if(idx==str.length())
        {
            System.out.println(newString);
            return;
 
        }
        

        char curentchar=str.charAt(idx);

        if(map[curentchar - 'a']== true)
        {
            removeduplicate(str, idx+1, newString);
        }

        else
        {
            newString+=curentchar; /// newstring=newstring+curchar

            map[curentchar-'a']=true;

            removeduplicate(str, idx+1, newString);

        }
        
    }

    public static void main(String[] args) {
        String str="appnnacollege";

        removeduplicate(str, 0, "");
    }
    
}

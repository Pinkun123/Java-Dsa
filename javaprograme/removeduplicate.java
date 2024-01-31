import java.rmi.server.RemoteRef;

public class removeduplicate {

    public static void printremovedulicate(String str, int idx,StringBuilder newstr, boolean map[])
    {
        // base case

        if(idx == str.length())
        {
            System.out.println(newstr);
            return;
        }

        // kaam

        char currchar= str.charAt(idx);

        /// Duplicate is presnt in new string
        if(map[currchar- 'a'] == true)
        {
            /// Duplicate is presnt in new string

            printremovedulicate(str, idx+1, newstr, map);
        }
        else
        {
            /// Duplicate is not presnt in new string

            map[currchar-'a']=true;
            printremovedulicate(str, idx+1, newstr.append(currchar), map);
        }

        
    }
    
    public static void main(String[] args) {
        String str="appnnacollege";
        printremovedulicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

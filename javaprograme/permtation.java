public class permtation {
    public static void findPerm(String str,String ans)
    {
        // base case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
         
        for(int i=0;i<str.length();i++)
        {
            char curchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            findPerm(newstr,ans+curchar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPerm(str, " ");
    }
    
}

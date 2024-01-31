public class palndrom {
    public static boolean checkpalindrom(String str)
    {
        str=str.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        for(int i=0 ;i< str.length()/2; i++)
        {
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                return false;
                
            }
        }
      System.out.println("this no is plandrom:");
      return true;
    }

    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";

        System.out.println(checkpalindrom(str));
    }
}

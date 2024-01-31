public class substr {
    public static String printsubtr(String str,int si,int ei)
    {
        String substring=" ";

        for(int i=si;i<ei; i++)
        {
            substring+=str.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args) {
        String str="helloworld";

        System.out.println(printsubtr(str, 0, 5));
    }

    
    
}

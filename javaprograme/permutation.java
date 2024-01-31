public class permutation {
    public static void printperm(String str,String permutaion)
    {
        // base case
        if(str.length()==0)
        {
            System.out.println(permutaion);
            return;

        }

        for(int i=0;i<str.length();i++)
        {
            char curentchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printperm(newstr, permutaion+curentchar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printperm(str, "");
    }
    
}

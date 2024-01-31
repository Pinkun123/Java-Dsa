public class keypadcombination {
    public static String[] keypad={"","abc","def","ghi","mno","pqrs","tu","vmx","yz"} ;
    public static void printkeypad(String str,int idx,String combantion)
    {
        // base condtion
        if(idx==str.length())
        {
            System.out.println(combantion);
            return;

        }

        char curentchar=str.charAt(idx);

        String map=keypad[curentchar-'0'];

        for(int i=0;i<map.length();i++)
        {
            printkeypad(str,idx+1,combantion+map.charAt(i));

        }
    }

    public static void main(String[] args) {
        String str="23";
        printkeypad(str,0,"");
    }
}

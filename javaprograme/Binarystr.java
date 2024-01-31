public class Binarystr {
    public static void printBinarraystring(int n, int lastpalce,String str)
    {
        // base case
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        // 1st methoed

        if(lastpalce == 0)   // lastpalce=0
        {
            //either 0 add 
            printBinarraystring(n-1, 0, str+"0");
            // or 1 add
            printBinarraystring(n-1, 1, str+"1");
        }
        else    // lastpalace =1
        {
            printBinarraystring(n-1, 0, str+"0");
        }

        // 2nd methoed

        // printBinarraystring(n-1, 0, str+"0");

        // if(lastpalce == 0)
        // {
        //     printBinarraystring(n-1, 1, str+"1");
        // }

    }

    public static void main(String[] args) {
        printBinarraystring(3, 0, "");
    }
    
}

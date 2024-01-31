public class Pairingfrind {

    public static int printpairingfrind(int n)
    {
        // base case

        if(n==1 || n==2)
        {
            return n;
        }

        // kaam

        int fnm1=printpairingfrind(n-1);  // for single frind in 'n' number

        int fnm2=printpairingfrind(n-2);   // for pair frind in 'n' number

        int ways= (n-1) * fnm2;       // single chose parir with pair frind

        int totalways=fnm1 + ways;     // for single frind in 'n' number +// single chose parir with pair frind

        return totalways;
    }

     public static void main(String[] args) {

        System.out.println(printpairingfrind(3));
        
    }
    
}

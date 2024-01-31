public class tilling {

    public static int tillingflor(int n)
    {
        // base case

        if(n==0 || n==1)
        {
            return 1;
        }

        // for vertically arrehnged tiles in floor

        int fnm1=tillingflor(n-1);


        // for herzontally arrenged tilles in  floor

        int fnm2=tillingflor(n-2);

        int totalways=fnm1+fnm2;

        return totalways; 
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(tillingflor(n));
    }
    
}

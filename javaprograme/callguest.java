public class callguest {
    public static int callGuest(int n)
    {
        // base case
        if(n<=1)
        {
            return 1;

        }

        // for single guest

        int ways1=callGuest(n-1);

        // for pair guest

        int ways2=(n-1)*callGuest(n-2);

        return ways1+ways2;

    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuest(n));
    }
    
}

public class tiles {
    public static int placeTiles(int n,int m)
    {

        // base case 1
        if(n==m)
        {
            return 2;
        }

        /// base case2
        if(n<m)
        {
            return 1;
        }

        // vertically place tiles

        int vertically=placeTiles(n-m, m);

        // herzontally palce tiles

        int herzontally=placeTiles(n-1, m);

        return vertically+herzontally;
    }

    public static void main(String[] args) {
        int n=5,m=2;

        int totalway=placeTiles(n, m);
        System.out.println(totalway);
    }
    
}

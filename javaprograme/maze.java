public class maze {
    public static int countpath(int i,int j,int n,int m )
    {
        // base case1
        if(i==n || j==m)
        {
            return 0;   // the path at wall
        }

        // base case2
        if( i==n-1 && j==m-1)
        {
            return 1; // the mouse at end of row and column
        }
        // move downwaord

        int downpath=countpath(i+1, j, n, m);

        // move right

        int rightpath=countpath(i, j+1,n, m);

        return downpath+rightpath;

    }

    public static void main(String[] args) {

        int n=3,m=3;

        int totalpath=countpath(0, 0, n, m);
        System.out.println(totalpath);
        
    }
    
}

public class counttrees {
    public static int CountBst(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<n+1;i++){
            // ci -> bst(i nodes) -> dp[i]

            for(int j=0;j<i;j++){
                // ci- dp[i]+=dp[j]*dp[i-j-1];

                int leftnode=dp[j];
                int rightnode=dp[i-j-1];

                dp[i]+=leftnode*rightnode;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=30;
        System.out.println(CountBst(n));
    }
}

public class catalan {
    // public static int Catalan(int n){
    //     if( n == 0 || n==1){
    //         return 1;
    //     }
        
    //     int ans=0;

    //     for(int i=0;i<=n-1;i++){
    //         ans+=Catalan(i)*Catalan(n-i-1);
    //     }
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     int n=3;
    //     System.out.println(Catalan(n));
    // } TC=O(n^2)

    // memoization

    public static int CatalanMem(int n ,int dp[]){
        if(n == 0 || n == 1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans=0;

        for(int i=0;i<=n-1;i++){
            ans+=CatalanMem(i, dp)*CatalanMem(n-i-1, dp);
        }
        return dp[n]=ans;
    }

    // public static void main(String[] args) {
    //     int n=1;
    //     int dp[]=new int[n+1];

    //     // dp intilaztion
    //     for(int i=0;i<n+1;i++){
    //         dp[i]=-1;
    //     }

    //     System.out.println(CatalanMem(n, dp));
    // }

    // tabulation
    public static int CatalanTab(int n){
        int dp[]=new int[n+1];
        // intilazation
        dp[0]=1;
        dp[1]=1;

        //buttom up

        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(CatalanTab(n));
        
    }
}
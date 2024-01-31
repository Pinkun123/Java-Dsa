import java.util.Arrays;

public class climbingstairs {
    // public static int countWays(int n){  tc==O(n^2) expontial
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n<0){
    //         return 0;
    //     }

    //     return countWays(n-1)+countWays(n-2);
    // }
    // public static void main(String[] args) {
    //     int n=5; // ways for 4->5 and 3->3 total ways for 5=5+3=8

    //     System.out.println(countWays(n));
    // }

     public static int countWays(int n,int ways[]){  // memoization
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(ways[n] != -1){  //  allready calculated
           return ways[n];
        }

        ways[n]= countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n];
    }
     public static int Countways(int n){
        int dp[]=new int[n+1];
        dp[0]=1;

        for(int i=1;i<=n;i++){
            if(i == 1){
                dp[i]=dp[i-1]+0;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
     }
    public static void main(String[] args) {
        int n=5; // ways for 4->5 and 3->3 total ways for 5=5+3=8
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n,ways));
        System.out.println(Countways(n));
    }
}

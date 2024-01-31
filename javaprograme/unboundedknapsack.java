public class unboundedknapsack {
    public static void PrintDp(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int UnboundedKnapSack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];

        for(int i=0;i<dp.length;i++){  // inlization all oth rows 0 vlue
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){  // inlization all oth columns 0 vlue
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++){  // i =n no of item
            for(int j=1;j<W+1;j++){  // j= size of kanpsack
                if(wt[i-1] <= j){  // wt[i-1]= weight of 0th index item
                   // valid
                   dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                                      // include              // exclude
                }
                else{ // invalide
                   dp[i][j]= dp[i-1][j];// only exclude
                } 
            }
        }
       PrintDp(dp);
       return dp[n][W];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(UnboundedKnapSack(val, wt, W));
    }
}

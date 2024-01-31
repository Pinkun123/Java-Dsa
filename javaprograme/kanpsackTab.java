public class kanpsackTab {
    public static void PrintDp(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int KanpSackTab(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];

        for(int i=0;i<dp.length;i++){  // update 0 at 0th row of dp
            dp[i][0]=0; 
        }

        for(int j=0;j<dp[0].length;j++){// update 0 at oth collumn
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++){  // loop run value of data   
            for(int j=1;j<W+1;j++){ // loop run Weight of knapSack  j=W
                int v=val[i-1]; // 0th item value
                int w=wt[i-1]; // 0th item weight

                if(w <= j){  // check weight of item is less than eqaul to knapsack weight // valid
                    // include
                    int incprofit=v+dp[i-1][j-w];  // vlue add weight minus from knapsack
                    // exclude
                    int excprofit=dp[i-1][j]; // vlue not add weight not minus
                     dp[i][j]=Math.max(incprofit, excprofit);
                }
                else{ // invalid
                    // exclude
                    int excprofit=dp[i-1][j];
                    dp[i][j]=excprofit;
                }                
            }
        }
        PrintDp(dp);
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};   // value of data
        int wt[]={2,5,1,3,4};    // weight of data
        int W=7;   // total weight of knapsack

        System.out.println(KanpSackTab(val, wt, W));
    }
}

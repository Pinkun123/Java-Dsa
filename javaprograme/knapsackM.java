public class knapsackM {
    // noraml memoiozation
    // public static int Knapsack(int val[],int wt[],int W,int n){ // her n is index
    //     if(W == 0 || n == 0){ // base case weight = 0  or lengt of index is =0
    //         return 0;
    //     }

    //     if(wt[n-1] <= W){  // wt[n-1] At inedx 0  // case1 valid

    //         // inclde case
    //         int ans1=val[n-1]+Knapsack(val, wt, W - wt[n-1], n-1);
    //         // exclude case
    //         int ans2=Knapsack(val, wt, W, n-1);

    //         // max ans
    //         return Math.max(ans1, ans2);
    //     }
    //     else{  // case2  invalid
    //         // exclude case
    //         return Knapsack(val, wt, W, n-1);
    //     }

    // }
    // public static void main(String[] args) {
    //     int val[]={15,14,10,45,30};
    //     int wt[]={2,5,1,3,4};
    //     int W=7;

    //     System.out.println(Knapsack(val, wt, W, val.length));

    // }
   
    // update memoization
    public static int Knapsack(int val[],int wt[],int W,int n,int dp[][]){ // her n is index
        if(W == 0 || n == 0){ // base case weight = 0  or lengt of index is =0
            return 0;
        }

        if(dp[n][W] !=-1){  // we get max value
            return dp[n][W];
        }

        if(wt[n-1] <= W){  // wt[n-1] At inedx 0  // case1 valid

            // inclde case
            int ans1=val[n-1]+Knapsack(val, wt, W - wt[n-1], n-1,dp);
            // exclude case
            int ans2=Knapsack(val, wt, W, n-1,dp);

            // max ans
            dp[n][W]= Math.max(ans1, ans2);
            return dp[n][W];
        }
        else{  // case2  invalid
            // exclude case
             dp[n][W]= Knapsack(val, wt, W, n-1,dp);
             return  dp[n][W];
        }

    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;

        int dp[][]=new int[val.length+1][W+1];  // i=valu j=knapsack capacity W

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }

        System.out.println(Knapsack(val, wt, W, val.length,dp));

    }
}

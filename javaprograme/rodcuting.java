public class rodcuting {
    public static int RodCutting(int price[],int length[],int trodlen){
        int n=price.length;

        int dp[][]=new int[n+1][trodlen+1];

        for(int i=0;i<dp.length;i++){  // intlization 0th row in 0
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){ // intlaization oth collumn 0
            dp[0][j]=0;
        }

        // in 0-1 knapsack n=value : j=total weight of kanspsack
        // in rodcuting n=price : j=total length of rod
        for(int i=1;i<n+1;i++){
            for(int j=1;j<trodlen+1;j++){
                // valid 
                if(length[i-1] <= j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                                      // include                        // exclude
                }
                else{
                    dp[i][j]=dp[i-1][j];// exclude
                }

            }
        }
        return dp[n][trodlen];
    }
    public static void main(String[] args) {
        int price[]={1,5,8,9,10,17,17,20};
        int length[]={1,2,3,4,5,6,7,8};
        int trodlen=8;
        System.out.println(RodCutting(price, length, trodlen));

    }
}

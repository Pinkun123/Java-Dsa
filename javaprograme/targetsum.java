public class targetsum {

    public static void PrintDp(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean TargetSum(int arr[],int sum){
        int n=arr.length;

        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;  // all first row intilazation with true
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                //i consider: i= item weight j= sum weight
                
                int v=arr[i-1]; // weight of ith item store in v

                // include
                if(v <= j && dp[i-1][j-v] ==  true){  // item weight less than sum weightitem is one less and and sum weight decrease 
                    dp[i][j]=true;
                }

                // exclude
                else if(dp[i-1][j] == true ){
                    dp[i][j]=true;
                }
            }
        }
        PrintDp(dp);
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[]={4,2,7,1,3};
        int sum=10; // target sum
        System.out.println(TargetSum(arr, sum));
    }
}

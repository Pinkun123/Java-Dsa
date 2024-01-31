public class minpattion {
    public static int MinPattion(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];// store sum of all item
        }

        int W=sum/2; // cpacity

        int dp[][]=new int[n+1][W+1];

        // buttom up

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){ // loop run for capacity or weight
                //valide
                if(arr[i-1] <=j) // ith item weight less than for total weight W=j
                {
                                               // include          // exclude
                    dp[i][j]=Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
                                      // value // item idx//TW-item W,item idx 
                }
                else{  // invlaid
                    // exclude
                    dp[i][j]=dp[i-1][j];

                }
            }
        }

        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        int arr[]={1,6,11,15};
        System.out.println(MinPattion(arr));

    }
}

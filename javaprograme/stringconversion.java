public class stringconversion {
    public static int Lcs2(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        // intilazrion
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i == 0){
                    dp[i][j]=i;
                }
                if(j == 0){
                    dp[i][j]=j;
                }
            }
        }

        // down up

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){// same chacter
                    dp[i][j]=dp[i-1][j-1];// no opration perform
                }
                else{ // chacter is diffrent
                    int add=dp[i-1][j]+1;  
                    int del=dp[i][j-1]+1;
                    dp[i][j]=Math.min(add, del);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="pear";
        String str2="sea";
        System.out.println(Lcs2(str1, str2));
    }
}

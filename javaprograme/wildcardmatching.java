public class wildcardmatching {
    public static boolean IsMatching(String s,String p){
        int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];

        // intilazation
        dp[0][0]=true; // oth row oth collomun true string and partten is empty string match

        // partten is empty
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }

        // string is empty
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j]=dp[0][j-1];
                 // retrun true || false
            }
        }


        // down up

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                // case-1 = if ith char == jth char || jth char =='?'
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j]=dp[i-1][j-1];
                }

                // case-2 = jth char == "*"  ignore || match
                else if (p.charAt(j-1) == '*') {
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                              // ignore   // match
                                      //  one give true the retrun true
                }
                
                // case-3  false
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s="aa";
        String p="c";
        System.out.println(IsMatching(s, p));
    }
}

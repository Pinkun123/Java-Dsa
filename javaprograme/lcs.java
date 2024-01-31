public class lcs {
    public static int Lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){  // last charcter same
            return Lcs(str1, str2,n-1,m-1)+1;
        }
        else{// last charcter diffrrent
            int ans1=Lcs(str1, str2,n-1,m); //one skip one add
            int ans2=Lcs(str1, str2,n,m-1);
            return Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String str1="abcdge";
        String str2="abedg";
        //lcs=4
        System.out.println(Lcs(str1, str2,str1.length(),str2.length()));

    }
}

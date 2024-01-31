import java.util.Arrays;

public class minimumabsoult {
    public static void main(String[] args) { // tc=O(nlogn)
        int A[]={};
        int B[]={};

        Arrays.sort(A);
        Arrays.sort(B);
        int MinDFF=0;
        
        for(int i=0;i<A.length;i++)
        {
            MinDFF += Math.abs(A[i]-B[i]);
        }
        System.out.println("minumum abousult is ="+MinDFF);
    }
    
}

import java.util.ArrayList;
 
public class subset {
 
   public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();
   }
 
   public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }
       // add hoga

       findSubsets(n-1, subset);
       subset.add(n);

       // remove hoga

       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
   }
 
   public static void main(String args[]) {
       int n = 3;
       findSubsets(n, new ArrayList<Integer> ());
   }
}
 



import java.util.HashMap;

public class largestSubarray {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};

        HashMap<Integer,Integer>map=new HashMap<>();
              // sum ,indiex
        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++){   // O(n)
            sum+=arr[j];// give sum of all elment at array
            if(map.containsKey(sum)){
               len= Math.max(len,j-map.get(sum));// (len,j-i)
            }
            else{
                map.put(sum, j); 
            }
        }
        System.out.println("max subarray length in this arry:"+len);      
    }
}

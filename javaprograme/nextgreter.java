import java.util.Stack;

public class nextgreter {
    public static void main(String[] args) {  // next grrter in right 
        // int arr[]={6,8,0,1,3};
        int arr[]={6,3,5,7,2};
        Stack<Integer> s=new Stack<>();
        int nextgreter[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            // while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }
            // ifelse
            if(s.isEmpty())
            {
                nextgreter[i]=-1;
            }
            else{
                nextgreter[i]=arr[s.peek()];
            }
            // push element
            s.push(i);
        }
        for(int i=0;i<nextgreter.length;i++)
        {
            System.out.print(nextgreter[i]+" ");
        }
        System.out.println();
    }
    
}

// next gretr in left( just change for loop)
// next smaller right("<=" change ">=")
// next smaller left(change the  for loop and ">=" change "<=")
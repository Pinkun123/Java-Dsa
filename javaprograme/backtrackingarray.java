public class backtrackingarray {
    public static void ChangeArray(int arr[],int i,int val)
    {
        // base case

        if(i== arr.length)
        {
            printArry(arr);
            return;
        }

        // recursion

        arr[i]=val;

        ChangeArray(arr, i+1, val+1);  // fnx call
        arr[i]=arr[i]-2;  /// back tracking
    }

    public static void printArry(int arr[])
    {
        for(int i=0; i<arr.length ;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];

        ChangeArray(arr, 0, 1);
        printArry(arr);
    }
    
}

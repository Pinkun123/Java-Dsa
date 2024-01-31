public class checkArraysorted {
    public static boolean sortedArray(int arr[])
    {
    //     for(int i=1;i<arr.length;i++)
    //     {
    //         if(arr[i]<arr[i-1])
    //         {
    //             return false;
    //         }
            
    //     }
    //    return true;
         for(int i=arr.length;i>1;i--)
         {
            if(arr[i]>arr[i-1])
            {
                return true;
            }
         }
         return false;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       System.out.println(sortedArray(arr));
    }
    
}

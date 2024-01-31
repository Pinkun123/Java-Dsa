public class missingnoarray {
    public static int printmissing(int arr[])
    {
        int missingno;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1] - arr[i] != 1)
            {
                 missingno=arr[i] + 1;
                 return missingno;
            }
        }

        return -1;

      
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8};

       System.out.println(printmissing(arr));
    }
    
}

public class quicksort {

    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printquicksort(int arr[],int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }
        int pidx=patition(arr,si,ei);
        printquicksort(arr, si, pidx-1); // for left side sort
        printquicksort(arr, pidx+1, ei);// for right side sort


    }

    public static int patition(int arr[],int si, int ei)
    {
        int pviot= arr[ei]; /// asume last element of array
        int i=si-1;    // makes place elment for smaller than pivot
        for(int j=si; j<ei; j++)
        {
            if(arr[j] <= pviot)
            {
                i++;
                // swap

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }

        }

        // palce for pivot
        i++;
        int temp=pviot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={10,3,6,7,9,15,-8};
        int n=arr.length;
        printquicksort(arr, 0,n-1);

        printarr(arr);
    }
    
}

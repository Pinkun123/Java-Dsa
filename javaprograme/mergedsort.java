public class mergedsort{
    public static void printarr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void printmerged(int arr[],int si,int ei)
    {
        // base case
        if(si>=ei)
        {
            return;
        }
       
        int mid= (si+ei)/2;

        printmerged(arr, si, mid);  // sort left side

        printmerged(arr, mid+1, ei);    // sort right part

        merged(arr,si,mid,ei);
        

    }

     public static void merged(int arr[],int si,int mid,int ei)
    {
        int temp[]= new int[ei-si+1];
        int i=si; // itirate for left part
        int j=mid+1;  // itirate for right part 
        int k=0; // itirate for temp arr

        while(i <= mid && j <= ei )
        {
            if(arr[i]< arr[j])
            {
                temp[k]=arr[i];
                i++;
            }

            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // for left part 

        while(i <= mid)
        {
            temp[k++]=arr[i++];
        }

        // for right part

        while(j <= ei)
        {
            temp[k++]=arr[j++];
        }
 
        // temp arry copy to orginal array
        
        for( k=0,i=si; k<temp.length; k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={3,7,6,2,9,14};

        printmerged(arr, 0, arr.length-1);
        printarr(arr);


    }
    
}

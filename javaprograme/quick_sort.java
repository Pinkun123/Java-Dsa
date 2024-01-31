import javax.lang.model.util.AbstractTypeVisitor14;

public class quick_sort {

    public static void quickSort(int arr[],int low ,int high)
    {
        if(low <high)
        {
            int pidx= pattition(arr,low,high);
            quickSort(arr, low, pidx-1); // for smaller element

            quickSort(arr, pidx+1, high); // for higher element
        }
    }

    public static int  pattition(int arr[], int low ,int high)
    {

        int pivot=arr[high];

        int i=low-1;
       
        for(int j=low;j<high;j++)
        {
            if(arr[j]< pivot)
            {
                // swap

                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        // swap with pivot
           i++;
           int temp=arr[i];
           arr[i]=arr[high];
           arr[high]= temp;

           return i;
    }

    public static void main(String[] args) {
        int arr[]={3,9,8,5,2,-6};

        int n=arr.length;

        quickSort(arr, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}

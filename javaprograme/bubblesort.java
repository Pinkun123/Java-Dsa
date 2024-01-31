public class bubblesort {
    public static void bubblesort(int arr[])
    {
        for(int turns=0;turns<arr.length-1;turns ++)  // for itrating of lop
        {
            for(int j=0;j<arr.length-1-turns;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // swap

                    int temp=arr[j];

                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
              
        }
        // print array

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }

    
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};

        bubblesort(arr);

       
    }
    
}

// TIME COMPLECITY = O(n^2)
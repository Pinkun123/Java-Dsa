public class selectionsort {
    public static void Selectionsort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest] < arr[j])
                {
                    smallest=j;
                }
            }

            // swap

            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        // print

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    } 
    
    public static void main(String[] args) {
        int arr[]={2,4,6,1,9};
        Selectionsort(arr);
    }
    
}

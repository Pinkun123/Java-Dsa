public class insertion_sort {
    public  static void selctionsort(int arr[])
    {
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={7,8,2,1,3};
        for(int i=1;i<arr.length;i++)
        {
            int curent=arr[i];
            int j=i-1;
            while(j>=0 && curent< arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curent;
        }
        selctionsort(arr);
    }
}


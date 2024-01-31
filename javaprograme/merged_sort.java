import javax.sound.sampled.SourceDataLine;

public class merged_sort {

    
    public static void devide(int arr[],int si,int ei)
    {
        // base codntion

        if(si>=ei)
        {
            return;
        }


        int mid=  (si+ei)/2; //si+(ei-si)/2

        devide(arr, si, mid);

        devide(arr, mid+1, ei);

        conquer(arr,si,mid,ei);
    }


    public static void conquer(int arr[],int si,int mid,int ei)
    {
        int merged[]=new int[ei-si+1];

        int idx1=si;
        int idx2=mid+1;

        int x=0;

        while(idx1<= mid && idx2 <=ei)
        {
            if(arr[idx1] <= arr[idx2])
            {

                arr[x++]=arr[idx1++];
                 //x++,idx1++;
            }

            else
            {
                arr[x++]=arr[idx2++];

            }
        }

        while(idx1<= mid)
        {
            arr[x++]=arr[idx1++];
        }

        while(idx2<=ei)
        {
            arr[x++]=arr[idx2++];
        }

        for(int i=0, j=si;i<merged.length;i++,j++)
        {

            arr[j]=merged[i];
        }

    }
    


    public static void main(String[] args) {
        int arr[]={6,3,2,5,9,8};
        int n=arr.length;

        devide(arr, 0, n-1);

        // print

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}

// TIME COMPLECITY= nlog(n)
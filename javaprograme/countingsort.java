public class countingsort {
    public static void countSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        // find largest
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        // count the value in the array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // count sort
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i] > 0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={5,9,2,4,0,3,4};
        countSort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}

public class reverse {
    public static void reverse(int number[])
    {
        int start=0;
        int end=number.length-1;

        while(start<end)
        {
            // sawap
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end--;
        
        }

    }

    public static void main(String[] args) {
        int number[]={3,2,90,113,45};
        reverse(number);
        System.out.println("reverse of the string is:");

       for(int i=0;i<number.length;i++)
       {
        System.out.print( number[i]+ " ");
       }
       System.out.println();
    }
    
}

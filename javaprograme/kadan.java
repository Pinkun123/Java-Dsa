public class kadan {
    public static void kadan(int number[])
    {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<number.length;i++)
        {
            currsum=currsum+number[i];

            if(currsum<0)  // check condtion for -ve value
            {
                currsum=0;
            }

            maxsum=Math.max(currsum, maxsum);
          /*   if(maxsum<currsum)
            {
                maxsum=currsum;
            }
            */
        }

        System.out.println("maximum sum is:"+maxsum);
    }

    public static void main (String arg[])
    {
        // int number[]={-2,-3,4,-1,-2,1,5,-3};
        int number[]={-2,1,-3,4,-1,2,1,-5,4};

        kadan(number);
       
    }
    
}

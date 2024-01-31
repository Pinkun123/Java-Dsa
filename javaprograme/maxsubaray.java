import javax.print.attribute.standard.NumberOfInterveningJobs;

public class maxsubaray {

    public static void printmaxsub(int number[])
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;  // -infinity value

        int prifix[]=new int[number.length];

        // calculate prifox array

        prifix[0]=number[0];

        for(int i=1;i<prifix.length;i++)
        {
            prifix[i]=prifix[i-1]+number[i];

        }
   
        for(int i=0;i<number.length;i++) 
        {
            
            int start=i;

            for(int j=0;j<number.length;j++)
            {
                currsum=0;
                int end=j;

                currsum=start==0 ? prifix[end] : prifix[end]-prifix[start-1];
            }

            if(maxsum<currsum)
            {
                maxsum=currsum;
            }
        }

        System.out.println("max sum is " +maxsum);

    }
    
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};

        printmaxsub(number);
    }
}

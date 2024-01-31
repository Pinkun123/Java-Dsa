import java.io.ObjectInputFilter.Status;
import java.net.StandardSocketOptions;

public class largest {
    public static int lagestvalue(int number[])
    {
        int largest=Integer.MIN_VALUE; // - infinity integer

        int smalest=Integer.MAX_VALUE;  // +infinity itiger

        for(int i=0;i<number.length;i++)

        {
            if(number[i]>largest)
            {
                largest=number[i];
            }

            if(number[i]<smalest)
            {
                smalest=number[i];
            }
        }

        System.out.println("smalest no is:" +smalest);
        return largest;

    }

    public static void main(String[] args) {
        int number[]={10,23,1,234,786};
        System.out.println("largest no is: "+ lagestvalue(number));
    }
    
}

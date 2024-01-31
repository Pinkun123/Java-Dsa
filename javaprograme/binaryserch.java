

public class binaryserch {
    public static int binaryserch(int number[],int key)
    {
        int start=0 ;
        int end=number.length-1;
        int mid=(start+end)/2;

        while(start<=end)
        {
            if(number[mid]==key) // elment is found
            {
                return mid;
            }
            if(number[mid]<key)  // elment is big from mid so move right
            {
                start=mid+1;
            }

            else              // elment is less than mid so move left
            {
                end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int number[]={26,35,49,19,30};
        int key=49;
        System.out.println("the key is found: "+binaryserch(number, key));
    }
    
}

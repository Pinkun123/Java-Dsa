public class raintrapedwater {
    public static void raintrapedwater(int hight[])
    {
        int n=hight.length;

        // calculate left maxboundary - array

        int leftmax[]=new int[n];

        leftmax[0]=hight[0];

        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(hight[i],leftmax[i-1]);

        }

        // calculate rightmaxboundarry- array

        int rightmax[]=new int[n];

        rightmax[n-1]=hight[n-1];

        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(hight[i],rightmax[i+1]);

        }

        int trapedwater=0;

        // looop

        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            trapedwater +=waterlevel - hight[i];
        }

        System.out.println(trapedwater);
    }

    public static void main(String[] args) {
        int hight[]={4,2,0,6,3,2,5};
        raintrapedwater(hight);
    }
    
}

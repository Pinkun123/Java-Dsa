import javax.print.StreamPrintService;

public class buyingstock {
    public static void Stockbuyandsell(int prices[])
    {
        int maxperift=0;

        int buystcok=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(buystcok < prices[i])  // prfit
            {
                int perfit=prices[i]-buystcok;   // today perfit
                maxperift=Math.max(maxperift, perfit);   /// all day max perfit
            }

            else
            {
                buystcok=prices[i];
            }
        }

      

      System.out.println(maxperift);
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};

        Stockbuyandsell(prices);
       
    
    }
}

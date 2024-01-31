import java.util.Stack;

public class stockspan {
    public static void StockSpan(int Stock[],int span[])
    {
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<Stock.length;i++)
        {
            int currprice=Stock[i];
            while(!s.isEmpty() && currprice > Stock[s.peek()] )
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i]=i+1;
            }
            else
            {
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int Stock[]={100,80,60,70,60,85,100};
        int span[]=new int[Stock.length];
        StockSpan(Stock, span);
        for(int i=0;i<span.length;i++)
        {
            System.out.print(span[i]+"");
        }
        System.out.println();
    }
    
}

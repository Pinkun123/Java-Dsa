import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        ArrayList<Integer> ans=new ArrayList<>(); // change coins store
        int countOfCoins=0;
        int amount=590;

        for(int i=0;i<coins.length;i++)
        {
            if(amount >= coins[i])
            {
                while(amount >= coins[i])
                {
                    countOfCoins++;
                    amount=amount-coins[i];
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("minimum chnage of coins="+ countOfCoins);
        // print coins
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    
}

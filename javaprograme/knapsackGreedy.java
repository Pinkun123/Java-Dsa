import java.util.Arrays;
import java.util.Comparator;

public class knapsackGreedy {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][]=new double[value.length][2]; // 0th -> idx. 1th-> ratio

        // sorted 2d array
        for(int i=0;i<value.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        // lambda function
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int finalval=0;

        // assending order
        for(int i=ratio.length-1;i>=0;i--)
        {
            int idx=(int)ratio[i][0];
            if(capacity >= weight[idx]){
            finalval+=value[idx];
            capacity-=weight[idx];
            }
            else{
                finalval+=ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }
        System.out.println("final value="+finalval);
    }
    
}

import java.util.Arrays;
import java.util.Comparator;

public class maxlengthchain {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1])); // // tc=O(nlogn)

        int chainlength=1;
        int chainEnd=pairs[0][1]; //last chain end // last pair end
        for(int i=1;i<pairs.length;i++)
        {
            if(pairs[i][0] > chainEnd)
            {
                chainlength++;
                chainEnd=pairs[i][1]; // update
            }
        }
        System.out.println("the maximum chain length of chain="+ chainlength);
        
    }
}

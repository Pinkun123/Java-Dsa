import java.lang.reflect.Array;
import java.util.ArrayList;

public class StoreWater {
    // brute force aproche
    // public static int WaterStore(ArrayList<Integer>hight)
    // {
    //     int maxwater=0;
    //     for(int i=0;i<hight.size();i++)                   // timecomplecity=O(n^2)
    //     {
    //         for(int j=i+1;j<hight.size();j++)
    //         {
    //             int ht=Math.min(hight.get(i),hight.get(j));
    //             int width=j-i;
    //             int curwater=ht * width;
    //             maxwater=Math.max(maxwater,curwater);
    //         }
    //     }
    //     return maxwater;
    // }
    // 2 pointer aproche
    public static int WaterStore(ArrayList<Integer>hight)
    {
        int maxwater=0;
        int lp=0;
        int rp=hight.size()-1;

        while(lp < rp)
        {
            /// calculate watter

            int ht=Math.min(hight.get(lp),hight.get(rp));
            int width=rp-lp;
            int currwater=ht*width;                    /// timecomplecity=O(n)
            maxwater=Math.max(maxwater,currwater);

            // pointer move

            if(hight.get(lp)< hight.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> hight=new ArrayList<>();
        
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(WaterStore(hight));
    }
    
}

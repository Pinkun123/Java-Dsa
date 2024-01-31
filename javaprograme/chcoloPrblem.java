import java.util.Arrays;
import java.util.Collections;

public class chcoloPrblem {
    public static void main(String[] args) {
        int m,n;
        Integer costHer[]={2,1,3,1,4}; // m-1   // herizonatl
        Integer costVer[]={4,1,2}; // n-1  // vertical

        // sort reverse oder of both 
        Arrays.sort(costHer,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());

        int h=0 ; int v=0;  // h=herizontal cut , v= vertical cut
        int hp=1; int vp=1;  // hp= herizontal choc pic , vp= vertcial choco pic
        int cost=0;  
        while(h<costHer.length && v<costVer.length)
        {
            if(costHer[h] <= costVer[v])  // vertical cut
            {
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
            else{ // herizonatal cut
                cost+= (costHer[h]*vp);
                hp++;
                h++;       
            }
        }

        // skip vertical cut
        while(v< costVer.length)
        {
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        // skip herzonatal cut
        while(h < costHer.length){
            cost+= (costHer[h]*vp);
            hp++;
            h++; 
        }
        System.out.println("minimu cost of pic in chocolate="+cost);
    }
    
}

import javax.lang.model.util.ElementScanner14;

public class shortestpath {

    public static float getshortestpath(String str)
    {
        int x=0 , y=0;

        for(int i=0;i<str.length(); i++)
        {
            int dir=str.charAt(i);
           // for south direction
            if(dir == 'S')
            {
                y--;
            }

            // for north direction

            else if(dir == 'N')
            {
                y++;
            }

            // for west diection

            else  if(dir == 'W')
            {
                x--;
            }

            // for east direction

            else {
                x++;
            }
        }
        int X2=x*x;          // for xsqure

        int Y2= y*y;       // for y square

        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(getshortestpath(str));
    }
    
}

public class recursion2 {

    // reverssting
    /*
     * 
     * public static void revstring(String str,int idx)
     * {
     * if(idx==0)
     * 
     * {
     * System.out.println(str.charAt(idx));
     * return ;
     * }
     * System.out.println(str.charAt(idx));
     * revstring(str, idx-1);
     * 
     * }
     * 
     * public static void main(String[] args) {
     * String str="abcd";
     * revstring(str,str.length()-1);
     * }
     */

    // move all xxx from string to last

    public static void moveall(String str,int idx,int count,String newsString)
    {
        // base case
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newsString +=count;
            }
            System.out.println(newsString);
            return;
        }
        char curentchar=str.charAt(idx);

        if(curentchar=='x')
        {
            count++; // for count xx
            moveall(str, idx+1, count, newsString);
        }
        else
        {
            newsString +=curentchar; // add  charter only
            moveall(str, idx+1, count, newsString);
        }
    }

    public static void main(String[] args) {
        String str = "axcbxxxcxxd";

        moveall(str, 0, 0, "");
    }

}

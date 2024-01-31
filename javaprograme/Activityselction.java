// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;
import java.util.*;
public class Activityselction {
    // for sorted array
    // public static void main(String[] args) {
    //     int start[]={1,3,0,5,8,5};
    //     int end[]={2,4,6,7,9,9};

    //     // end time basic sort
    //     int maxAct=0;
    //     ArrayList<Integer> ans=new  ArrayList<>();

    //     // 1st activity select
    //     maxAct=1;
    //     ans.add(0);
    //     int lastEnd= end[0];

    //     for(int i=0;i<end.length;i++)
    //     {
    //         if(start[i]>=lastEnd)
    //         {
    //             maxAct++;
    //             ans.add(i);
    //             lastEnd=end[i];
    //         }
    //     }
    //     System.out.println("max Activity =" +maxAct);

    //     for(int i=0;i< ans.size();i++)
    //     {
    //         System.out.println("A"+ans.get(i));
    //     }
    // }

    public static void main(String[] args) {
        // un sorted array

        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
       
        // basic sorted end
        int maxAct=0;
        ArrayList<Integer> ans=new  ArrayList<>();
        int activites[][]=new int[start.length][3];
        // lambda function
        Arrays.sort(activites,Comparator.comparingDouble(o -> o[2]));

        for(int i=0;i<start.length;i++)
        {
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        }

        // fist activty selct
         maxAct=1;
         ans.add(activites[0][0]);
         int lastEnd=activites[0][2];
         for(int i=0;i<end.length;i++)
         {
            if(activites[i][1] >= lastEnd)
            {
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd=activites[i][2];
            }
         }
         System.out.println("max Activity =" +maxAct);

             for(int i=0;i< ans.size();i++)
             {
                 System.out.println("A"+ans.get(i));
             } 
    }
    
}

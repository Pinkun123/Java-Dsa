import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.*;

public class jobSequency {
    static class Job{
        int deadline;
        int porfit;
        int id;

        public Job(int i, int d,int p)
        {
            id=i;
            deadline=d;
            porfit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> job=new ArrayList<>();
        // job info data store in job arraylist
        for(int i=0;i<jobInfo.length;i++)
        {
            job.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // sorted arraylist in desscending order
        Collections.sort(job,(obj1,obj2) -> obj2.porfit -obj1.porfit);
        ArrayList<Integer> seq= new ArrayList<>();
        int time=0;
        
        for(int i=0;i<job.size();i++)
        {
            Job curr=job.get(i);
            if(curr.deadline > time)
            {
                seq.add(curr.id);   
                time ++;
            }
        }
        // print seq
        System.out.println("max job ="+seq.size());
        for(int i=0;i< seq.size();i++)
        {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
    
}

import java.util.PriorityQueue;

public class conectnropes {
    public static void main(String[] args) {
        int ropes[]={4,3,2,6};

        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]); // ropes data add in pq
        }

        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();  // remove first minimum rope in 
            int min2=pq.remove();  // remove second minimum rope
            cost+=min+min2;
            pq.add(min+min2);
        }
        System.out.println("the cost of the ropes is="+cost);
    }
}

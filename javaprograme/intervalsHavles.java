import java.util.*;

public class intervalsHavles {
    public static void interVal(Queue<Integer> q)
    {
        Queue<Integer> FirstHalf=new LinkedList<>();
        int size=q.size()/2;
        for(int i=0;i<size;i++)
        {
            FirstHalf.add(q.remove()); //half element of quee store in  FirstHalf
        }

        while(!FirstHalf.isEmpty())
        {
            q.add(FirstHalf.remove()); // first half elmnet store in original quee
            q.add(q.remove());  // orginal quee elment remove add in rear part of quee
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);  
        q.add(9);
        q.add(10);
        interVal(q);
        while(!q.isEmpty())
        {
            System.out.print(q.remove());
        }
        System.out.println();
    }
}

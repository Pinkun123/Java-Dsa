import java.util.Stack;
import java.util.*;
public class satckinQuee {
    static class Quee{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        // check empty
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        // add data in quee
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());  // add element from s1 to s2
            }
            s1.push(data);   // add elment in s1
            
            while(!s2.isEmpty())
            {
                s1.push(s2.pop()); // add elmenet from s2 to s1
            }
        }
        /// remove data from quee
        public static int remove()
        {
            if(s1.isEmpty())
            {
                System.out.println("Quee is empty");
                return -1;
            }
            return s1.pop();
        }
        // peeek element from quee
        public static int peek()
        {
            if(s1.isEmpty())
            {
                System.out.println("Quee is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Quee q=new Quee();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}

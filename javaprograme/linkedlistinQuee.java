
public class linkedlistinQuee {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Quee{
        static Node head=null;
        static Node tail=null;
        // empty
        public static boolean isEmpty()
        {
            return head ==null & tail==null;//T.C= O(n)
        }
        /// add
        public static void add(int data)
        {
            Node newNode=new Node(data);
            // for single element add
            if(head ==null)
            {
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        // remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("the quee is empty");
                return -1;
            }
            int front=head.data;
            if(tail == head)
            {
                tail=head=null;
            }
            else
            {
                head=head.next;
            }
            return front;

        }
        // peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Quee is empty");
                return -1;
            }
            return head.data;
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

import javax.tools.StandardLocation;

public class DobuleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
  // add first in doublylinklist
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head == null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    // remove first
    public int removeFirst()
    {
        if(head == null)
        {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1)
        {
            int value=head.data;
            head=tail=null;
            size--;
            return value;

        }
        int value=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return value;
    }
    // print linklist
    public void print()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // reverse Dll
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DobuleLL Dll=new DobuleLL();
        Dll.addFirst(3);
        Dll.addFirst(2);
        Dll.addFirst(1);
        Dll.print();
        System.out.println(Dll.size);
        // Dll.removeFirst();
        // Dll.print();
        // System.out.println(Dll.size);
        Dll.reverse();
        Dll.print();
    } 
}

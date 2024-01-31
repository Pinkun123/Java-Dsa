import java.util.*;
public class linklist {
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        // step1-creat a new node

        Node newNode=new Node(data);
        size++;
        if(head== null)
        {
            head=tail=newNode;
            return;
        }
        

        // step2- newNode next=head

        newNode.next=head;// link

        // step3- head=newNode
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head== null)
        {
            head=tail=newNode;
            return;
        }
        

        tail.next=newNode;
        tail=newNode;
    }

    public void print()
    {
        if(head== null)
        {
            System.out.println("linklist is empty");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->"); 
            temp=temp.next;  
        }
        System.out.println("null");
        
    }
    public void add(int idx,int data)
    {
        Node newNode= new Node(data);
        Node temp=head;
        int i=0;
        size++;

        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }

        // i=idx-1 ,temp->prev

        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }

        //head= head.next
        int value=head.data;
        head=head.next;
        size--;
        return value;

    }
    public int ramoveLast()
    {
        if(size==0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }

        //prev->size-2;
        Node prev=head;

        for(int i=0;i<size-2;i++)
        {
             prev=prev.next;
        }
        int value=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return value;
    }
    public int itrSerch(int key)
    {
        int i=0;
        Node temp=head;
        while(temp !=null)
        {
            if(temp.data== key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key)
    {
        if(head== null)
        {
            return -1;
        }
        if(head.data== key)
        {
            return 0;
        }

        int idx= helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;
    }
    public int recSerch(int key)
    {
        return helper( head, key);

    }
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    
    }
    public void delatFromNthend(int n)
    {
        // calculate size of ll
        int sz=0;
        Node temp=head;
        while(temp != null)
        {
            temp=temp.next;
            sz++;

        }
        if(n==sz)
        {
           head=head.next;
           return;
        }

        // sz-n

        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findMidnode(Node head)
    {
        Node fast=head;
        Node slow=head;
        while(fast != null && fast.next != null)  // for both even and odd case
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow; // slow is mid node

    }
    public boolean checkPalindrom()
    {
        // base case
        if(head == null || head.next ==null)
        {
            return true;
        }
        // find midNode

        Node midnode=findMidnode(head);

        // reverse 2nd half
        Node prev=null;
        Node curr=midnode;
        Node next;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;   // 2nd midNode head
        Node left=head;
        // check  1st half element and 2nd half element
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;


    }
    public static boolean isCycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null)
        {
            slow=slow.next; //+1 move
            fast=fast.next.next; // +2 move
            if(slow ==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle()
    {
        //detect loop/ cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast != null && fast.next != null)
        {
            slow =slow.next;
            fast =fast.next.next;
            if(slow == fast)
            {
                cycle =true;
                break;
            }
        }
        if(slow != fast)
        {
            return;
        }

        // find meting point
        slow=head;
        Node prev=null;
        while(slow != fast)
        {
            prev=fast;
            slow=slow.next; // +1
            fast=fast.next; // +1
        }

        // remove cycle/loop -> last.next
        prev.next=null;

    }
    private Node getmid()
    {
        Node slow=head;
        Node fast= head.next;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;

        } 
        return slow; // slow is mid of node 
    }
    private Node merg(Node head1,Node head2)
    {
        // creat temp node
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1 != null)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2 != null)
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedll.next;
    }
    public Node mergeSort(Node head)
    {
        // base
        if(head == null || head.next == null)
        {
            return head;
        }

        // find mid
        Node mid=getmid();
        // left and right part sort
        Node righthead=mid.next;
        mid.next=null;

        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);
        // merger both left and right part
        return merg(newleft,newright);
    }
    public void Zigzag()
    {
        // find mid
        Node slow =head;
        Node fast= head.next;

        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow; // slow is mid of linklist
        // reverse 2nd half
        Node curr=mid.next;  // 2nd half head
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        Node left= head; /// left head
        Node right=prev;  // right head
        Node nextL,nextR;   // declar two temp node
        // zig zag merge
        while(left != null && right != null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;  // update keft
            right=nextR; // upadate right
        }
    }


    public static void main(String[] args) {
        // linklist ll=new linklist();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
       
       
        // ll.addFirst(1);
       
        // ll.addFirst(2);
        
        // ll.addLast(1);
    
        // ll.addLast(2);

        // ll.add(2, 9);
        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;  // 1->2->3->2

        
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        // ll.removeFirst();
        // ll.print();
        // ll.ramoveLast();
        // ll.print();
        // System.out.println(ll.itrSerch(4));
        // System.out.println(ll.itrSerch(10));
        // System.out.println(ll.recSerch(4));
        // System.out.println(ll.recSerch(10));
        // System.out.println(ll.size);
        // ll.reverse();
        //ll.delatFromNthend(2);
        // ll.print();
        // System.out.println(ll.checkPalindrom());
        linklist ll= new linklist();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5); 
        ll.delatFromNthend(1);
        ll.print();
        // // ll.head=ll.mergeSort(ll.head);
        // // ll.print();
        // ll.Zigzag();
        // ll.print();
        
    }
}

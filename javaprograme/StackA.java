import java.util.Stack;

// public class StackA {
//     static class Node{
//         int data;          /// stack by ussing linkedlist
//         Node next;
//          Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class stack{
//         static Node head=null;
//         // isempty
//         public static boolean isempty()
//         {
//            head=null;
//            return false;
//         }
//         //push
//         public static void push(int data)
//         {   Node newNode=new Node(data);

//             if(isempty())
//             {
//                  head=newNode;
//                  return;
//             }
//             newNode.next=head;
//             head=newNode;
//         }
//         //pop
//         public static int pop()
//         {
//             if(isempty())
//             {
//                 return -1;
//             }
//             int top=head.data;
//             head=head.next;
//             return top;
//         }
//         //peek
//         public static int peek()
//         {
//             if(isempty())
//             {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         stack s=new stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isempty())
//         {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
    
// }

// stack impliment by java collection farmework

public class StackA{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.empty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
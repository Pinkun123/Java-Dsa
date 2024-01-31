import java.util.*;

public class topviewtree {
    static class Node{   // node class
        int data;
        Node left;
        Node right;

       public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class info{   // info class
        Node node;   
        int hd;  // herizonatal distance

        public info(Node node, int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    public static void TopView(Node root)
    {
        Queue<info> q= new LinkedList<>();  // quee stroe data
        HashMap<Integer,Node> map= new HashMap<>();   // integr= key or value , Node= hd( herizonatl distance)
        q.add(new info(root, 0));   /// first add root and hd in queue
        q.add(null);
        int min=0;
        int max=0;

        while(!q.isEmpty())
        {
            info curr= q.remove();
            if(curr == null)    // last node
            {
                if(q.isEmpty())   /// queue is empty
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }

           else
           {
            if(!map.containsKey(curr.hd))   // first time hd is my occouring
            {
                map.put(curr.hd, curr.node);
            }
            if(curr.node.left != null)
            {
                q.add(new info(curr.node.left, curr.hd-1));
                min= Math.max(max,curr.hd-1);
            }
            if(curr.node.right != null)
            {
                q.add(new info(curr.node.right, curr.hd+1));
                max= Math.max(max, curr.hd+1);
            }
           }
        }

        /// print

        for( int i=min; i<= max; i++)
        {
            System.out.print(map.get(i).data +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        /*
                  1  ->1
                /   \          
               2     3  ->2    /// hight of treee =3
              / \   / \   
             4   5 6   7 ->3 
         */
        TopView(root);
    }
}

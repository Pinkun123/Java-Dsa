import java.util.LinkedList;
import java.util.Queue;

public class BianarytrreeA {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){  // constructor
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static class Binarytree{
        static int idx=-1;
        public static Node buildTree(int nodes[])    // buildtree
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }

            Node newnoNode=new Node(nodes[idx]);
            newnoNode.left=buildTree(nodes);
            newnoNode.right=buildTree(nodes);
            return newnoNode;
        }
        public static void preeOder(Node root)
        {
            if(root == null)
            {
                return;
            }
            System.out.println(root.data +" ");
            preeOder(root.left);
            preeOder(root.right);
        }
        public static void inOder(Node root){
            if(root == null)
            {
                return;
            }
            inOder(root.left);
            System.out.print(root.data +" ");
            inOder(root.right);
        }
        public static void postOrder(Node root)
        {
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }
        public static void levelOder(Node root)
        {
            if(root == null)
            {
                return;
            }

            Queue<Node> q= new LinkedList<>();
            q.add(root);  // root add in que
            q.add(null);  // null add for new line

            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);  // add null for next line
                    }
                }
                else{
                    System.out.print(currNode.data +" ");
                    if(currNode.left != null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null)
                    {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree trees= new Binarytree();
        Node root=trees.buildTree(nodes);
        // System.out.println(root.data);
        // trees.preeOder(root);
        // trees.inOder(root);
        // trees.postOrder(root);
        trees.levelOder(root);
        

    }
    
}

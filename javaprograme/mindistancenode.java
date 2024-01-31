import java.util.*;

public class mindistancenode {
    static class Node{
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
    public static Node Lca(Node root,int n1, int n2)
    {
        if(root ==null || root.data == n1 || root.data == n2)
        {
            return root;
        }

        Node LeftLca=Lca(root.left, n1, n2);
        Node RightLca=Lca(root.right, n1, n2);

        if(LeftLca == null)
        {
            return RightLca;
        }
        if(RightLca == null)
        {
            return LeftLca;
        }

        return root;
    } 
    public static int lcaDist(Node root,int n)
    {
        if(root == null)
        {
            return -1;
        }

        if(root.data == n)
        {
            return 0;   // distance at root
        }

        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1)
        {
            return -1;
        }
        else if(leftDist == -1)
        {
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
        
    } 
    public static int minDist(Node root, int n1, int n2)
    {
        Node lca=Lca(root, n1, n2);  // lowest coomen  ancestor
        int Dist1=lcaDist(lca,n1);   // distance for path 1
        int Dist2=lcaDist(lca,n2);  // distance for path 2
        return Dist1+Dist2;   // total distance
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

         int n1=4;int n2=7;
         System.out.println(minDist(root, n1, n2));
    }
    
}

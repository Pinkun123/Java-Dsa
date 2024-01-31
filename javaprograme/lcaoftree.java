import java.util.ArrayList;

public class lcaoftree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data)
        {
            this.data= data;
            this.left= null;
            this.right = null;
        }
    }
    public static boolean GetPath(Node root,int n, ArrayList<Node> path)   // Aproche1
    {
        /// base case
        if(root == null)
        {
            return false;
        }

        path.add(root);

        if( root.data== n)   // node match at root
        {
            return true;
        }

        boolean LeftFound=GetPath(root.left, n, path);
        boolean RightFound=GetPath(root.right, n, path);

        if( LeftFound || RightFound)  // node match in any node give true
        {
            return true;
        }
        path.remove(path.size()-1);  // supose node is mismatch  remove patha from last node of tree
        return false;
    }
    public static Node Lca(Node root, int n1, int n2)   // tc=O(n)  sc=O(n)
    {
        ArrayList<Node> path1= new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();

        GetPath(root,n1,path1);  // store path1 node of tree
        GetPath(root,n2,path2);  // store path2 node of tree

        // Last Common Anccster
        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i) != path2.get(i))   // Both path node mismatch
            {
                break;
            }
        }

        // last equal node -> i-1th
        Node lca=path1.get(i-1);
        return lca;

    }
    public static Node Lca2(Node root, int n1, int n2)
    {
        if(root == null || root.data == n1 || root.data == n2)
        {
            return root;
        }

        Node LeftLca= Lca2(root.left, n1, n2);
        Node RightLca=Lca2(root.right, n1, n2);

        if(LeftLca == null)    // if leftlca is null then node is presnt right lca
        {
            return RightLca;
        }

        if(RightLca == null)   /// if rightlca is null them node is prenst left lca
        {
            return LeftLca;
        }

        return root;
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
        //  System.out.println(Lca(root, n1, n2).data +" ");
        System.out.println(Lca2(root, n1, n2).data+" ");
    }
    
}

import java.util.ArrayList;

public class printpathleaf {
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data)
        {
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node insert(Node root, int val)
    {
        if(root == null){
            root=new Node(val);
            return root;
        }

        if(root.data > val)
        {   // left side of tree
            root.left=insert(root.left, val);
        }
        else{   //  right side of tree
            root.right=insert(root.right, val);
        }

        return root;
    }
   
    public static void inOreder(Node root)
    {
        if(root == null)
        {
            return;
        }

        inOreder(root.left);
        System.out.print(root.data+" ");
        inOreder(root.right);
    }
    public static Node Delate(Node root, int val)
    {
        if(root.data > val)
        {
            root.left=Delate(root.left, val);
        }
        else if(root.data < val)
        {
            root.right=Delate(root.right,val);
        }
        else{   // voila 
            // case-1 -> no child(leaf node)

            if( root.left == null && root.right == null)
            {
                return null;
            }

            // case-2 -> one child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            // case-3 -> two child

            Node IS=findInordesucssor(root.right);
            root.data=IS.data;
            root.right=Delate(root.right, IS.data);
        }
        return root;
    }
    public static Node findInordesucssor(Node root)
    {
        while( root.left != null)
        {
            root =root.left;
        }
        return root;
    }
    public static void PrintRange(Node root, int k1, int k2)
    {
        if(root == null)
        {
            return;
        }
        if(root.data >= k1 && root.data <= k2)
        {
            PrintRange(root.left, k1, k2);
            System.out.print(root.data +" ");
            PrintRange(root.right, k1, k2);
        }
        else if(root.data < k1)
        {
            PrintRange(root.left, k1, k2);
        }
        else{
            PrintRange(root.right, k1, k2);
        }
    }
    public static void PrintPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void PrintPath2Leaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }

        path.add(root.data);  // add root data

        if(root.left == null && root.right == null){
            PrintPath(path);
        }

        PrintPath2Leaf(root.left, path);
        PrintPath2Leaf(root.right, path);
        path.remove(path.size()-1);  // remove last elment from arraylist
    }
    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        Node root= null;

        // inserrt

        for(int i=0;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        inOreder(root);
        System.out.println();
       PrintPath2Leaf(root,new ArrayList<>());
    }
    
}

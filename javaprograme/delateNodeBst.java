public class delateNodeBst {
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
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root= null;

        // inserrt

        for(int i=0;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        inOreder(root);
        System.out.println();
        root= Delate(root, 7);
        System.out.println();
        inOreder(root);
    }
    
}

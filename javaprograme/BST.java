public class BST {
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
        System.out.println(root.data+" ");
        inOreder(root.right);
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
    }
}

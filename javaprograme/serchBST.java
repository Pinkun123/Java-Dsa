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
    public static boolean bstSerch(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }
        if(root.data > key)
        {
            return bstSerch(root.left,key);
        }
        else{
            return bstSerch(root.right, key);
        }
       
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

        if(bstSerch(root, 8)){
            System.out.println("key is found");
        }
        else{
            System.out.print("key not found");
        }
    }
}

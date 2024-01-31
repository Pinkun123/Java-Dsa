public class transfromtree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }

    public static int Transfrom(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftChild=Transfrom( root.left);
        int rightChild=Transfrom(root.right);

        int data = root.data;
        int newLeft=root.left == null ? 0 : root.left.data;
        int newRight=root.right == null ? 0 :root.right.data;

        root.data=newLeft + leftChild + newRight + rightChild;

        return data;
    }

    public static void preeOder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data +" ");
        preeOder(root.left);
        preeOder(root.right);

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
          
        /*
         *       27          
                /   \          
               9    13  ->2    /// hight of treee =3
              / \   / \   
             0   0 0   0 ->3
         */
        Transfrom(root);
        preeOder(root);
    }
}

public class sumNode {
    static class Node{
        int data;
        Node right,left;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int Sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int sumLeft=Sum(root.left);   // sum of all node in left part of tree
        int sumRight=Sum(root.right); // sum of all node in right part of tree

        return (sumLeft + sumRight)+root.data;  // sum of all node in tree
    }
    public static void main(String[] args) {
        /*
                  1  ->1
                /   \          
               2     3  ->2    /// hight of treee =3
              / \   / \   
             4   5 6   7 ->3 
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(Sum(root));

    }
    
}

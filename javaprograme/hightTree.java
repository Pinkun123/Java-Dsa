public class hightTree {
    static class Node{
        int data;
        Node right,left;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int hight(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int Lh= hight(root.left);   // left node hight
        int Rh= hight(root.right);  // right node hight
        return Math.max(Lh, Rh) +1;  // recursion
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
        System.out.println(hight(root));

    }
    
}

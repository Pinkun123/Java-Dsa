public class mirrorBst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left = this.right = null;
        }
    }
    public static Node CreatMirror(Node root){
        if(root == null){
            return null;
        }

        Node LeftMirror=CreatMirror(root.left);
        Node RightMirror=CreatMirror(root.right);

        // swap
        root.left=RightMirror;
        root.right=LeftMirror;
        return root;
    }
    public static void preeOder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preeOder(root.left);
        preeOder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        /*
                  8  ->1
                /   \          
               5    10  ->2    /// hight of treee =3
              / \     \   
             3   6     11->3 
         */

         // creat mirror

         /*
                  8  ->1
                /   \          
               10    5  ->2    /// hight of treee =3
              /     / \   
             11    6   3 ->3    // mirror BST
         */
        root=CreatMirror(root);
        preeOder(root);
    }
    
}

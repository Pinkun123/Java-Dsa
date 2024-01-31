import java.util.ArrayList;

public class ConvertBalancedBst {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void GetInOder(Node root , ArrayList<Integer> InOder){   // 1 - InOder sequnce  get sorted array
        if(root == null){
            return;
        }
        GetInOder(root.left, InOder);
        InOder.add(root.data);  // addd data in ArrayList
        GetInOder(root.right, InOder);
    }
    public static Node CreatBst(ArrayList<Integer> InOder , int st , int end){  // 2 - convert balnced bst
        if(st > end){
            return null;
        }

        int mid=(st + end)/2;
        Node root =new Node(InOder.get(mid));
        root.left=CreatBst(InOder, st, mid-1);
        root.right=CreatBst(InOder, mid+1, end);
        return root;
    }
    public static Node BalanceBst(Node root){
        // 1 - InOder sequnce  get sorted array
        ArrayList<Integer> InOder=new ArrayList<>();
        GetInOder(root, InOder);

        // 2 - convert balnced bst
         root = CreatBst(InOder, 0, InOder.size()-1);
         return root;
    }

    public static void PreeOder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        PreeOder(root.left);
        PreeOder(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(8);
        root.left= new Node(6);
        root.left.left= new Node(5);
        root.left.left.left= new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        /*   given bst
         *        8
         *       / \
         *      6   10
         *     /     \
         *    5       11
         *   /         \
         *  3          12 
         */     
        
         /*  // expected BST
                  8  ->1
                /   \          
               5     11  ->2    /// hight of treee =3
              / \    / \   
             3   6 10   12 ->3 
         */

         root=BalanceBst(root);
         PreeOder(root);
    }
}

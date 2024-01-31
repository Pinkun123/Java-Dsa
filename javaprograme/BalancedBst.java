
public class BalancedBst {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node CreatBst(int arr[], int st, int end){
        // base case
        if(st > end){
            return null;
        }

        int mid=(st + end)/2;

        Node root=new Node(arr[mid]);  // mid data store in root
        root.left=CreatBst(arr, st, mid-1);
        root.right=CreatBst(arr, mid+1, end);
        return root;
    }

    public static void PreeOder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        PreeOder(root.left);
        PreeOder(root.right);
    }

    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
         /*
                  8  ->1
                /   \          
               5     11  ->2    /// hight of treee =3
              / \    / \   
             3   6 10   12 ->3 
         */
        Node root=CreatBst(arr, 0, arr.length-1);
        PreeOder(root);
    }
}

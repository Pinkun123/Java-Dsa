public class largestBst {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst,int size, int min, int max){
            this.isBst=isBst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxBst=0;

    public static Info LargestBst(Node root){
        // base case
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo=LargestBst(root.left);   // get left info 
        Info rightInfo=LargestBst(root.right);  // get right info
        int size=leftInfo.size + rightInfo.size + 1;  // get size of BSt

        int min=Math.min(root.data , Math.min(leftInfo.min , rightInfo.min));   // get min size of left subtree
        int max=Math.max(root.data , Math.max(rightInfo.max , rightInfo.max));   // get max size of right subtree

        // isBst

        if(root.data <= leftInfo.max || root.data >= rightInfo.min)    // for root
        {
           return new Info(false,size,min,max);
        }

        if(leftInfo.isBst && rightInfo.isBst){
            maxBst=Math.max(maxBst,size);
            return new Info(true,size,min,max);
        }

        return new Info(false, size, min,max);
    }

    public static void main(String[] args) {
        /*   given bst
         *         50
         *       /    \
         *     30      60
         *     / \     / \
         *    5   20  45  70
         *   /           /  \
         *              65   80
         *           
         */     
        Node root=new Node(50);

        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);
/*  // expected Bst
                  60 
        *         / \
        *        45  70  // size =5
                  /  \
                65   80
*/
        LargestBst(root);
        System.out.println("largest size of bst ="+maxBst);
    }
}

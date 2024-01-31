public class countNode {
    static class Node{
        int data;
        Node right,left;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int Count(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        
         int leftcount=Count(root.left);    // count node in left of tree
         int rightCount=Count(root.right);   // count of node in right of tree
         int treeNode=(leftcount + rightCount) +1;  // total node
         return treeNode;
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
        System.out.println(Count(root));

    }
       
}

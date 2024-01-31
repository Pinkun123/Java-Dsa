public class kthleveltree {
    static class Node{
        int data;
        Node right,left;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public static void kthLevel(Node root, int Level, int k)  // tc=O(n)
    {
        if(root == null)
        {
            return;
        }
        if(Level == k)
        {
            System.out.print(root.data +" ");
            return;
        }

        kthLevel(root.left, Level+1, k);
        kthLevel(root.right, Level+1, k);
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
        int k=3;
        kthLevel(root, 1, k);
    
    }
    
}

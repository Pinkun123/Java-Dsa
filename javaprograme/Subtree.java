public class Subtree {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
       
    }
    public static boolean isIdentical(Node node, Node subroot)
    {
        if(node == null && subroot == null)   // check all node after tree is subtree
        {
            return true;
        }
        else if(node == null || subroot == null || node.data != subroot.data)
        {
            return false;
        }

        if(!isIdentical(node.left, subroot.left))
        {
            return false;
        }
        if(!isIdentical(node.right, subroot.right))
        {
            return false;
        }
        return true;
    }
    public static boolean subtree(Node root, Node subroot)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == subroot.data)
        {
            if(isIdentical(root,subroot))
            {
                return true;
            }
        }

        // boolean leftAns=subtree(root.left, subroot.left);
        // boolean rightAns=subtree(root.right, subroot.right);   //  in this 3 step
        // return leftAns || rightAns;
        return subtree(root.left, subroot)  || subtree(root.right, subroot);  // skip 3 steps

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

         Node subroot=new Node(2);
         subroot.left=new Node(4);
         subroot.right=new Node(5);

         /*
             2
            / \
           4   5
         */
        System.out.println(subtree(root, subroot));
    }

    
}

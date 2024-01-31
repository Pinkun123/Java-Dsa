import java.rmi.registry.Registry;

public class diemetrTree {
    static class Node{
        int data;
        Node right,left;

        Node(int data) // constructor
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // hight of node
    public static int hight(Node root) 
    {
        if(root == null)
        {
            return 0;
        }

        int lhight=hight(root.left);
        int rhight=hight(root.right);
        return Math.max(lhight, rhight)+1;
    }
    /// aproche 1  tc= O(n^2)
    // dimeter of  node
    public static int dimeter(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int ldimetr=dimeter(root.left);
        int lhight=hight(root.left);
        int rdimetr=dimeter(root.right);
        int rhight=hight(root.right);
        int selfdimetr=(lhight + rhight)+1;
        return Math.max(selfdimetr,Math.max(ldimetr, rdimetr));
    }
    // aproche 2
    static class info{
        int diam;
        int ht;
        public info(int diam, int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    // diameter    tc=O(n)
    public static info diameter(Node root)
    {
        if( root == null){
            return new info(0, 0);
        }
        info leftinfo=diameter(root.left);
        info rightinfo= diameter(root.right);

        int diam= Math.max(Math.max(leftinfo.diam , rightinfo.diam) , leftinfo.ht + rightinfo.ht + 1);
        int ht= Math.max(leftinfo.ht, rightinfo.ht)+1;
        return new info(diam, ht);
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
        System.out.println(diameter(root).diam);

    }
}

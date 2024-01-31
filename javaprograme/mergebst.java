import java.util.ArrayList;

public class mergeBst {
    static class Node{
        int  data;
        Node left, right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void GetInOder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        GetInOder(root.left, arr);
        arr.add(root.data);
        GetInOder(root.right, arr);
    }
    public static Node CreatBst(ArrayList<Integer> arr , int st, int end){
        if(st >= end){
            return null;
        }

        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));

        root.left=CreatBst(arr, st, mid-1);
        root.right=CreatBst(arr, mid+1, end);

        return root;
    }
    public static Node MergeBst(Node root1, Node root2){
        // step-1 sprted Bst1 by using inoder sequncey

        ArrayList<Integer>arr1=new ArrayList<>();
        GetInOder(root1, arr1);

         // step-2 sprted Bst2 by using inoder sequncey
         ArrayList<Integer>arr2=new ArrayList<>();
         GetInOder(root2, arr2);

         // merge of 2 sorted arrylist

         ArrayList<Integer> finalarr=new ArrayList<>();

         int i=0;
         int j=0;

         while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }
            else{
                finalarr.add(arr2.get(j));
                j++;
            }
         }

         while(i < arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
         }
         while(j < arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
         }

        // step-4 creat new bst  

        return CreatBst(finalarr, 0, finalarr.size()-1);
    }

    public static void PreeOder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+"");
        PreeOder(root.left);
        PreeOder(root.right);
    }

    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node  root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(2);

        Node root= MergeBst(root1, root2);
        PreeOder(root);
    }
    
}

public class seagmenttree {
    static int tree[];

    public static void intilazation(int n){
        tree=new int[4*n];
    }
    
    public static int seagMentTree(int arr[],int sti,int start,int end){
        // base case
        if(start == end){
            tree[sti]=arr[start];
            return arr[start];
        }

        int mid=(start+end)/2;

        seagMentTree(arr, 2*sti+1, start, mid); // left node 2*sti+1
        seagMentTree(arr, 2*sti+2, mid+1, end);// right node 2*sti+2

        tree[sti]=tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        intilazation(n);
        seagMentTree(arr, 0, 0, n-1);  // sti= seagmnet tree idx=0

        // print seagmnt tree
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
    }
}

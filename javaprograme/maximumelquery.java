public class maximumelquery {
    static int tree[];

    public static void init(int n){
        tree=new int[4*n];
    }

    public static void buildSt(int arr[],int sti,int start,int end){   // tc=O(n) // max elment
        if(start == end){
            tree[sti]=arr[start];
            return;
        }

        int mid=(start+end)/2;

        buildSt(arr, 2*sti+1, start,mid);// left node
        buildSt(arr, 2*sti+2, mid+1, end);// right node
        tree[sti]=Math.max(tree[2*sti+1],tree[2*sti+2]);// max elment in the tree
    }
    public static int getMaxUtil(int sti,int si,int sj,int qi,int qj){
        // not overlap
        if(qj <= si || qi >= sj){
            return Integer.MIN_VALUE; // -infinite
        }
        // compltly overlap
        else if(qi <= si && qj >= sj){
            return tree[sti]; // tree node elment max
        }
        else{// partial overlap
            int mid=(si+sj)/2;
            int left=getMaxUtil(2*sti+1, si, mid, qi, qj);
            int right=getMaxUtil(2*sti+2, mid+1, sj, qi, qj);
            tree[sti]=Math.max(left, right);
            return tree[sti];

        }
    }
    public static int getMax(int arr[],int qi,int qj){// qi=query first idx,qj=query last idx
        int n=arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);// sti=0,start=0,end=n-1

    }
    public static void updateUtil(int sti,int si,int sj,int idx, int newVal ){
          // no overlap
          if(idx < si || idx > sj){
            return;
          }

          tree[sti]=Math.max(tree[sti],newVal);
          if(si != sj){ // not on leaf node
            int mid=(si+sj)/2;
            updateUtil(2*sti+1, si, mid, idx,newVal);
            updateUtil(2*sti+2, mid+1, sj, idx, newVal);
          }
    }
    public static void update(int arr[],int idx,int newVal){
        int n=arr.length;
        arr[idx]=newVal; // update new value at arr idx 2=20
        updateUtil(0, 0, n-1, idx, newVal); // sti=0,start=0,end=n-1
    }
    public static void main(String[] args) {
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;
        init(n);
        buildSt(arr, 0, 0, n-1); // sti=0,start=0

        // // print tree
        // for(int i=0;i<tree.length;i++){
        //     System.out.print(tree[i]+" ");
        // }
        System.out.println(getMax(arr, 2, 5)); // qi=2,qj=5  max=17
        update(arr, 2, 20);
        System.out.println(getMax(arr, 2, 5));// max=20
    }
}

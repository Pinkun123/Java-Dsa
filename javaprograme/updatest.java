public class updatest {
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static int buildSt(int arr[],int sti,int start,int end){
        // base case
        if(start == end){
            tree[sti]=arr[start];
            return arr[start];
        }

        int mid=(start+end)/2;
        buildSt(arr, 2*sti+1, start, mid); // left node
        buildSt(arr, 2*sti+2, mid+1, end); // right node
        tree[sti]=tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];
    }

    public static int getSumutil(int sti,int si,int sj,int qi,int qj){
        // non overlaping condtion
        if(qj <= si || qi >= sj){
            return 0;
        }

        // compltly overlaping
        else if(qi <=si && qj >= sj){
            return tree[sti];
        }

        // partial overlaping

        else{
            int mid=(si+sj)/2;
            int left=getSumutil(2*sti+1, si, mid, qi, qj);
            int right=getSumutil(2*sti+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getsum(int arr[],int qi,int qj){
        int n=arr.length;
        return getSumutil(0, 0, n-1, qi, qj);  // sti=0,start=0,end=n-1
    }
    
    public static void updateUtil(int sti ,int si,int sj,int idx ,int diff){// idx=2 update idx
        // overlaping
        if( idx <si || idx > sj){
            return;
        }
         tree[idx]+=diff; 
        // 
        if( si !=sj){ // not on leaf node
           int mid=(si+sj)/2;

           updateUtil(2*sti+1, si, mid, idx, diff);//left
           updateUtil(2*sti+2, mid+1, sj, idx, diff);// right
        }
    }
    public static void Update(int arr[],int idx,int newVal){
        int n=arr.length;
        int diff=newVal - arr[idx]; // arr[idx] =3 newVal=2 diff=2-3=1
        arr[idx]=newVal; // update
        updateUtil(0, 0, n-1, idx, diff);  // start=0 sti=0 end =n-1
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildSt(arr, 0, 0, n-1); // sti=0,start=0,end=n-1
        System.out.println(getsum(arr, 2, 5)); // qi=2,qj=5
        Update(arr, 2, 2);  // idx=2 /new vlue=2
        System.out.println(getsum(arr, 2, 5));// qi=2,qj=5
    }
}

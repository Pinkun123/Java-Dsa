public class queryinst {
    static int tree[];

    public static void intilazation(int n){
        tree=new int[4*n];
    }

    public static int buildSt(int arr[],int sti,int start,int end){  // sti=seagment tree index
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
    
    public static int getSumutil(int i ,int si,int sj ,int qi,int qj ){
        // non overlaping
        if(qj <= si || qi >= sj){ 
           
            return 0;
        }

        // non overlaping
        else if(qi <= si && qj >= sj){
            return tree[i];  // value store in tree idx
        }

        // partial overlapting
        else{
            int mid=(si+sj)/2;
            int left=getSumutil(2*i+1, si, mid, qi, qj);
            int right=getSumutil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getSum(int arr[],int qi,int qj){// qi= qeury start idx , qj=query last idx
        
        int n=arr.length;
        return getSumutil(0, 0, n-1, qi, qj);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        intilazation(n);
        buildSt(arr, 0, 0, n-1);// sti=0,start=0,end=n-1
        System.out.println(getSum(arr, 2,5 )); // qi=2 ,qj=5

    }
}

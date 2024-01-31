import java.util.HashSet;

public class countdistinctelment {
    public static void main(String[] args) {
        int num[]={4,2,2,9,10};

        HashSet<Integer>hs=new HashSet<>();

        for(int i=0;i<num.length;i++){
            hs.add(num[i]);
        }
        System.out.println(hs);
        System.out.println(hs.size());
    }
}

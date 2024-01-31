import java.util.HashSet;
import java.util.Iterator;

public class itrationHashSet {
    public static void main(String[] args) {
        HashSet<String>city=new HashSet<>();
        city.add("mumbai");
        city.add("chenai");
        city.add("hydrabd");
        city.add("banglore");

        // using itratior methode

        Iterator it=city.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // using inhanced methoed

        for(String cites: city){
            System.out.println(cites);
        }
    }
    
}

import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {
        // creat hashmap
        HashMap<String,Integer>hm=new HashMap<>();
        // addd data in hashmap  or insert-O(1)
        hm.put("india",200);
        hm.put("pakistan",40);
        hm.put("china", 230);

        System.out.println(hm);    ///out nput data in inoder sequency
        //get-O(1)
        int populattin=hm.get("india");
        System.out.println(populattin);
        System.out.println(hm.get("china"));
        System.out.println(hm.get("indonesia"));  // give null bcs the data does not prest in hashmap
        //containskey-O(1)
        System.out.println(hm.containsKey("india")); // true
        System.out.println(hm.containsKey("indonesia"));  // false
        //remove -O(1)
        System.out.println(hm.remove("india")); // only string is remove not remove data
        System.out.println(hm);
        //
    }
    
}

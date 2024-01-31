import java.util.HashMap;


public class itiratorTickets {
    public static String getTickets( HashMap<String,String>ticktes){
        HashMap<String,String>revmap=new HashMap<>();

        for(String key: ticktes.keySet()){
            revmap.put(ticktes.get(key),key);
        }

        for(String key:ticktes.keySet()){
            if(!revmap.containsKey(key)){
                return key; // starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String>ticktes=new HashMap<>();
        ticktes.put("Chennai","Bangluru");
        ticktes.put("Mumbai","Delhi");
        ticktes.put("Goa","Chennai");
        ticktes.put("Delhi","Goa");
        
        String start=getTickets(ticktes);
        System.out.print(start);
        for(String key:ticktes.keySet()){
            System.out.print("->" + ticktes.get(key));
            start=ticktes.get(key);
        }
    }
}

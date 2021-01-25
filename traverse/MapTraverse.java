package traverse;

import java.util.*;

public class MapTraverse {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        // keySet()
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // iterator and entrySet()
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //values()
        for (String v : map.values()) {
            System.out.println(v);
            
        }
    }
}

package CollectionFrameWork.HashMap;

import java.util.*;

public class BasicHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("china", 150);
        map.put("usa", 100);
        // System.out.println(map);
        System.out.println(map.get("china"));
        System.out.println(map.containsValue(150));
        // iterator in hashmap
        // for (Map.Entry<String, Integer> e : map.entrySet()) {
        // System.out.println(e.getKey() + " " + e.getValue());
        // }
        // // alternate aproach
        // Set<String> keys = map.keySet();
        // for (String key : keys) {
        // System.out.println(key + " " + map.get(key));
        // }
        System.out.println(map.remove("India"));
        System.out.println(map);

    }
}

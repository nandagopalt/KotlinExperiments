package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapByExample1 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "Eleven");
        map.put(3, "Three");
        map.put(21, "Twenty One");
        //map.put(null, null);
        //map.put(null, null);
        //map.put(23, null);
        System.out.println("Hashmap with unique entry :" + map);
        System.out.println("Hashmap with unique entry and insertion order maintained :" + new LinkedHashMap<>(map));
        System.out.println("Hashmap with unique entry and arranging the entries in map with ascending key values :" + new TreeMap<>(map));
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(11, "Eleven");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(21, "Twenty One");
        System.out.println("Hashmap with unique entry and insertion order is maintained :" + linkedHashMap);
    }
}

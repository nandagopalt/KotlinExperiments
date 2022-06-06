package Logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(null, null);
        map.put(null, "null");
        map.put(4, null);
        //map.put(4, "Four");
        map.put(5, "Five");
        System.out.println(map);
        // Iterating the hashmap through entry set
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key from Entry :" + entry.getKey() + "," + "Value from Entry :" + entry.getValue());
        }
        // Iterating the hashmap through key set
        for (Integer key : map.keySet()) {
            System.out.println("Key :" + key);
        }
        // Iterating the hashmap through values
        for (String value : map.values()) {
            System.out.println("Value : " + value);
        }

        // Iterator for iterating the values for the hashmap
        Iterator<String> iterator1 = map.values().iterator();
        System.out.println("Values are :");
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next());
            System.out.print(" ,");
        }

        // Iterator for iterating the keyset for the hashmap
        Iterator<Integer> iterator2 = map.keySet().iterator();
        System.out.println("Keys are :");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next());
            System.out.print(" ,");
        }

    }
}

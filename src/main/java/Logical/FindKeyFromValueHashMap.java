package Logical;

import java.util.HashMap;
import java.util.Map;

public class FindKeyFromValueHashMap {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        Integer value = 3;
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() == value) {
                System.out.println("Key :" + entrySet.getKey() + "," + "Value :" + entrySet.getValue());
                break;
            }
        }

    }
}

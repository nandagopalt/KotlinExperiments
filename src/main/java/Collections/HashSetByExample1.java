package Collections;

import java.util.*;

public class HashSetByExample1 {
    @Override
    public String toString() {
        return "HashSetByExample1";
    }

    public static void main(String args[]) {
        HashSetByExample1 hs = new HashSetByExample1();
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(3);
        linkedList.add(21);
        linkedList.add(25);
        linkedList.add(25);
        //hs.hashSet();
        //hs.treeSet();
        System.out.println("Items from the linkedList: " + linkedList);
        System.out.println("Items after added to the HashSet(Removed the duplicates) :" + new HashSet<>(linkedList));
        System.out.println("Items after added to the LinkedHashSet(Removed duplicates and order is maintained :" + new LinkedHashSet<>(linkedList));
        System.out.println("Items after added to the TreeSet(Removed duplicates and sort the elements in ascending order :" + new TreeSet<>(linkedList));
    }

    private void treeSet() {
        // TreeSet -> Balanced tree data structure -> Elements are sorted by default in ascending order
        Set<String> set = new TreeSet<>();
        set.add("v");
        set.add("a");
        set.add("c");
        set.add("b");
        set.add("e");
        System.out.println(set.add("b"));
        //set.add(null);
        System.out.println(set);
    }

    private void hashSet() {
        /*
        1. Set Interface -> Implementation -> Hashset and LinkedHashset
        2. Hashset
            + Insertion Order is not maintained.
            + Stores all the values in form of objects.
            + Duplicates are not allowed.
            + Data structure used : Hashtable / Used to store the hash value of the objects in the hash table
            + Algorithm used : Hashing
        3. LinkedHashset
            + Insertion order is maintained
            + Data structure used : Linked list + Hashtable
         */
        System.out.println("Hashset");

        Set set = new LinkedHashSet();
        set.add(112);
        set.add(2);
        set.add(3);
        set.add(41);
        set.add(1);
        set.add(null);
        System.out.println(set.add(112));
        // set.toArray(); // Convert any collection type to array
        System.out.println(set);
    }
}

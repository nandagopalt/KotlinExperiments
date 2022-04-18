package MethodReferences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MethodReferenceComparator {
    public static void main(String[] args) {
        List<Integer> rankList = Arrays.asList(7, 3, 2, 21, 14, 2);
        /* rankList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer element1, Integer element2) {
                return element2.compareTo(element1);
            }
        });*/
        rankList.sort((Integer::compareTo)); // print the list in ascending order through method reference
        rankList.sort(Comparator.reverseOrder()); // print the list in descending order through method reference

        //String joined = rankList.stream().map(Object::toString).collect(Collectors.joining(","));
        //System.out.println(joined);

        /*rankList.forEach(rankItem -> {
            String indexString = String.format("%s", rankItem);
            System.out.println(indexString);
        });*/
        Set<String> set = rankList.stream().map(Object::toString).collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}

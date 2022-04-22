package MethodReferences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RankPlayer {
    public static void main(String[] args) {
        List<Integer> rankList = Arrays.asList(21, 23, 20, 31, 25);
        List<Player> playerList = Arrays.asList(
                new Player("Player 1", 21, 3.18),
                new Player("Player 2", 23, 3.15),
                new Player("Player 3", 20, 3.11),
                new Player("Player 4", 31, 2.98),
                new Player("Player 5", 25, 2.30)
        );

        System.out.println("Player List before sorting :" + playerList);

        // 1. Sort the player based on the rank in the ascending order
       /* playerList.sort(new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Integer.compare(player1.getRank(), player2.getRank());
            }
        });*/
        // Using lambda expression
        //playerList.sort((player1, player2) -> Integer.compare(player1.getRank(), player2.getRank()));
        // Using method reference
        //playerList.sort(Comparator.comparingInt(Player::getRank));
        // Using streams
        List<Player> playerStreamList = playerList.stream().sorted(
                //(player1, player2) -> Integer.compare(player1.getRank(), player2.getRank())
                Comparator.comparingInt(Player::getRank)
        ).collect(Collectors.toList());
        System.out.println("Player List after sorting [Ascending order based on Rank attribute/field]");
        playerStreamList.forEach(System.out::println);
        //System.out.println("Player List after sorting [Ascending order based on Rank attribute/field] :" + playerList);
        //playerList.forEach(System.out::println);


        // 2. Sort the player based in the rank in the descending order
       /* playerList.sort(new Comparator<Player>() {
            public int compare(Player player1, Player player2) {
                return Integer.compare(player2.getRank(), player1.getRank());
            }
        });*/
        // Using lambda expression
        //playerList.sort((player1, player2) -> Integer.compare(player2.getRank(), player1.getRank()));
        // Using Method references
        //Comparator<Player> comparator = Comparator.comparingInt(Player::getRank);
        //playerList.sort(comparator.reversed());
        //System.out.println("Player List after sorting [Descending order based on Rank attribute/field] :" + playerList);
        List<Player> playerStreamList2 = playerList.stream().sorted(Comparator.comparingInt(Player::getRank).reversed()).collect(Collectors.toList());
        System.out.println("Player List after sorting [Descending order based on Rank attribute/field] :");
        playerStreamList2.forEach(System.out::println);
        //System.out.println("Rank list :" + rankList);

        // 3. Sorting the rank list in ascending order of sequence
       /* rankList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer rank1, Integer rank2) {
                return rank1.compareTo(rank2);
            }
        });*/
        // Using lambda expression
        //rankList.sort((Integer element1, Integer element2) -> element1.compareTo(element2));
        // Using method references
        //rankList.sort(Integer::compareTo);
        List<Integer> rankList1 = rankList.stream().sorted().collect(Collectors.toList());
        System.out.println("Rank List after sorting [Ascending order]: " + rankList1);


        // 4. Sorting the rank list in descending order of sequence
        /*rankList.sort(new Comparator<Integer>() {
            public int compare(Integer rank1, Integer rank2) {
                return rank2.compareTo(rank1);
            }
        });*/
        // Using the lambda expression
        //rankList.sort((Integer element1, Integer element2) -> element2.compareTo(element1));
        // Using the method references
        //Comparator<Integer> comparator1 = Integer::compareTo;
        //rankList.sort(comparator1.reversed());
        Comparator<Integer> comparator = Integer::compareTo;
        List<Integer> rankList2 = rankList.stream().sorted(comparator.reversed()).collect(Collectors.toList());
        System.out.println("Rank List after sorting [Descending order]: " + rankList2);

        List<String> namesList = Arrays.asList("Mohammed", "Jack", "Johnny");
        // Normal way of using the comparator to sort the collection
        namesList.sort(new Comparator<String>() {
            public int compare(String element1, String element2) {
                return element1.compareToIgnoreCase(element2);
            }
        });
        System.out.println("Normal sort");
        namesList.forEach(element -> System.out.println(element));
        // Using the lambda expression [Ascending order]
        namesList.sort((element1, element2) -> element1.compareToIgnoreCase(element2));
        System.out.println("Lambda expression");
        namesList.forEach(element -> System.out.println(element));
        // Using the method references [Ascending order]
        namesList.sort(String::compareTo);
        System.out.println("Method reference");
        namesList.forEach(element -> System.out.println(element));
        // Using the lambda expression [Descending order]
        namesList.sort((element1, element2) -> element2.compareToIgnoreCase(element1));
        // Using the method references [Descending order]
        Comparator<String> namesListComparator = String::compareToIgnoreCase;
        namesList.sort(namesListComparator.reversed());
        // Using the streams [Ascending order]
        List<String> namesStreamsAscendingList = namesList.stream().sorted().collect(Collectors.toList());
        // Using the streams [Descending order]
        Comparator<String> descendingComparator = String::compareToIgnoreCase;
        List<String> namesStreamsDescendingList = namesList.stream().
                sorted(descendingComparator.reversed()).
                collect(Collectors.toList());
    }
}

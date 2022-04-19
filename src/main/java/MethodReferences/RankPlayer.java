package MethodReferences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        playerList.sort(new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Integer.compare(player1.getRank(), player2.getRank());
            }
        });
        System.out.println("Player List after sorting [Ascending order based on Rank attribute/field] :" + playerList);

        // 2. Sort the player based in the rank in the descending order
        playerList.sort(new Comparator<Player>() {
            public int compare(Player player1, Player player2) {
                return Integer.compare(player2.getRank(), player1.getRank());
            }
        });
        System.out.println("Player List after sorting [Descending order based on Rank attribute/field] :" + playerList);

        System.out.println("Rank list :" + rankList);

        // 3. Sorting the rank list in ascending order of sequence
        rankList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer rank1, Integer rank2) {
                return rank1.compareTo(rank2);
            }
        });
        System.out.println("Rank List after sorting [Ascending order]: " + rankList);

        // 4. Sorting the rank list in descending order of sequence
        rankList.sort(new Comparator<Integer>() {
            public int compare(Integer rank1, Integer rank2) {
                return rank2.compareTo(rank1);
            }
        });
        System.out.println("Rank List after sorting [Descending order]: " + rankList);
    }

}

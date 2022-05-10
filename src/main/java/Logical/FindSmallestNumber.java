package Logical;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int[] rank = {11, 20, 21, 25, 30, 5, 3, 7, 200, 2};
        FindSmallestNumber findSmallestNumber = new FindSmallestNumber();
        System.out.printf("The Smallest Number from the array is %d", findSmallestNumber.findSmallestNumber(rank));
    }

    private int findSmallestNumber(int[] rank) {
        int smallestNumber = rank[0];
        for (int i = 0; i < rank.length - 1; i++) {
            int nextNumber = rank[i + 1];
            if (nextNumber < smallestNumber) {
                smallestNumber = nextNumber;
            }
        }
        return smallestNumber;
    }
}

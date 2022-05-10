package Logical;

public class FindBiggestNumber {

    public static void main(String[] args) {
        int rank[] = {30, 10, 23, 3, 28};
        FindBiggestNumber findBiggestNumber = new FindBiggestNumber();
        System.out.printf("Biggest number from the array is %d", findBiggestNumber.findBiggestNumber(rank));
    }

    private int findBiggestNumber(int[] rank) {
        int biggestNumber = rank[0];
        for (int i = 0; i < rank.length - 1; i++) {
            int nextNumber = rank[i + 1];
            if (nextNumber > biggestNumber) {
                biggestNumber = nextNumber;
            }
        }
        return biggestNumber;
    }
}

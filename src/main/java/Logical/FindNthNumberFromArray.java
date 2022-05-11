package Logical;

public class FindNthNumberFromArray {
    private static int count = 0;
    public static void main(String[] args) {
        int[] array = new int[500000000];
        int nthElement = 499999993;
        FindNthNumberFromArray findNthNumberFromArray = new FindNthNumberFromArray();
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i;
        }
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        long startTime = System.currentTimeMillis();
        findNthNumberFromArray.findNumber(array, firstIndex, lastIndex, nthElement);
        long endTime = System.currentTimeMillis();
        System.out.printf("Completion time: %dms [in Milliseconds]%n", endTime - startTime);
        System.out.printf("Item found at position/iteration : %d", count);
        /**
         * Number_to_find = 3123
         * midIndexElement = 0 + (4999 - 0) / 2 = 2499
         * if(Number_to_find < midIndexElement) {
         *  findNumber(array, midIndexElement,array.length, 3123)
         * }
         *
         */

    }

    private int findNumber(int[] array, int startIndex, int endIndex, int numberToFind) {

        /* int count = 0;
        boolean isEven = numberToFind % 2 == 0;
        long startTime = System.currentTimeMillis();
        if (isEven) {
            System.out.println("In Even block");
            for (int i = 0; i < array.length - 1; i = i + 2) {
                count++;
                if (array[i] == numberToFind) {
                    System.out.printf("Number found at position/iteration: %d%n", count);
                    break;
                }
            }
        } else {
            System.out.println("In Odd block");
            for (int i = 1; i < array.length - 1; i = i + 2) {
                count++;
                if (array[i] == numberToFind) {
                    System.out.printf("Number found at position/iteration: %d%n", count);
                    break;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Completion time: %dms [in Milliseconds]", endTime - startTime);
        */
        count++;
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        if (numberToFind == array[midIndex]) {
            return midIndex;
        } else if (numberToFind > array[midIndex]) {
            return findNumber(array, midIndex + 1, endIndex, numberToFind);
        }
        return findNumber(array, startIndex, midIndex - 1, numberToFind);
    }
}





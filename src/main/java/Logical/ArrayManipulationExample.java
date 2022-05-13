package Logical;

import java.util.Arrays;

public class ArrayManipulationExample {
    public static void main(String[] args) {
        int[] integerArray = new int[]{23, 11, 7, 3, 74, 21};
        ArrayManipulationExample arrManipulationExample = new ArrayManipulationExample();
        arrManipulationExample.printElement("Array before manipulation : ", integerArray);
        long startTime = System.currentTimeMillis();
        //int[] result1 = arrManipulationExample.addElementV2(integerArray, 4, 34);
        int[] result2 = arrManipulationExample.deleteElement(integerArray, 7);
        long completionTime = System.currentTimeMillis();
        arrManipulationExample.printElement("\nArray after manipulation : ", result2);
        System.out.println("\nTime taken to complete the execution :" + (completionTime - startTime) + "ms");
    }

    private void printElement(String message, int[] arr) {
        System.out.println(message);
        for (Integer element : arr) {
            System.out.printf(" %d ", element);
        }
    }

    private int[] addElement(int[] arr, int indexPositionToInsert, int insertionNumber) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        // 0,  1,  2, 3, 4,  5 ,  6
        // 23, 11, 7, 3, 74, 21, [34]
        for (int j = result.length - 1; j > indexPositionToInsert; j--) {
            result[j] = result[j - 1];
        }
        result[indexPositionToInsert] = insertionNumber;
        return result;
    }

    private int[] addElementV2(int[] arr, int indexPositionToInsert, int insertionNumber) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < indexPositionToInsert; i++) {
            result[i] = arr[i];
        }
        result[indexPositionToInsert] = insertionNumber;
        for (int j = indexPositionToInsert + 1; j < result.length; j++) {
            result[j] = arr[j - 1];
        }
        return result;
    }

    private int findElement(int[] arr, int element) {
        int indexPosition = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == element) {
                indexPosition = i;
                break;
            }
        }
        return indexPosition;
    }

    private int[] deleteElement(int[] arr, int elementToDelete) {
        int[] result = new int[arr.length - 1];
        int indexPosition = findElement(arr, elementToDelete);
        for (int i = 0; i < indexPosition; i++) {
            result[i] = arr[i];
        }
        for (int j = indexPosition; j < arr.length - 1; j++) {
            result[j] = arr[j + 1];
        }
        return result;
    }

    private int[] deleteElementV2(int[] arr, int elementToDelete) {
        int indexPosition = findElement(arr, elementToDelete);
        for (int i = indexPosition + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        return Arrays.copyOf(arr, arr.length -1);
    }
}

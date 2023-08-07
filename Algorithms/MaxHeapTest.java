package Algorithms;

import java.util.Arrays;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/6/23 07:20 PM
 */

public class MaxHeapTest {
    public static void main(String[] args){

        // Test Case 1: Basic test case with a small array
        int[] array1 = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
        testHeapSort(array1);

        // Test Case 2: Test with an already sorted array in ascending order
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        testHeapSort(array2);

        // Test Case 3: Test with an already sorted array in descending order
        int[] array3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        testHeapSort(array3);

        // Test Case 4: Test with a large random array
        int[] array4 = {45, 12, 78, 2, 94, 60, 23, 1, 10, 37};
        testHeapSort(array4);

        // Test Case 5: Test with an array with duplicate elements
        int[] array5 = {5, 2, 8, 5, 2, 10, 7, 3, 7, 8};
        testHeapSort(array5);


    }

    public static void testHeapSort(int[] array){
        System.out.println("Input array: "+ Arrays.toString(array));

        int[] arrayCopy = array;

        MaxHeap.heapSort(array);
        Arrays.sort(arrayCopy);

        boolean isSorted = Arrays.equals(array, arrayCopy);

        System.out.println("Heap Sorted: "+ Arrays.toString(array));
        System.out.println("Expected: "+ Arrays.toString(array));
        System.out.println("Is sorted: "+ isSorted);
        System.out.println();
    }
}

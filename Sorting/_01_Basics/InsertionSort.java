package Sorting._01_Basics;

import Sorting.Common.*;

public class InsertionSort {
    
/*
    * Intuition:
    * Insertion Sort builds the sorted array one item at a time.
    * It takes each element and inserts it into its correct position in the already sorted part of the array.
    *
    * Steps:
    * - Start from the second element (index 1)
    * - Compare it with elements before it
    * - Shift larger elements to the right
    * - Insert the current element into its correct position
    *
    * Time Complexity: O(n^2)
    * Space Complexity: O(1)  // in-place
 */

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse through 1 to n
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array:");
        SortUtils.printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted array:");
        SortUtils.printArray(arr);
    }
}

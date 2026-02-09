package Sorting._01_Basics;

import Sorting.Common.*;

public class SelectionSort {

/*
    * Intuition:
    * Selection Sort picks the smallest element
    * from the unsorted part and places it at the front.
    *
    * Steps:
    * - Find minimum element
    * - Swap with first unsorted index
    *
    * Time Complexity: O(n^2)
    * Space Complexity: O(1)  // in-place
 */

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            SortUtils.swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = SortUtils.sampleArray();
        System.out.println("Original array:");
        SortUtils.printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        SortUtils.printArray(arr);
    }
    
}

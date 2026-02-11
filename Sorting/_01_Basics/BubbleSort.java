package Sorting._01_Basics;

import Sorting.Common.*;

public class BubbleSort {

/*
    * Intuition:
    * Bubble Sort repeatedly steps through the list,
    * compares adjacent elements and swaps them if they are in the wrong order.
    *
    * Steps:
    * - Compare adjacent elements
    * - Swap if in wrong order
    * - Repeat until no swaps needed
    *
    * Time Complexity: O(n^2)
    * Space Complexity: O(1)  // in-place
 */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        SortUtils.printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        SortUtils.printArray(arr);
    }
    
}

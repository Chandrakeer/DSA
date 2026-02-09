package Sorting.Common;

public class SortUtils {

    // Utility method to swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];  
        arr[i] = arr[j];    
        arr[j] = temp;      
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Sample array for testing
    public static int[] sampleArray() {
        return new int[]{5, 1, 4, 2, 8};
    }
    
}

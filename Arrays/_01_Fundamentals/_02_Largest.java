package Arrays._01_Fundamentals;

public class _02_Largest {

    /*
     * Largest Element in an Array
     * Step 1: Initialize max to the first element of the array
     * Step 2: Loop from 1 → n-1
     * Step 3: If nums[i] > largest → update largest = nums[i]
     * Step 4: After loop → return largest
     *
     * Complexity
     *   Time: O(N)
     *   Space: O(1)
     */ 
    public static int findLargest(int[] nums){

        int n = nums.length;

        if ( n < 2) return -1;

        int largest = Integer.MIN_VALUE;

        for ( int i = 0; i < n; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }

        if(largest == Integer.MIN_VALUE) return -1;

        return largest;
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, -1, 2};

        int largest = findLargest(nums);

        System.out.println("Largest element in the array is: " + largest);
    }
    
}

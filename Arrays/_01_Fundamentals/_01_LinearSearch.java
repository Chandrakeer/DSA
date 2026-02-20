package Arrays._01_Fundamentals;

public class _01_LinearSearch {

    /*
     * Linear Search Algorithm - traverse the array to search for the element
     * Step 1: Loop from 0 → n-1
     * Step 2: If nums[i] == target → return i
     * Step 3: After loop → return -1
     *
     * Complexity
     *   Time: O(N)
     *   Space: O(1)
     */
    
    public static int findTargetIndex(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, -1, 2};
        int target = 2;

        int ans = findTargetIndex(nums, target);

        if (ans == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + ans);
        }
    }
}

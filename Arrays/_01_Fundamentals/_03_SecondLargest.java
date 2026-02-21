package Arrays._01_Fundamentals;

import java.util.Arrays;

public class _03_SecondLargest {

    // ask for the clarifying questions 
    // if array has atleast 2 distinct element?
    // Does array has duplicate elements?

    // Brute force
    public static int findSecondLargest(int[] nums){

        int n = nums.length;
        if ( n == 1) return -1;

        // O(nlogn)
        Arrays.sort(nums);

        int largest = nums[n-1];

        int secondLargest = Integer.MIN_VALUE;

        for(int i = n-2; i >= 0; i--){

            if ( nums[i] != largest){
                secondLargest = nums[i];
                break;
            }
        }

        if ( secondLargest == Integer.MIN_VALUE) return -1;

        return secondLargest;

    }

    // better approach
    public static int findSecondLargest2(int[] nums){

        int n = nums.length;

        if(n == 1) return -1;

        int largest = Integer.MIN_VALUE;

        for ( int i = 0; i < n; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] != largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }

        if( secondLargest == Integer.MIN_VALUE) return -1;

        return secondLargest;

    }

    public static void main(String[] args){

        int[] nums = {1,7,3,7,4,7};

        int ans = findSecondLargest(nums);

        int ans2 = findSecondLargest2(nums);

        System.out.println("Largest element in the array : " + ans);

        System.out.println("Largest element in the array : " + ans2);
    }
}

package Basic_Sorting;
import java.util.Arrays;

//Given an array arr[] of positive integers and another integer target.
// Determine if there exist two distinct indices such that the sum of
// their elements is equal to the target.
//
//Examples:
//Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
//Output: true
//Explanation: arr[3] + arr[4] = 6 + 10 = 16.

//Input: arr[] = [1, 2, 4, 3, 6], target = 11
//Output: false
//Explanation: None of the pair makes a sum of 11.

public class TwoSumPairwithGivenSum {

    // Your optimized twoSum method
    public static boolean twoSum(int arr[], int target) {
        Arrays.sort(arr); // Time: O(n log n)

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            long sum = (long) arr[left] + arr[right];  // Avoid overflow

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 16;

        boolean result = twoSum(arr, target);

        System.out.println("Two Sum Exists? " + result);
    }
}

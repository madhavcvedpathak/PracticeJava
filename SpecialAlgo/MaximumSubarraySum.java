package SpecialAlgo;

/**
 * MaximumSubarraySum.java
 *
 * Problem: Given an array arr[], find the maximum subarray sum.
 * A subarray is a continuous part of the array. (Kadanes algo)
 *
 * Difficulty: Medium
 * Constraints:
 *   1 ≤ arr.length ≤ 10^5
 *   -10^4 ≤ arr[i] ≤ 10^4
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaximumSubarraySum {

    /**
     * Function to find the maximum subarray sum using Kadane's Algorithm.
     *
     * @param arr input array of integers
     * @return maximum sum of any contiguous subarray
     */
    public static int maxSubarraySum(int[] arr) {
        // Initialize currentMax and globalMax with the first element
        int currentMax = arr[0];
        int globalMax = arr[0];

        // Traverse the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // Either extend the previous subarray or start new at arr[i]
            currentMax = Math.max(arr[i], currentMax + arr[i]);

            // Update global maximum if we found a new best sum
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    // Driver code for testing
    public static void main(String[] args) {
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr1));
        // Expected Output: 11

        int[] arr2 = {-2, -4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr2));
        // Expected Output: -2

        int[] arr3 = {5, 4, 1, 7, 8};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr3));
        // Expected Output: 25
    }
}

//Shravani Navnath Thorat ( 60 )

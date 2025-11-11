package SpecialAlgo;

/**
 * SimpleKadane.java
 *
 * Finds the maximum subarray sum using Kadane's algorithm.
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class SimpleKadane {

    /**
     * Returns the maximum subarray sum for the given array.
     *
     * @param nums input integer array (length >= 1 recommended)
     * @return maximum sum of any contiguous subarray
     */
    public static int maxSubarraySum(int[] nums) {
        // Edge case: if array is empty, we'd normally decide what to return.
        // Here we throw IllegalArgumentException for clarity.

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array must be non-null and non-empty.");
        }

        // currentMax: max subarray sum that ends at the current position
        // globalMax: maximum subarray sum found so far
        int currentMax = nums[0];
        int globalMax = nums[0];

        // Iterate from the second element to the end
        for (int i = 1; i < nums.length; i++) {
            // Either extend the previous subarray or start new at nums[i]
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Update global maximum if necessary
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    // Example usage
    public static void main(String[] args) {
        int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubarraySum(a);
        System.out.println("Maximum subarray sum = " + maxSum); // expected 6 (subarray [4, -1, 2, 1])
    }
}

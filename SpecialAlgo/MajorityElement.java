package SpecialAlgo;
import java.util.*;

public class MajorityElement {

    // Function to find majority element using Boyer-Moore Voting
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1, count = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        return (count > n / 2) ? candidate : -1;
    }

    // Driver code for IntelliJ
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 1, 3, 5, 1};
        System.out.println("Majority Element: " + majorityElement(arr1)); // Output: 1

        int[] arr2 = {7};
        System.out.println("Majority Element: " + majorityElement(arr2)); // Output: 7

        int[] arr3 = {2, 13};
        System.out.println("Majority Element: " + majorityElement(arr3)); // Output: -1
    }
}

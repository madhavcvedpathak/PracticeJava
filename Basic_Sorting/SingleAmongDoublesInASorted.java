package Basic_Sorting;

//Given a sorted array arr[].
//Find the element that appears only once in the array.
//All other elements appear exactly twice.
//You solution must run in O(log n) time and O(1) space.

public class SingleAmongDoublesInASorted {

    // Binary search method to find the single non-duplicate element
    static int findOnce(int[] arr) {
        int n = arr.length;

        // Edge case: array has only one element
        if (n == 1) return arr[0];
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Ensure mid is even
            if (mid % 2 == 1)
                mid--;

            // Valid pair → move right
            if (arr[mid] == arr[mid + 1])
                low = mid + 2;
            else
                high = mid;
        }
        // low == high, single element found
        return arr[low];
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        int[] arr2 = {5};
        int[] arr3 = {1, 2, 2, 3, 3};
        int[] arr4 = {1, 1, 2};

        System.out.println("Single element: " + findOnce(arr1)); // Output: 4
        System.out.println("Single element: " + findOnce(arr2)); // Output: 5
        System.out.println("Single element: " + findOnce(arr3)); // Output: 1
        System.out.println("Single element: " + findOnce(arr4)); // Output: 2
    }
}

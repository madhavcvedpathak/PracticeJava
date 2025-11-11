package Basic_Sorting;

//Given an array arr[] where no two adjacent elements are same, find the index of a peak element.
//An element is considered to be a peak if it is greater than its adjacent elements (if they exist).
//If there are multiple peak elements, return index of any one of them.
//The output will be "true" if the index returned by your function is correct;
//otherwise, it will be "false".
//Note: Consider the element before the first element and
//the element after the last element to be negative infinity.

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 80};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak index: " + peakIndex);
    }

    // Binary search to find a peak element index
    public static int findPeakElement(int[] arr) {
        int n = arr.length;

        // Edge cases
        if (n == 1 || arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int low = 1, high = n - 2; //search space is from low to high.
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid - 1]  &&  arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Should never happen based on problem constraints
    }
}

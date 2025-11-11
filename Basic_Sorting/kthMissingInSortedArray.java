package Basic_Sorting;

public class kthMissingInSortedArray {
    public int kthMissing(int[] arr, int k) { // Method to find the k-th missing positive number
        // Start of binary search
        int low = 0;
        int high = arr.length - 1;

        // Binary search to find where the k-th missing number should be
        while (low <= high) {
            int mid = (low + high) / 2;
            int correctNo = mid + 1; // This is the expected number at index mid if no number was missing
            int missing = arr[mid] - correctNo; // Calculate how many numbers are missing before arr[mid]

            // If missing numbers so far are more than or equal to k,
            // the answer must be to the left
            if (missing >= k)
                high = mid - 1;
            else
                low = mid + 1;// Otherwise, move to the right side
        }

        // Once the loop ends, high is the index before the k-th missing number
        // Formula to get the k-th missing number
        return high + 1 + k;
    }

    // Main method to test the function
    public static void main(String[] args) {
        kthMissingInSortedArray sol = new kthMissingInSortedArray();

        int[] arr = {2, 3, 4, 7, 11};

        int k = 5;

        int result = sol.kthMissing(arr, k);

        System.out.println("The " + k + "th missing number is: " + result);
    }
}

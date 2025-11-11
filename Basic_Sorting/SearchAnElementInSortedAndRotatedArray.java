package Basic_Sorting;

public class SearchAnElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = Search(arr, target);

        System.out.println(result != -1 ? "Element found at index: " + result : "Element not found.");
    }

    //Using Binary Search Approach.
    static int Search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;

            if (arr[low] <= arr[mid])  // Left half is sorted
                if (arr[low] <= target && target < arr[mid]) high = mid - 1;
                else low = mid + 1;
            else  // Right half is sorted
                if (arr[mid] < target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
        }
        return -1;
    }
}

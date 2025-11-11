package Basic_Sorting;

import java.util.ArrayList;

public class findFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;

        ArrayList<Integer> result = findFirstAndLast(arr, x);
        System.out.println("First and last occurrence of " + x + ": " + result);
    }

    public static ArrayList<Integer> findFirstAndLast(int[] arr, int x) {
        int first = findFirstOccurrence(arr, x);
        int last = findLastOccurrence(arr, x);

        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }

    // Find first occurrence using binary search
    public static int findFirstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1; // keep looking left
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Find last occurrence using binary search
    public static int findLastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                low = mid + 1; // keep looking right
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}

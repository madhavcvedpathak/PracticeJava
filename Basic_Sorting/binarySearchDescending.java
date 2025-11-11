package Basic_Sorting;

public class binarySearchDescending {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 40, 20, 10};  // Descending order
        int t = 40;
        boolean found = binarySearchDescending(arr, t);
        System.out.println("Is " + t + " present? " + found);
    }

    public static boolean binarySearchDescending(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == t) {
                return true;
            } else if (arr[mid] > t) {
                // Move to the right (smaller elements)
                low = mid + 1;
            } else {
                // Move to the left (larger elements)
                high = mid - 1;
            }
        }
        return false;
    }
}

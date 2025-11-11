package Basic_Sorting;

public class MaxToEnd {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5}; // Example array

        moveMaxToEnd(arr);

        // Print the array after moving max to end
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveMaxToEnd(int[] arr) {
        int max = arr[0];        // Start with the first element as max
        int maxIndex = 0;        // Store the index of the max

        // Step 1: Find the max element and its index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // Step 2: Move elements one position left from maxIndex
        for (int i = maxIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Step 3: Put the max element at the end
        arr[arr.length - 1] = max;
    }
}
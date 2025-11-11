package Basic_Sorting;
import java.util.ArrayList;

public class MoveAllZeroesToEnd {
    // Function to move all zeros to end using ArrayList
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Add all non-zero elements to list
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        // Step 2: Copy non-zero elements back to arr[]
        int index = 0;
        for (int num : list) {
            arr[index++] = num;
        }

        // Step 3: Fill remaining positions with 0
        while (index < n) {
            arr[index++] = 0;
        }
    }
    //--------------------------------------------------------
    // Function to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    //--------------------------------------------------------
    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("Original Array:");
        printArray(arr);

        pushZerosToEnd(arr);

        System.out.println("After Moving Zeroes:");
        printArray(arr);
    }
}

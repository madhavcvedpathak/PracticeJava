package Arrays;
import java.util.Arrays;

class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // number of positions to rotate
        System.out.println("Original array: " + Arrays.toString(arr));

        rotateRight(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k > n

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



}

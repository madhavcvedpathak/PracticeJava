package Arrays;
import java.util.Arrays;

class WaveArray {
    // Method to convert array to wave
    public static void convertToWave(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap adjacent elements
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(arr));

        convertToWave(arr);

        System.out.println("Wave Form Array: " + Arrays.toString(arr));
    }
}

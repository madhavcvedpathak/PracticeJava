package Arrays;
import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for result array

        int[] merged = new int[arr1.length + arr2.length];

        // Compare and merge elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from arr1
        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(result));
    }
}

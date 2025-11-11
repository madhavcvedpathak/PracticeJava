package Recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));   // [1, 2, 3, 4, 5, 6, 7, 8]
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;          // base case

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];

        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];       // copy actual elements

        mergeSort(a); mergeSort(b);
        merge(a, b, arr);            // write back into arr
    }

    /** Merges sorted arrays a and b into c. */
    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // merge while both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // copy any leftovers from a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // copy any leftovers from b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }



    int missingNum(int arr[]){
        // GFG - Missing in Array
        int n = arr.length + 1; // total numbers from 1 to n
        int i = 0;
        while (i < arr.length) {
            // Correct index where arr[i] should go is arr[i] - 1
            int correctIndex = arr[i] - 1;
            // Check if arr[i] is within bounds (1 to n-1) and not already at the correct index
            if (arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // After sorting, the first index i where arr[i] != i + 1 is the missing number
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return n; // If all are correct, the missing number is n
    }

    private void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    public ArrayList<Integer> findDuplicates(int[] arr) {
        //GFG - Array Duplicates
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int rightIdx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[rightIdx] == arr[i]) i++;
            else swap(arr, i, rightIdx);
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) ans.add(arr[i]);
        }
        return ans;
    }

}

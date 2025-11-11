package Recursion;

//You are given an array arr[] of size n - 1 that contains distinct integers
//in the range from 1 to n (inclusive).
//This array represents a permutation of the integers from 1 to n with one element missing.
//Your task is to identify and return the missing element.
public class MissingInArray {
    public static void main(String[] args) {
        MissingInArray m = new MissingInArray();
        int[] arr = {1,3,4,5};

        int missing = m.missingNum(arr);
        System.out.println("Missing Number is:. " + missing);
    }

    private int missingNum(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (i = 0; i <= arr.length; i++ ){
            if(arr[i] != i + 1) return i + 1;
        }
        return n;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

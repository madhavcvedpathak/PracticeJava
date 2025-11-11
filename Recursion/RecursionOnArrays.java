package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 12, 76, 9, 34, 5};
        int target = 76;

        System.out.print("Array elements:");
        recPrint(arr, 0);

        boolean found = exists(arr, target, 0);
        System.out.println("\n\nDoes " + target + " exist in the array? " + found);
    }

    public static boolean exists(int[] arr, int target, int idx) {
        if (idx == arr.length) return false;
        if (arr[idx] == target) return true;
        return exists(arr, target, idx + 1);
    }

    public static void recPrint(int[] arr, int idx) {
        if (idx == arr.length) return;
        System.out.print(" " + arr[idx]);
        recPrint(arr, idx + 1);
    }
}

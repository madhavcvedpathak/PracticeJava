package Practice;

public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 60, 50};
        int n = arr.length;
        if (isSorted(arr)) {
            System.out.print("Sorted.");
        } else {
            System.out.println("Unsorted.");
        }
    }
    static boolean isSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i - 1] > arr[i]) //prev ele is greater than current idx0 > idx1 : false
                return false;
        return true; //else true
    }
}

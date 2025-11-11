package Practice;
public class reverseArr {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        reverseArry(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    private static void reverseArry(int[] arr) {
        int n = arr.length;

        int[] temp = new int[n]; // Temporary array to store elements in reversed order

        for (int i = 0; i < n ; i++)
            temp[i] = arr[n - i - 1]; //Copy elements from original array to temp in reverse order
        for (int i = 0; i < n; i++)
            arr[i] = temp[i]; // Copy elements back to original array
    }
}

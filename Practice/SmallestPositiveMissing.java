package Practice;
import java.util.Scanner;

public class SmallestPositiveMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SmallestPositiveMissing obj = new SmallestPositiveMissing();
        int result = obj.missingNumber(arr);
        System.out.println("Smallest missing positive number is: " + result);
    }

    public int missingNumber(int[] arr) {
        int n = arr.length;

        // Place each number in its correct index (if in range 1 to n)
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                swap(arr, i, arr[i] - 1);
            }
        }
        // Find the first index where arr[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        // All positions are correct, so return n + 1
        return n + 1;
    }

    // Separated swap method
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class getSmaller {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (num < target) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Read array elements
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call the function
        ArrayList<Integer> result = getSmaller(arr, target);

        // Print result
        System.out.println("Elements smaller than " + target + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Newline after output
    }
}

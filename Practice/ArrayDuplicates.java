package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayDuplicates obj = new ArrayDuplicates();
        ArrayList<Integer> duplicates = obj.findDuplicates(arr);
        System.out.println("Duplicate elements are: " + duplicates);
    }


    public ArrayList<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> duplicates = new ArrayList<>();

        int i = 0;
        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // Collect duplicates
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1 && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }

    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

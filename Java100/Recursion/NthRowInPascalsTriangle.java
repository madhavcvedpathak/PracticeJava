package Java100.Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class NthRowInPascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number (n): ");
        int n = sc.nextInt();
        ArrayList<Integer> row = getNthRow(n);
        System.out.println("Row " + n + " of Pascal's Triangle: " + row);
    }

    static ArrayList<Integer> getNthRow(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        // Build rows from 0 to n-1
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { // First and last elements in a row are always 1
                    currentRow.add(1);
                } else {
                    // Sum of the two values above
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    currentRow.add(value);
                }
            }
            triangle.add(currentRow); // Add current row to triangle
        }
        return triangle.get(n - 1); // Return the nth row (0-based index: n-1)
    }
}

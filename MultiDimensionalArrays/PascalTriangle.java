package MultiDimensionalArrays;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the row number
        System.out.print("Enter the row number (n): ");
        int n = sc.nextInt();

        // Get the nth row
        ArrayList<Integer> row = getNthRow(n);

        // Print the result
        System.out.println("Row " + n + " of Pascal's Triangle: " + row);

        sc.close();
    }

    // Method to build the triangle and return nth row
    static ArrayList<Integer> getNthRow(int n) {
        // Create the main list to hold all rows
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        // Build rows from 0 to n-1
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // First and last elements in a row are always 1
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    // Sum of the two values above
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    currentRow.add(value);
                }
            }
            triangle.add(currentRow); // Add current row to triangle
        }
        // Return the nth row (0-based index: n-1)
        return triangle.get(n - 1);
    }
}

package Patterns.triangles;
import java.util.Scanner;

public class StarCrossPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for size (n): ");
        int n = scanner.nextInt();
        // n is a valid odd number
        if (n < 1 || n > 99 || n % 2 == 0) {
            System.out.println("Please enter a positive odd number (1–99).");
            return;
        }

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j) == (n + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//Enter an odd number for size (n): 7
//     *     *
//      *   *
//       * *
//        *
//       * *
//      *   *
//     *     *

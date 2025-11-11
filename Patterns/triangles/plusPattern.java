package Patterns.triangles;

import java.util.Scanner;

public class plusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for size (n): ");
        int n = scanner.nextInt();
        int mid = (n / 2) + 1; // middle row/column

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid) {
                    // Middle row: print numbers 1 to n
                    System.out.print(j + " ");
                } else if (j == mid) {
                    // Middle column: print current row number
                    System.out.print(i + " ");
                }
                else {
                    // All other places: print spaces
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        Enter an odd number for size (n): 5
//            1
//            2
//        1 2 3 4 5
//            4
//            5





    }
}

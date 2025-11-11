package Patterns.triangles;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: number of rows
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        if (n < 1 || n > 26) {
            System.out.println("Please enter a value between 1 and 26.");
            return;
        }

        // Outer loop for rows
//        for (int i = 1; i <= n; i++) {
//            // Inner loop for printing letters
//            for (int j = 0; j < i; j++) {
//                char letter = (char) ('A' + j);
//                System.out.print(letter + " ");
//            }
//            System.out.println(); // Move to next line
//        }
//        Enter the number of rows (n): 5
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E



//        for (int i = 1; i <= n; i++) {
//            char letter = (char) ('A' + i - 1);  // Same letter for the row
//            for (int j = 1; j <= i; j++) {
//                System.out.print(letter + " ");
//            }
//            System.out.println();
//        }
//        Enter the number of rows (n): 8
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//        F F F F F F
//        G G G G G G G
//        H H H H H H H H



    }
}

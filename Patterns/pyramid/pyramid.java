package Patterns.pyramid;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) { //rows
            for (int j = 1; j <= n-i; j++) { //columns
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }





    }
}

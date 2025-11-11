package Patterns.triangles;

import java.util.Scanner;

public class StarVerticallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (n): ");
        int n = scanner.nextInt();

//        for (int i = 1; i <= n; i++) { //rows
//            for (int j = 1; j <= n; j++) { //columns
//                if ((i+j)>n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println(); // Move to next line
//        }

        for(int i=1; i<= n; i++){ //rows
            for (int j=1; j<=n-i; j++){ //columns
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Enter number (n): 5
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
package Patterns.triangles;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (n): ");
        int n = scanner.nextInt();


        for(int i=1; i<= n; i++){ //rows
            for (int j=1; j<=n-i; j++){ //columns
                System.out.print("  "); //two spaces
            }
            for (int j=1; j<=n; j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Enter number (n): 5
//                        * * * * *
//                    * * * * *
//                * * * * *
//            * * * * *
//        * * * * *
package Patterns.triangles;

import java.util.Scanner;

public class oddTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rows count: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            //i is rows and j is colm so
            //j should less or equal than i
            int a = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a += 2;
            }
            System.out.println();
        }
    }
}
//Enter Rows count: 5
//        1
//        1 3
//        1 3 5
//        1 3 5 7
//        1 3 5 7 9

package Patterns.triangles;

import java.util.Scanner;

public class RightAngleTriangle2 {
    //hollow tringle
    public static void triangle(int s) {
        for (int i = 1; i <= s; i++) {
            if (i == 1) {
                System.out.println("*");
            } else if (i == s) {
                for (int j = 1; j <= s; j++) {
                    System.out.print("*");
                    if (j < s) System.out.print(" ");
                }
                System.out.println();
            } else {
                System.out.print("* ");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        triangle(s);
    }
}

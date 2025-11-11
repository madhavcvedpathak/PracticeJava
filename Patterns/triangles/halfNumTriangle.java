package Patterns.triangles;
import java.util.Scanner;

public class halfNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows for 🔼:");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            //i is rows and j is colm so
            //j should less or equal than i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//Enter Rows for 🔼:5
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
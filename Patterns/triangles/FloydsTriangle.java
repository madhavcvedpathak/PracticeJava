package Patterns.triangles;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows for 🔼:");
        int n = sc.nextInt();

        int a=1;
        for(int i=1; i<= n; i++){
            //i is rows and j is colm so
            //j should less or equal than i
            for (int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
//Enter Rows for 🔼:5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

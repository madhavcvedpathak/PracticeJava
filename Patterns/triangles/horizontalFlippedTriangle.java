package Patterns.triangles;

import java.util.Scanner;

public class horizontalFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows for 🔼:");
        int n = sc.nextInt();
        if (n < 1 || n > 26) {
            System.out.println("Please enter a value between 1 and 26.");
            return;
        }

//        for(int i=n; i>= 1; i--){
//            //i is rows and j is colm so
//            //j should less or equal than i
//            for (int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        Enter Rows for 🔼:5
//                * * * * *
//                * * * *
//                * * *
//                * *
//                *


//        for(int i=n; i>= 1; i--){
//            //i is rows and j is colm so
//            //j should less or equal than i
//            for (int j=1; j<=i; j++){
//                System.out.print(j+"  ");
//            }
//            System.out.println();
//        }
//        Enter Rows for 🔼:4
//        1  2  3  4
//        1  2  3
//        1  2
//        1



        for (int i = n; i >= 1; i--) {
            // Inner loop: print 'a' to current
            for (int j = 0; j < i; j++) {
                char letter = (char) ('a' + j);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
//        Enter Rows for 🔼:5
//        a b c d e
//        a b c d
//        a b c
//        a b
//        a


    }
}

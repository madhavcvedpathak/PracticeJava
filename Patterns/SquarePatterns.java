package Patterns;

import java.util.Scanner;

public class SquarePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Number :");
        int row = sc.nextInt();
        System.out.print("Enter Col Number :");
        int col = sc.nextInt();

        //to print *stars
//        for(int i=1; i<= row; i++){
//            for (int j=1; j<=col;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        Enter Row Number :4
//        Enter Col Number :3
//                * * *
//                * * *
//                * * *
//                * * *

        //to print from 1234, 1234
//        for(int i=1; i<= row; i++){
//            for (int j=1; j<=col;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        Enter Row Number :4
//        Enter Col Number :4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4

        //to print letters abcd
//        for(int i=1; i<= row; i++){
//            for (int j=1; j<=col; j++){
//                //for char asci code 64 its capital letters
//                //and if add 96 its small letters
//                System.out.print((char)(j+96)+" ");
//            }
//            System.out.println();
//        }
//        Enter Row Number :3
//        Enter Col Number :3
//        a b c
//        a b c
//        a b c

        //to print 11111,22222,333
//        for(int i=1; i<= row; i++){
//            for (int j=1; j<=col; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        Enter Row Number :4
//        Enter Col Number :4
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4



    }
}

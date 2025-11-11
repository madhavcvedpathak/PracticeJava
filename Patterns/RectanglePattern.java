package Patterns;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Number :");
        int row = sc.nextInt();
        System.out.print("Enter Col Number :");
        int col = sc.nextInt();

        //Hollow(nothing inside rect) Rectangle
        for(int i=1; i<= row; i++){
            for (int j=1; j<=col;j++){

                if(i==1 || i == row || j==1 || j==col){
                    System.out.print("* ");
                }else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
//Enter Row Number :6
//Enter Col Number :4
//        * * * *
//        *     *
//        *     *
//        *     *
//        *     *
//        * * * *
package Java100;

import java.util.Scanner;

public class NumberisEvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();

        //Using Brute Force
//        if (num % 2 == 0)
//            System.out.println(num + " is Even");
//        else
//            System.out.println(num + " is odd");


        //Using Ternary opt
//        String status = num % 2 == 0 ? " is Even" : " is Odd";
//        System.out.println(num + status);

    }
}

package Java100;

import java.util.Scanner;

public class NumberisPositiveorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
    int num = sc.nextInt();

    //Conditions to check if the number is negative or positive
        //Brute force Method
//    if (num > 0)
//            System.out.println ("The number is positive");
//    else if (num < 0)
//            System.out.println ("The number is negative");
//    else
//            System.out.println ("Zero");


        //Nested if-else method
//        if (num >= 0)
//        {
//            if (num == 0)
//                System.out.println ("Zero");
//            else
//                System.out.println ("The number is positive");
//        }
//        else
//            System.out.println ("The number is negative");


        //Ternary operator method
//        if (num == 0)
//        {
//            System.out.println ("Zero");
//        }
//        else{
//            String result = num > 0 ? "The number is positive" : "The number is negative";
//            System.out.println (result);
//        }


    }
}

package Java100;

import java.util.Scanner;

public class CheckLeapYearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year YYYY: ");
        int year = sc.nextInt();

        //Using if-else Statements 1
//        if (year % 400 == 0)
//            System.out.println (year + " is a Leap Year");
//        else if (year % 4 == 0 && year % 100 != 0)
//            System.out.println (year + " is a Leap Year");
//        else
//            System.out.println (year + " is not a Leap Year");


        //Using if-else Statements 2
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
//            System.out.println (year + " is a Leap Year");
//        else
//            System.out.println (year + " is not a Leap Year");


        //Using Ternary Operator
//        int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
//        if (flag ==1)
//        {
//            System.out.println (year + " is a Leap Year");
//        }
//        else
//        {
//            System.out.println (year + " is not a Leap Year");
//        }


        //Boolean Method
//        boolean leap;
//        if (year % 400 == 0)
//            leap = true;
//        else if (year % 4 == 0 && year % 100 != 0)
//            leap = true;
//        else
//            leap = false;
//        if (leap)
//            System.out.println(year + " is a leap year.");
//        else
//            System.out.println(year + " is not a leap year.");






    }
}

//Example
//Input : 2024
//Output: Leap Year
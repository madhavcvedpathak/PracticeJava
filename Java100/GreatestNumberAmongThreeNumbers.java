package Java100;

import java.util.Scanner;

public class GreatestNumberAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Num: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Num: ");
        int num3 = sc.nextInt();

        //Using if-else Statements 2
//        if (num1 >= num2 && num1 >= num3)
//            System.out.println (num1 + " is the greatest");
//        else if (num2 >= num1 && num2 >= num3)
//            System.out.println (num2 + " is the greatest");
//        else if (num3 >= num1 && num3 >= num2)
//            System.out.println (num3 + " is the greatest");


        //Using if-else Statements 2
//        if ((num1 >= num2) && (num1 >= num3))
//            System.out.println (num1 + " is the greatest");
//        else if (num2 >= num1 && num2 >= num3)
//            System.out.println (num2 + " is the greatest");
//        else
//            System.out.println (num3 + " is the greatest");


        //Using Ternary Operator
//        int temp, result;
//        temp = num1>num2 ? num1:num2;
//        result = temp>num3 ? temp:num3;
//        System.out.println (result + " is the greatest");




    }
}


//Example
//Input : num1 = 12 num2 = 9 num3 = 14
//Output : 14
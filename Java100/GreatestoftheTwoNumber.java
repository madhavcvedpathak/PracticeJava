package Java100;
import java.util.Scanner;

public class GreatestoftheTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Num: ");
        int num2 = sc.nextInt();

        //Using if-else Method
//        if (num1 == num2)
//            System.out.println("both are equal.");
//        else if (num1>num2)
//            System.out.println(num1 + " is greater.");
//        else
//            System.out.println(num2 + " is greater.");


        //Using Ternary Opt Method
//        int temp;
//        if (num1 == num2)
//            System.out.println("Both are Equal\n");
//        else {
//            temp = num1 > num2 ? num1 :num2;
//            System.out.println(temp + " is largest.");
//        }


        //Using In-buit Max Function Method
//        if (num1 == num2)
//            System.out.println("both are equal.");
//        else
//            System.out.println(Math.max(num1,num2) + " is greater.");

    }
}


//Example
//Input : num1 = 12 and num2 = 3
//Output : 12
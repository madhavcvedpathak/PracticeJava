package Java100;

import java.util.Scanner;

public class SumoftheNumbersinaGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Num: ");
        int a = sc.nextInt();
        System.out.print("Enter End Num: ");
        int b = sc.nextInt();
        int sum = 0;

        //Using Bruteforce
//        for (int i = a; i <= b; i++){
//            sum = sum + i;
//        }
//        System.out.println("The sum is: " + sum);


        //Using Formula, N * (N + 1)/2
//        int sum1 = b * (b + 1)/2 - a * (a + 1)/2 + a;
//        System.out.println("The sum is: " + sum1);


        //Using Recursion
//        int sum3 = getSum(0, a, b);
//        System.out.println("The sum is: " + sum3);
    }
    static int getSum (int sum3, int i, int b)
    {
        if (i > b)
            return sum3;
        return i + getSum (sum3, i + 1, b);
    }
}


//Example
//Input : Number1 = 12 , Number2 = 15
//Output : 54
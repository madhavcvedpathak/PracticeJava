package Java100;

import java.util.Scanner;

public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    //M1 - ITERATIVE METHOD
    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }


    //M2 - RECURSIVE METHOD
//    static int factorial(int n)
//    {
//        if (n == 0)
//            return 1;
//        return n * factorial(n - 1);
//    }
}

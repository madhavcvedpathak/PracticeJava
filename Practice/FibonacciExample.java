package Practice;

// Program: Recursive and Non-Recursive Fibonacci Series
// Author: Madhav Vedpathak

import java.util.Scanner;

public class FibonacciExample {

    // Recursive method
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive (Iterative) method
    static void fibonacciIterative(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b); // print first two numbers

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("\nFibonacci Series using Iteration:");
        fibonacciIterative(n);

        System.out.println("\n\nFibonacci Series using Recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
}

package Java100;

import java.util.Scanner;

public class FibonacciSeries {
//    int a = 0, b = 1, nextTerm;
//    public static void main (String[]args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//        fib (num);
//    }
//    static void fib (int n)
//    {
//        int f[] = new int[n + 1];
//        f[0] = 0;
//        f[1] = 1;
//        System.out.print (f[0] + " , " + f[1] + " , ");
//        for (int i = 2; i < n; i++)
//        {
//            f[i] = f[i - 1] + f[i - 2];
//            System.out.print (f[i] + " , ");
//        }
//    }



//    public static void main (String[]args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//        int a = 0, b = 1;
//        // Here we are printing 0th and 1st terms
//        System.out.print (a + " , " + b + " , ");
//        int nextTerm;
//        // printing the rest of the terms here
//        for (int i = 2; i < num; i++)
//        {
//            nextTerm = a + b;
//            a = b;
//            b = nextTerm;
//            System.out.print (nextTerm + " , ");
//        }
//    }


    public static void main (String[]args)
    {
        int num = 15;
        int a = 0, b = 1;
        System.out.print (a + " , " + b + " , "); // Here we are printing 0th and 1st terms
        int next;
        for (int i = 2; i < num; i++) // printing the rest of the terms here
        {
            next = a + b;
            a = b;
            b = next;
            System.out.print (next + " , ");
        }
    }
}

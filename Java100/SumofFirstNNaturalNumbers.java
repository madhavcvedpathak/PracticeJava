package Java100;

import java.util.Scanner;

public class SumofFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 'N': ");
        int num = sc.nextInt(); //N natural numbers.
        int sum = 0;

        //Using For loop
//        for (int i = 1; i <= num; i++)
//            sum += i;
//        System.out.println(sum);


        //Using Formula
//        System.out.println(num*(num+1)/2);

        //Using Recursion
//        int sum1 = getSum (num);
//        System.out.println (sum1);
    }

    static int getSum (int n)
    {
        if (n == 0)
            return n;
        return n + getSum (n - 1);
    }
}



//Example
//Input : num = 5
//Output : 15
//
//Where first 8 number is 1, 2, 3, 4, 5
//Sum of numbers = 1 + 2 + 3 + 4 + 5 = 15
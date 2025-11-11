package Java100;

import java.util.Scanner;

public class PerfectNumber {
    //Method 1: Using range until num -1 (for loop)
//    public static void main (String[]args)
//    {
//        int n = 28, sum = 0;
//        for (int i = 1; i < n; i++)
//        {
//            if (n % i == 0)
//                sum = sum + i;
//        }
//        if (sum == n)
//            System.out.println (n + " Is a perfect number");
//        else
//            System.out.println (n + " Is not a perfect number");
//    }


    //Method 2: Using range until num -1 (while loop)
//    public static void main (String[]args)
//    {
//        int num = 28, sum = 0, i = 1;
//        // iteratively check for all numbers if they are divisors
//        while(i < num)
//        {
//            // check if i is a divisor, if yes then add to sum
//            if(num % i == 0)
//                sum = sum + i;
//            i++;
//        }
//        if (sum == num)
//            System.out.println (num + " Is a perfect number");
//        else
//            System.out.println (num + " Is not a perfect number");
//    }


    //Method 3: In range until num/2
//    public static void main (String[]args)
//    {
//        int num = 28, sum = 0, i = 1;
//        while(i <= num/2)
//        {
//            // check if i is a divisor, if yes then add to sum
//            if(num % i == 0)
//                sum = sum + i;
//            i++;
//        }
//        if (sum == num)
//            System.out.println (num + " Is a perfect number");
//        else
//            System.out.println (num + " Is not a perfect number");
//    }



    static long sum = 0;
    static long isPerfect(long num, int i)
    {
        if(i <= num/2)
        {
            if(num % i ==0)
                sum = sum + i;
            i++;
            // recursively call isPerfect
            isPerfect(num, i);
        }
        return sum;
    }
    public static void main(String args[])
    { //Input = 28 OR 6
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        long num = sc.nextInt();
        if(isPerfect(num, 1) == num)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");
    }






}

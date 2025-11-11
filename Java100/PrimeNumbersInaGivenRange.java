package Java100;

import java.util.Scanner;

public class PrimeNumbersInaGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start & End Range to get Prime Nos. :");

        int lower = sc.nextInt(), upper = sc.nextInt();

        for (int i = lower; i <= upper; i++)
            if (isPrime(i))
                System.out.print(" " + i);
    }

//    static boolean isPrime (int n)  // Method 1: Using inner loop Range as [2, number-1]
//    {
//        int count = 0;
//        if (n < 2)
//            return false;
//        for (int i = 2; i < n; i++)
//        {
//            if (n % i == 0)
//                return false;
//        }
//        return true; //Prime
//    }


//    static boolean isPrime (int n) // Using inner loop Range as [2, number/2]
//    {
//        int count = 0;
//        if (n < 2)
//            return false;
//        for (int i = 2; i < n / 2; i++)
//        {
//            if (n % i == 0)
//                return false;
//        }
//        // if reached here then must be true
//        return true;
//    }


    static boolean isPrime (int n) // Method 3: Using inner loop Range as [2, sqrt(number)]
    {
        int count = 0;
        if (n < 2)
            return false;
        for (int i = 2; i < Math.sqrt (n); i++)
        {
            if (n % i == 0)
                return false;
        }
        // if reached here then must be true
        return true;
    }



}
//Example
//Input : 2 10
//Output : 2 3 5 7
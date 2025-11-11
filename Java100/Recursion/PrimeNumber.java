package Java100.Recursion;

public class PrimeNumber {
//    static boolean isPrime(int n, int i)
//    {
//        if (n <= 2)
//            return (n == 2) ? true : false;
//        if (n % i == 0)
//            return false;
//        if (i * i > n)
//            return true;
//        // Check for next divisor
//        return isPrime(n, i + 1);
//    }
//    public static void main(String[] args)
//    {
//        int n = 12;
//        if (isPrime(n, 2))
//            System.out.println("Yes it's a Prime");
//        else
//            System.out.println("Not a Prime");
//    }


    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        if (isPrime(7))
            System.out.println("true");
        else
            System.out.println("false");
    }





}

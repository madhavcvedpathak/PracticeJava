package Java100;
import java.util.Scanner;

public class PrimeorNot {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        checkPrime(num);
//    }
//        private static void checkPrime ( int n){
//            int count = 0;
//            if (n < 2) // 0, 1 not prime
//            {
//                System.out.println("The given is number " + n + " is not prime");
//                System.exit(0);
//            }
//            for (int i = 1; i <= n; i++) {
//                if (n % i == 0)
//                    count += 1;
//            }
//            if (count > 2)
//                System.out.println("The given is number " + n + " is not prime");
//            else
//                System.out.println("The given is number " + n + " is prime");
//        }


        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
//            int n = 13;
            boolean isprime = true;
            if (n < 2)
            {
                isprime = false;
            }
            else
            {
                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0)
                    {
                        isprime = false;
                        break;
                    }
                }
            }
            String result = isprime ? "Prime" : "not Prime";
            System.out.println ("The number " + n + " is : " + result);
        }
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        // This program is better than previous version as :
        // Condition for 0, 1 and negative numbers checked earlier
        // Loops runs b/w [2, n-1] rather than [1, n]
}

//Example
//Input : 23
//Output : Prime
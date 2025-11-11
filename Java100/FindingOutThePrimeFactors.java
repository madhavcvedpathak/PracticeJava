package Java100;
import java.util.Scanner;

public class FindingOutThePrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        primeFactors(n);
    }

    // Check if a number is prime (without using Math.sqrt)
    public static int isprime(int n) {
        if (n < 2) return 0;
        for (int i = 2; i * i <= n; i++) { // replace sqrt with i*i <= n
            if (n % i == 0)
                return 0;
        }
        return 1;
    }
    public static void primeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i) == 1) {
                int x = n;
                while (x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }

}


//Create a function say isprime(int n), that will return 1 if a number is prime, otherwise return 0.
//primeFactors(int n), will print the prime factors of the number.
//Run a loop from 2 to n,
//Check if it is prime, then
//Create a variable x to hold n,
//Run a while loop that will terminate when ( x is not divisible by i)
//Inside that loop print i and decrement as, x = x/2
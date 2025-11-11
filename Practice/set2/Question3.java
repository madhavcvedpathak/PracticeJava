package Practice.set2;
import java.util.Scanner;
// Square Free Numbers
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long N = sc.nextLong();   // Read the input number
        sc.close();

        // Given: N has no prime factors greater than 19
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        int distinct = 0;         // To count distinct prime factors of N
        for (int p : primes) {      // Check each prime if it divides N
            if (N % p == 0) {     // If prime divides N
                distinct++;       // Count this prime
                while (N % p == 0) N /= p;  // Remove all powers of this prime
            }
        }

        // Formula: (2^distinct) - 1 = number of square-free divisors (excluding 1)
        long result = (long) Math.pow(2, distinct) - 1;
        // Print the result
        System.out.println("Number of square-free divisors (excluding 1): " + result);
    }
}

//In the theory of numbers, square free numbers have a special place.
// A square free number is one that is not divisible by a perfect square (other than 1).
// Thus 72 is divisible by 36 (a perfect square), and is not a square free number,
// but 70 has factors 1, 2, 5, 7, 10, 14, 35 and 70.  As none of these are
// perfect squares (other than 1), 70 is a square free number.
//
//For some algorithms, it is important to find out the square free numbers
// that divide a number.  Note that 1 is not considered a square free number.
//
//In this problem, you are asked to write a program to find the number of
// square free numbers that divide a given number.
//
//Input
//
//The only line of the input is a single integer N which is divisible by
// no prime number larger than 19
//Output
//
//One line containing an integer that gives the number of square free
// numbers (not including 1)
//Constraints
//
//N   < 10^9
//Complexity
//
//Simple
//
//Time Limit
//
//1
//
//Example 1
//
//Input
//
//20
//
//Output
//
//3
//
//Explanation
//
//N=20
//
//If we list the numbers that divide 20, they are
//
//1, 2, 4, 5, 10, 20
//
//1 is not a square free number, 4 is a perfect square, and 20 is divisible by 4,
// a perfect square.
// 2 and 5, being prime, are square free, and 10 is divisible by 1,2,5
// and 10, none of which are perfect squares.
// Hence the square free numbers that divide 20 are 2, 5, 10.  Hence the result is 3.
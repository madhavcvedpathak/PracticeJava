package Practice.set2;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        int n, k, i, c = 0;  // declare variables
        Scanner sc = new Scanner(System.in);
        // take two integer inputs: n and k
        n = sc.nextInt();
        k = sc.nextInt();

        // loop from n down to 1
        for (i = n; i >= 1; i--) {
            // check if i is a divisor of n
            if ((n % i) == 0)
                c++;  // count the divisor
            // if the count reaches k, print the divisor and stop
            if (c == k) {
                System.out.println(i);
                break;
            }
        }

        // if there are fewer than k divisors, print 1
        if (c != k)
            System.out.println("1");
        return; // end of program
    }
}

//A positive integer d is said to be a factor of another positive integer
// N if when N is divided by d,
// the remainder obtained is zero.
// For example, for number 12, there are 6 factors 1, 2, 3, 4, 6, 12.
// Every positive integer k has at least two factors, 1 and the number k itself.
// Given two positive integers N and k, write a program
// to print the kth largest factor of N.
//
//Input Format: The input is a comma-separated list of positive integer pairs (N, k)
//
//Output Format: The kth highest factor of N. If N does not have k factors,
// the output should be 1.
//
//Constraints: 1<N<10000000000. 1<k<600.
// You can assume that N will have no prime factors which are larger than 13.
//
//Example 1
//
//Input: 12,3
//Output: 4
//Explanation: N is 12, k is 3. The factors of 12 are (1,2,3,4,6,12).
// The highest factor is 12 and the third largest factor is 4.
// The output must be 4
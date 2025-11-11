package Java100.Arrays;

public class longestPalindromeInAnArray {
    //We are given with an array and need to
    //print the longest palindromic element in the given input array.
    static boolean isPalindrome(int n)
    {
        int divisor = 1;
        while (n / divisor >= 10)
            divisor *= 10;

        while (n != 0) {
            int x = n / divisor;
            int y = n % 10;

            if (x != y)
                return false; // If first and last digits are not same then return false

            n = (n % divisor) / 10; // Removing the leading and trailing digits from the number

            // Reducing divisor by a factor
            // of 2 as 2 digits are dropped
            divisor = divisor / 100;
        }
        return true;
    }

    static int largestPalindrome(int []A, int n)
    {
        int res = -1;
        for (int i = 0; i < n; i++) { // If a palindrome larger than the currentMax is found
            if (A[i] > res && isPalindrome(A[i]))
                res = A[i];
        }
        return res; // Return the largest palindromic number from the array
    }

    public static void main(String []args)
    {
        int []A = { 121, 2322, 54545, 999990 };
        int n = A.length;
        System.out.println(largestPalindrome(A, n)); // print required answer
    }
}

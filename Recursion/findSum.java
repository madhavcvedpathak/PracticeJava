package Recursion;
public class findSum {
    public static int findSum(int n) {
        if (n == 1) return 1; // Recursive sum from 1 to n.

        return n + findSum(n - 1);
    }

    public static void main(String[] args) {
        int number = 10;
        int result = findSum(number);
        System.out.println("Sum of first " + number + " natural numbers is: " + result);
    }
}

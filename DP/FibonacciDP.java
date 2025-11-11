package DP;

public class FibonacciDP {
    public static int fibOptimized(int n) { // Method 2: Optimized DP (space efficient)
        if (n == 0) return 0;
        if (n == 1) return 1;
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int n = 10; // Change this value to test other cases
        System.out.println("Fibonacci using DP (optimized): " + fibOptimized(n));
    }
}

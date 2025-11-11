package Recursion;
public class NthFibonacciNumber {
    public int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev2 = 0;
        int prev1 = 1;
        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2; // F(i) = F(i-1) + F(i-2)
            prev2 = prev1;        // shift window forward
            prev1 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        NthFibonacciNumber sol = new NthFibonacciNumber();
        int[] tests = {0, 1, 5, 10, 30};
        for (int n : tests) {
            System.out.printf("F(%d) = %d%n", n, sol.nthFibonacci(n));
        }
    }
}

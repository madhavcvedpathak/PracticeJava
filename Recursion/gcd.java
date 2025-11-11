package Recursion;

public class gcd {
    static int gcd(int a, int b) {
        int result = Math.min(a, b);

        for (int i = result; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;                        // Found the GCD
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}

package Recursion;

public class lcm {
    static int gcd(int a, int b) {
        int result = Math.min(a, b);

        for (int i = result; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;                               // Found the GCD
            }
        }
        return 1;
    }

    // Function to compute LCM using GCD
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0; // LCM of 0 and any number is 0
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));

        // More test cases
        System.out.println("LCM of 5 and 10: " + lcm(5, 10));
        System.out.println("LCM of 7 and 3: " + lcm(7, 3));
        System.out.println("LCM of 0 and 8: " + lcm(0, 8));
    }
}

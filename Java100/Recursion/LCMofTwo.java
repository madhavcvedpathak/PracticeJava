package Java100.Recursion;

public class LCMofTwo {
//    static int gcd(int a, int b) {
//        if (a == 0) return b;
//        return gcd(b % a, a);
//    }
//    static int lcm(int a, int b) { // method to return LCM of two numbers
//        return (a / gcd(a, b)) * b;
//    }
//    public static void main(String[] args) {
//        int a = 15, b = 20;
//        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
//    }



    public static void main(String[] args) {
        int num1 = 144, num2 = 32;
        int hcf = getHCF(num1, num2);
        System.out.println("The HCF: " + hcf);

        int lcm = (num1 * num2) / hcf;
        System.out.println("The LCM: " + lcm);
    }
    static int getHCF(int a, int b) {
        return b == 0 ? a : getHCF(b, a % b);
    }

}
//OP: LCM of 15 and 20 is 60
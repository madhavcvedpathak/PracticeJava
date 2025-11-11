package Recursion;
import java.util.Scanner;

public class LookandSayPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (positive integer): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("n must be positive.");
            return;
        }
        System.out.println("Term " + n + " of the Count-and-Say sequence:");
        System.out.println(countAndSay(n));
    }

    /** Recursive Count-and-Say generator. */
    private static String countAndSay(int n) {
        if (n == 1) return "1";

        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();

        int i = 0;                                // start of current run
        while (i < prev.length()) {
            int j = i;                            // advance j to end of run
            while (j < prev.length() && prev.charAt(j) == prev.charAt(i)) {
                j++;
            }
            sb.append(j - i)                      // run length
                        .append(prev.charAt(i));            // run digit
            i = j;                                // begin next run
        }
        return sb.toString();
    }
}

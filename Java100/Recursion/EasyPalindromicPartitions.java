package Java100.Recursion;
import java.util.Scanner;

public class EasyPalindromicPartitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Palindromic partitions:");
        printPartitions(s, "", 0);
    }
    // Recursive function to print all palindromic partitions
    static void printPartitions(String s, String path, int start) {
        if (start == s.length()) {
            System.out.println(path.trim());
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String part = s.substring(start, end);
            if (isPalindrome(part)) {
                printPartitions(s, path + part + " ", end);
            }
        }
    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }

}

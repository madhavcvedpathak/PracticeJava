package Loops;

public class isPalindromeNumber {
    // Palindrome check method
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = Integer.toString(x);
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // Main method to run the code
    public static void main(String[] args) {
        int test1 = 121;
        int test2 = -121;
        int test3 = 12321;
        int test4 = 10;

        System.out.println("Is " + test1 + " a palindrome? " + isPalindrome(test1)); // true
        System.out.println("Is " + test2 + " a palindrome? " + isPalindrome(test2)); // false
        System.out.println("Is " + test3 + " a palindrome? " + isPalindrome(test3)); // true
        System.out.println("Is " + test4 + " a palindrome? " + isPalindrome(test4)); // false
    }
}

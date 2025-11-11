package Java100;

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        System.out.println(isPalindrome("radar".toLowerCase()));

        System.out.println(isPalindrome("Naman".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("12345".toLowerCase()));
    }
    private static boolean isPalindrome(String original) {
        String reversed = "";
        int len = original.length();
        for (int i = len - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        return original.equals(reversed);
    }
//    private static boolean isPalindrome(String original) {
//        char[] data = original.toCharArray();
//        int i = 0;
//        int j = data.length - 1;
//        while (j > i) {
//            if (data[i] != data[j]) {
//                return false;
//            }
//            ++i;
//            --j;
//        }
//        return true;
//    }
}
//Example
//Input : 121
//Output : Palindrome
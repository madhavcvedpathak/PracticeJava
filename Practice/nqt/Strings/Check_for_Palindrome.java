package Practice.nqt.Strings;
public class Check_for_Palindrome {

    public static void main(String[] args) {
        String s = "abba";  // you can change this string
        boolean result = isPalindrome(s);
        System.out.println("Is palindrome? " + result);
    }
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // not palindrome
            }
            left++;
            right--;
        }
        return true;        // all characters matched
    }
}

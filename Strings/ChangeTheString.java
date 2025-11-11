package Strings;

public class ChangeTheString {
    public static void main(String[] args) {
        String s = "Priya";
        String result = modify(s);
        System.out.println(result); // Output: PRIYA
    }
    static String modify(String s) {
        if (Character.isUpperCase(s.charAt(0))) {
            return s.toUpperCase();
        } else {
            return s.toLowerCase();
        }
    }
}

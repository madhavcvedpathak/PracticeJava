package Java100;

public class BalancedParentheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("All combinations of balanced parentheses for N = " + n + ":");
        generateParentheses(n, 0, 0, "");
    }
    static void generateParentheses(int n, int open, int close, String result) {
        if (open == n && close == n) {
            System.out.println(result);
            return;
        }
        if (open < n) {
            generateParentheses(n, open + 1, close, result + "(");
        }
        if (close < open) {
            generateParentheses(n, open, close + 1, result + ")");
        }
    }
}

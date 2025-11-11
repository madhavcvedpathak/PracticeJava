package Practice.nqt;
import java.util.Stack;

public class ReverseWordsInString {
    static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {

            // If not a dot,
            // build the current word
            if (s.charAt(i) != '.') {
                word.append(s.charAt(i));
            }

            // If we see a dot,
            // push the word into the stack
            else if (word.length() > 0) {
                stack.push(word.toString());
                word.setLength(0);
            }
        }

        // Last word remaining,
        // push it to stack
        if (word.length() > 0) {
            stack.push(word.toString());
        }

        // Rebuild the string
        // from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(".");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "..geeks..for.geeks.";
        System.out.println(reverseWords(s));
    }
}

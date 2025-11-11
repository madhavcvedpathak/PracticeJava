package Strings;
import java.util.Arrays;

public class GetMaxOccuringChar { //sliding window i , j same point
    public static char getMaxOccuringChar(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Sort characters to group same ones together

        int maxFreq = 1;
        char result = chars[0];

        int i = 0;
        for (int j = 1; j <= chars.length; j++) {
            if (j == chars.length || chars[j] != chars[i]) {
                int freq = j - i;
                if (freq > maxFreq) {
                    maxFreq = freq;
                    result = chars[i];
                }
                i = j; // Move to next group
            }
        }
        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input1 = "testsample";
        String input2 = "output";

        System.out.println("Max occurring character in \"" + input1 + "\": " + getMaxOccuringChar(input1));
        System.out.println("Max occurring character in \"" + input2 + "\": " + getMaxOccuringChar(input2));
    }
}

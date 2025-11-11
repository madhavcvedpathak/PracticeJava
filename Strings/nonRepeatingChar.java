package Strings;
import java.util.Scanner;

public class nonRepeatingChar {
        static char nonRepeatingChar(String s) {
            int[] freq = new int[26]; // Frequency array for 'a' to 'z'

            // First pass: count frequencies
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            // Second pass: find the first non-repeating character
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] == 1) {
                    return s.charAt(i);
                }
            }
            return '$'; // No non-repeating character found
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take user input
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Call the method
            char result = nonRepeatingChar(input);

            // Print result
            if (result == '$') {
                System.out.println(-1); // As per problem, return -1 for no non-repeating char
            } else {
                System.out.println("First non-repeating character: " + result);
            }

            scanner.close();
        }
}

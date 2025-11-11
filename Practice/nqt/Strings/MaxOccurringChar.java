package Practice.nqt.Strings;
public class MaxOccurringChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] freq = new int[256]; // Array to store frequency of each character

        for (int i = 0; i < str.length(); i++) { // Count frequency of each character
            freq[str.charAt(i)]++;
        }
        // Find the character with maximum frequency
        int max = -1;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (max < freq[str.charAt(i)]) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println("Maximum occurring character is: " + result);
    }
}

package Strings;

public class NumberOfVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        // Convert to lowercase to handle both upper/lower case
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}

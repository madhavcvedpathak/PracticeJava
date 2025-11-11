package Practice.nqt.Strings;

public class printFrequencie {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printFrequencies(s);
    }

    static void printFrequencies(String s) {
        int[] freq = new int[26]; // frequency array for a-z
        for (int i = 0; i < s.length(); i++) { // count frequency of each character
            freq [s.charAt(i) - 'a']++;
        }

        // print characters in order of occurrence (only first time)
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (freq[ch - 'a'] > 0) {
                System.out.print(ch + "" + freq[ch - 'a'] + " ");
                freq[ch - 'a'] = 0; // mark printed
            }
        }
    }

}

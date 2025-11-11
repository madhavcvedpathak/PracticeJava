package Practice.nqt.Strings;

public class SmallestAndLargestWord {
    public static void main(String[] args) {
        String str = "This is a test string";

        String[] words = str.split(" "); // Split the string into words.
        String smallest = words[0];
        String largest = words[0];

        for (String word : words) {
            // Loop through words to find smallest and largest.
            if (word.length() < smallest.length()) {
                smallest = word; //if curr word less than smallest then its new smallest.
            }
            if (word.length() > largest.length()) {
                largest = word; //if curr word greater than largest then its new largest.
            }
        }
        System.out.println("Minimum length word: " + smallest);
        System.out.println("Maximum length word: " + largest);
    }
}

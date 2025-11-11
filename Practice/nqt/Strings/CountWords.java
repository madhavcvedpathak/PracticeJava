package Practice.nqt.Strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "Geeks for Geeks\nis\t a   computer science portal";

        // Remove leading/trailing spaces and split by space, tab, or newline
        String[] words = str.trim().split("\\s+");

        int count = words.length; // Count number of words

        System.out.println("Number of words: " + count);
    }
}

package Practice.nqt.Strings;
import java.util.Arrays;

public class twoStringsAreAnagrams {
    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false; //if both not equal no use.

        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array); // Compare sorted strings
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        if(areAnagrams(s1, s2) == true){
            System.out.println("Anagram: true");
        }
        else{
            System.out.println("Anagram: false");
        }
    }
}

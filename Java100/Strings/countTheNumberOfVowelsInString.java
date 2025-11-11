package Java100.Strings;
import java.util.Scanner;

public class countTheNumberOfVowelsInString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String str = sc.nextLine();
//
//        int vowel = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = Character.toLowerCase(str.charAt(i));// convert to lowercase
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                vowel++;
//            }
//        }
//        System.out.println("There are " + vowel + " number of vowels in the String.");
//    }



    static int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }
    static int countVowels(String str, int n) {
        if (n == 1) return isVowel(str.charAt(n - 1));
        return countVowels(str, n - 1) + isVowel(str.charAt(n - 1));
    }
    public static void main(String args[]) { // Main Calling Function
        String str = "prepinsta";
        System.out.print("Total number of Vowel = ");
        System.out.println(countVowels(str, str.length()));
    }
}
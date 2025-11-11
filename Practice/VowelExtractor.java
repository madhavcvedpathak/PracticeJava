package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class VowelExtractor {
    public static  boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Character> vowels = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (isVowel(ch)){
                vowels.add(ch);
            }
        }
        System.out.println("Vowels in string : " + vowels);
    }
}

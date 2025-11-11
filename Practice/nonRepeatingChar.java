package Practice;
import java.util.Scanner;

public class nonRepeatingChar {
    static char nonRepeating(String s){
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++){
            if (freq[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }
        }
        return '$';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();

        char res = nonRepeating(input);

        if (res == '$'){
            System.out.println(-1);
        } else {
            System.out.println("First non-repeating character: " + res);
        }
        sc.close();
    }
}

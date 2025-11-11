package Practice;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i ++){
            char ch = str.charAt(i);
            if (ch != ' ')
                freq[ch]++;
        }

        System.out.println("Char Freq : ");
        for (int i = 0; i < freq.length; i ++){
            if (freq[i] > 0)
                System.out.println((char) i + " = " + freq[i]);
        }
    }
}
//
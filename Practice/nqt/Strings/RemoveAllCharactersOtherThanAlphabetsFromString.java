package Practice.nqt.Strings;

public class RemoveAllCharactersOtherThanAlphabetsFromString {
    static void removeSpecialCharacter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = "$Gee*k;s..fo, r'Ge^eks?";
        removeSpecialCharacter(s);
    }
}

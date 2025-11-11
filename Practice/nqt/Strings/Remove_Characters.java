package Practice.nqt.Strings;

public class Remove_Characters {
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        String result = removeChars(string1, string2);
        System.out.println(result);
    }

    static String removeChars(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);

            if (string2.indexOf(ch) == -1) { // if current char not in string2, keep it
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

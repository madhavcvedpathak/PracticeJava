package Practice.nqt.Strings;

public class CapitalizeTheFirstAndLastCharacter {
    public static void main(String[] args) {
        String str = "geeks for geeks";
        System.out.println(capitalizeFirstAndLast(str));
    }

    static String capitalizeFirstAndLast(String str) {
        char[] ch = str.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            // capitalize first letter of a word
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z')
                    ch[i] = (char)(ch[i] - 'a' + 'A');
            }

            // capitalize last letter of a word
            if (i == n - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z')
                    ch[i] = (char)(ch[i] - 'a' + 'A');
            }
        }
        return new String(ch);
    }
}

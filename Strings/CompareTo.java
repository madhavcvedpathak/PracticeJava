package Strings;

public class CompareTo {
    public static int compareTo(String a, String b){
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(j);

            if (ch1 != ch2) {
                return ch1 - ch2; // return difference in ASCII values
            }
            i++;
            j++;
        }
        // If all characters matched, but lengths are different
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        String a = "harmeet";
        String b = "harsh";
        String s = a + b;
        System.out.println(s);
        System.out.println(a.compareTo(b));
        System.out.println(compareTo(a, b));

        //m n o p q r s
    }
}

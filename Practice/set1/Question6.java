package Practice.set1;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(minOperations("abcab", "aabab")); // 2
        System.out.println(minOperations("abab", "abaa"));   // 1
        System.out.println(minOperations("de", "cd"));       // -1
    }

    private static int minOperations(String A, String B) {
        int n = A.length(), moves = 0;
        char[] a = A.toCharArray();

        // If A has smaller letter than B at any point → impossible
        for (int i = 0; i < n; i++)
            if (a[i] < B.charAt(i)) return -1;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            char min = '{'; // just after 'z'
            boolean needed = false;

            // find smallest letter among mismatched positions needing ch
            for (int i = 0; i < n; i++)
                if (a[i] != B.charAt(i) && B.charAt(i) == ch) {
                    min = (char) Math.min(min, a[i]);
                    needed = true;
                }

            if (needed && min > ch) {
                moves++;
                for (int i = 0; i < n; i++)
                    if (a[i] >= ch && B.charAt(i) == ch)
                        a[i] = ch;
            }
        }
        return moves;
    }
}

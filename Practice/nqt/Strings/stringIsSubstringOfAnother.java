package Practice.nqt.Strings;

public class stringIsSubstringOfAnother {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";
        System.out.print(findSubstringg(txt, pat));
    }

    static int findSubstringg(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i < n - m; i++){
            int j;
            for (j = 0; j < m; j++) {

                if (txt.charAt(i + j) != pat.charAt(j)) { // Mismatch found
                    break;
                }
            }
            if (j == m) { // If we completed the inner loop, we found a match
                // Return starting index
                System.out.print(" Min Index of first occurrence substring idx...");
                return i;
            }
        }
        return -1;
    }
}

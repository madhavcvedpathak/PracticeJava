package Practice.nqt.Strings;

public class RemoveDuplicatesFromtring {
    public static String removeDuplicate(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        boolean[] seen = new boolean[256];

        for (int i = 0; i < s.length(); i++) { // Traverse through all characters
            char c = s.charAt(i);

            if (!seen[c]) { // Check if s[i] is present before it
                // if seen before - skip. if not seen do following thing.
                // add to sb and mark in seen bool array.
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(removeDuplicate(s));
    }
}

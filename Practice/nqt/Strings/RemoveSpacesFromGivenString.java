package Practice.nqt.Strings;

public class RemoveSpacesFromGivenString {
    static int removeSpaces(char []str)
    {
        int count = 0; // To keep track of non-space character count.

        for (int i = 0; i < str.length; i++)
            if (str[i] != ' ')
                str[count++] = str[i]; // here count is incremented.
        return count;
    }

    public static void main(String[] args)
    {
        char str[] = "g eeks for ge eeks ".toCharArray();
        int i = removeSpaces(str);
        System.out.println(String.valueOf(str).subSequence(0, i));
    }
}

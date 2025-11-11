package Practice.nqt.Strings;

public class ToggletheCaseOfEachCharacter {
    public static String toggleChar(String str) {
        int ln = str.length();
        char[] arr = str.toCharArray(); // Conversion according to ASCII values

        for (int i = 0; i < ln; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z')
                arr[i] = (char)(arr[i] - 32); // Convert lowercase to uppercase

            else if (arr[i] >= 'A' && arr[i] <= 'Z')
                arr[i] = (char)(arr[i] + 32); // Convert uppercase to lowercase
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "GeEkSfOrGeEkS";
        str = toggleChar(str);
        System.out.println(str);
    }
}

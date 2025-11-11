package Practice;
public class findConsoVowDigSpecChar {
    public static void main(String[] args) {
        String str = "geeks for geeks121";
        countCharacterType(str);
    }
    static void countCharacterType(String str) {
        int vowel = 0, consonant = 0, specialChar = 0, digit = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                ch =  Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowel++;
                else
                    consonant++;
            } else if (ch > '0' && ch <= '9') {
                digit++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + consonant);
        System.out.println("Digits : " + digit);
        System.out.println("Special Character : " + specialChar);
    }
}

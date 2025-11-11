package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome...");
        } else {
            System.out.println("Not a Palindrome...");
        }


        //Alternative method.
//        int i = 0, j = s.length()-1;
//        while(i<=j){
//            if(s.charAt(i)!=s.charAt(j)) return false;
//            i++;
//            j--;
//        }
//        return true;
    }
}

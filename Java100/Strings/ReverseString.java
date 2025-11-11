package Java100.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    //Method 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String original = sc.nextLine();
//        StringBuilder sb = new StringBuilder(original);
//        String reversed = sb.reverse().toString();
//        System.out.println("Reversed String: " + reversed);
//    }


    //Method 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String original = sc.nextLine();
//        String reversed = "";
//        for (int i = original.length() - 1; i >= 0; i--) {
//            reversed = reversed + original.charAt(i);
//        }
//        System.out.println("Reversed String: " + reversed);
//    }



    //Method 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String original = sc.nextLine();
//        char[] characters = original.toCharArray();
//
//        System.out.print("Reversed String: ");
//        for (int i = characters.length - 1; i >= 0; i--) {
//            System.out.print(characters[i]);
//        }
//    }


    //Method 4
//    public static String reverse(String str) {
//        if (str.isEmpty()) {
//            return str;
//        }
//        return reverse(str.substring(1)) + str.charAt(0);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String original = sc.nextLine();
//        String reversed = reverse(original);
//        System.out.println("Reversed String: " + reversed);
//    }


    //Method 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String original = sc.nextLine();
//        List charList = new ArrayList<>();
//        for (char c : original.toCharArray()) {
//            charList.add(c);
//        }
//        Collections.reverse(charList);
//        System.out.print("Reversed String: ");
//        for (Object c : charList) {
//            System.out.print(c);
//        }
//    }

}

package Java100.Strings;
import java.util.Scanner;

public class characterIsAnAlphabetOrNot {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter one character : ");
//        char ch = sc.next().charAt(0);
//
//        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
//            System.out.println("The inserted character " + ch + " IS an Alphabet");
//        else
//            System.out.println("The inserted character " + ch + " is NOT an Alphabet");
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
            System.out.println("The inserted character " + ch + " is an Alphabet");
        else
            System.out.println("The inserted character " + ch + " is not an Alphabet");
    }
}

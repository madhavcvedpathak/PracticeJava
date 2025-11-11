package Practice;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        //METHOD : 1
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev += str.charAt(i);
//        }

        //METHOD : 2
//        String rev = new StringBuilder(str).reverse().toString();

//        System.out.println("Reversed string: " + rev);
    }
}

package Java100.Strings;
import java.util.Scanner;

public class ASCIIvalueOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character (A-Z)(a-z): ");
        char c = sc.next().charAt(0);
        int i = c; //typecast char to int

        System.out.println("The ASCII value of " + c + " is " + i);
    }
}

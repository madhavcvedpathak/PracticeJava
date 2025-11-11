package Java100.Strings;
import java.util.Scanner;

public class FindLengthOfTheStringWithoutUsingLengthFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some string : ");
        String s = sc.nextLine();  // ✅ read user input
        int length = 0;

        for (char c1 : s.toCharArray()) {
            length++;
        }

        System.out.println("Length of string is : " + length);
        sc.close();  // ✅ good practice to close Scanner
    }
}

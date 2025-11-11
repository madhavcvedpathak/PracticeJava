package Practice;
import java.util.Scanner;

public class print01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 0 or 1: ");
        int input = scanner.nextInt();

        // Method 1: Using an if-else statement
        if (input == 1) {
            System.out.println(0);
        } else if (input == 0) {
            System.out.println(1);
        } else {
            System.out.println("Invalid input. Please enter 0 or 1.");
        }
    }
}

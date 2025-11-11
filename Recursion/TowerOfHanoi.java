package Recursion;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Ask user for number of disks between 1 and 8
        while (true) {
            System.out.print("Enter number of disks (1 to 8): ");
            n = scanner.nextInt();
            if (n >= 1 && n <= 8) break;
            System.out.println("Invalid input. Please enter a number between 1 and 8.");
        }

        // Solve Tower of Hanoi
        towerOfHanoi(n, 'A', 'C', 'B');
        scanner.close();
    }

    // Recursive function with clean output: A -> C
    private static void towerOfHanoi(int n, char src, char dest, char helper) {
        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, helper, dest);
        System.out.println(src + " -> " + dest);
        towerOfHanoi(n - 1, helper, dest, src);
    }
}

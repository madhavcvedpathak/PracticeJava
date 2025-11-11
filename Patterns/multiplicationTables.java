package Patterns;
import java.util.Scanner;

public class multiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask the user for a number
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        sc.close();
    }
}
//Enter a number : 6
//        6 x 1 = 6
//        6 x 2 = 12
//        6 x 3 = 18
//        6 x 4 = 24
//        6 x 5 = 30
//        6 x 6 = 36
//        6 x 7 = 42
//        6 x 8 = 48
//        6 x 9 = 54
//        6 x 10 = 60

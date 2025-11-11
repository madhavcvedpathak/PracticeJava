package Patterns.triangles;
import java.util.Scanner;

public class alphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (n): ");
        int n = scanner.nextInt();

        for(int i=1; i<= n; i++) { //rows
            for (int j = 1; j <= n - i; j++) { //columns
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { //columns
                char letter = (char) ('A' + j);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
//Enter number (n): 4
//      B
//    B C
//  B C D
//B C D E
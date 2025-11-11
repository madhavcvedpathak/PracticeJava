package Patterns.triangles;
import java.util.Scanner;

public class numTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (n): ");
        int n = scanner.nextInt();

        for(int i=1; i<= n; i++){ //rows
            for (int j=1; j<=n-i; j++){ //columns
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){ //columns
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

//Enter number (n): 4
//              1
//            1 2
//          1 2 3
//        1 2 3 4
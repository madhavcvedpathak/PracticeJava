package Patterns.pyramid;

import java.util.Scanner;

public class diamondStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (n): ");
        int n = scanner.nextInt();

        //nsp is left spaces & nst right spaces
        int nsp = n-1, nst =1;
        for (int i = 1; i <= n; i++) { //rows
            for (int j = 1; j <= nsp; j++) { //columns
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) { //stars
                System.out.print("*" + " ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        nsp =1; nst = 2*n-3;
        for (int i = 1; i <= n-1; i++) { //rows
            for (int j = 1; j <= nsp; j++) { //columns
                System.out.print("  "); //spaces
            }
            for (int j = 1; j <= nst; j++) { //stars
                System.out.print("*" + " ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }



    }
}

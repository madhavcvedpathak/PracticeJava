package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
//        System.out.println(Math.max(Math.max(a,b),c));
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println(max);
    }
}

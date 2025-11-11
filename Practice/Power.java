package Practice;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int num = sc.nextInt();
        System.out.print("Enter pow: ");
        int pow = sc.nextInt();
        System.out.println("Answer: "+givePow(num, pow));
    }
    public static long givePow(int x, int p){
        Long pow = 1L;
        for (int i = 0; i < p; i++){
            pow = pow * x;
        }
        return pow;
    }
}

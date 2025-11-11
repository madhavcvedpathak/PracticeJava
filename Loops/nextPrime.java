package Loops;
import java.util.Scanner;

public class nextPrime {
    public static int nextPrime(int x){
        x++;
        while (true){
            int i;
            for (i = 2; i < x; i++){
                if (x % i == 0) break;
            }
            if (i == x) return x;
            x++;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number:. ");
        int n = s.nextInt();
        System.out.println(nextPrime(n));
    }
}

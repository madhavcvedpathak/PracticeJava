package Practice;
import java.util.Scanner;

public class printDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N to print its Divisors: ");
        int num = sc.nextInt();
        System.out.println("Divisors of "+ num + " are: ");
        printDivisors(num);
    }
    static void printDivisors(int n){
        for (int i = 1; i < n; i++){
            if (n % i == 0)
                System.out.print(" "+i);
        }
        System.out.println();
    }
}

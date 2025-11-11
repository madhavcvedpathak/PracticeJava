import java.util.Scanner;

public class lastDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n % 10);
        System.out.println(lastDigit);
    }
}

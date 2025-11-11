import java.util.Scanner;

public class nthGeoProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number :");
        int a = sc.nextInt();

        System.out.print("Enter Common ratio :");
        int r = sc.nextInt();

        System.out.print("Enter nth term to find :");
        int n = sc.nextInt();

        int term = a * (int)(Math.pow(r,n-1));
        System.out.println(n + "th term of the series is:" + term);
    }
}

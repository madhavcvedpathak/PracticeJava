import java.util.Scanner;

public class ternaryinVariabl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        //will print 100 for positive and 0 for negative.
        int check = (n>=0) ? 100 : 0;
        System.out.println(check);
    }
}

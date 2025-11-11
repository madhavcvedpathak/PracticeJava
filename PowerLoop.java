import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        //Find Power
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int pow = 1;
        for (int i=1; i<=b; i++){
            pow *= a;
        }
        System.out.println(pow);
    }
}

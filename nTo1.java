import java.util.Scanner;

public class nTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        //for loop no n chi vale kami karaichi till i >= 1
//        for (int i = n; i >= 1; i--){
//            System.out.println(i);
//        }

        while (n>=1){
            System.out.println(n);
            n--;
        }
    }
}

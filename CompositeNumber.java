import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        int x=0; //0 is prime

//        for (int i = 2; i <= n; i++){
//            //'i' to 'n' ka ek factor nikala
//            if (n%i==0) System.out.println(n + " is Composite Number"); break;
//        }

        for(int i = 2; i<=n-1; i++){
            if (n%1==0){
                x = 1;
                break;
            }
        }
        if(x==1) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}

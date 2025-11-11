import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        //4, 10, 16, 22...
        for (int i=4; i<= 3*n-1; i+=6){
            System.out.println(i+" ");
        }
    }
}

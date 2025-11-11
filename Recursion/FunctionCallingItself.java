package Recursion;
import java.util.Scanner;

public class FunctionCallingItself {

//    public static void main(String[] args) {
//        ajay(1);
//    }
//    public static  void ajay(int n){
//        if (n==10) return;
//        System.out.println("Priya");
//        ajay(n+1);
//    }

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    public static void main(String[] args) {
        print(5);
    }
    public static  void print(int n){
        if (n==0) return;
        System.out.println(n);
        print(n-1);
    }
}

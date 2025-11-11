package Recursion;

import java.util.Scanner;

public class OneToN {

    static int n; // Global var

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        //print(1,n);
//        print(1);
//    }
//
//    public static void print(int x) {
//        if (x > n) return;
//        System.out.println(x + " ");
//        print(x + 1);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        print(c);
    }
    public static void print(int n) {
        if (n == 0) return;
        System.out.println(n + " ");
        print(n - 1);
//        System.out.println(n+ " ");
        //if (n != 1) System.out.print(n + " ");
    }









}
//    public static  void print(int x,int n){
//        if (x>n) return;
//        System.out.println(x);
//        print(x+1,n);
//    }

//5
//        1
//        2
//        3
//        4
//        5
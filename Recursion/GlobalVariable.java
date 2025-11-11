package Recursion;

public class GlobalVariable {
    static  int x = 10; //Global var
    public static void main(String[] args) {
        //int x = 10;  //local var
        fun();
        System.out.println(x);
    }

    public static void fun() {
        //System.out.println(x); // any method can change or acces the var
        x = 20;
    }
}

package Practice;

import java.util.Scanner;

public class ReverseTheNumber {
//    public static void main(String[] args) { //Integers
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = 0;
//        while (n!=0){
//            r *= 10;
//            r += (n%10);
//            n /= 10;
//        }
//        System.out.println(r);
//    }


    public static void main(String[] args) { //Strings
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        System.out.print("Reversed : " + reversed);
    }
}

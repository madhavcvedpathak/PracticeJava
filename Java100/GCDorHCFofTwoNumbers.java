package Java100;

import java.util.Scanner;

public class GCDorHCFofTwoNumbers {
//    public static void main(String[] args) {
//        int num1 = 36, num2 = 60, hcf=0;
//
//        for (int i = 1; i <= num1 || i <= num2; i++)
//        {
//            if (num1 % i == 0 && num2 % i == 0)
//                hcf = i;
//        }
//        System.out.println("The HCF: "+ hcf);
//    }
//    public static void main(String[] args) {
//        int num1 = 36, num2 = 60, hcf = 0;
//        for (int i = 1; i <= num1 || i <= num2; i++){
//            if (num1 % i == 0 && num2 % i == 0)
//                hcf = i;
//        }
//        System.out.println("The HCF: " + hcf);
//    }

//    public static void main(String[] args) {
//        int num1 = 36, num2 = 60, hcf = 0;
//        for (int i = 1; i <= num1 || i <=  num2; i++){
//            if (num1 % i == 0 && num2 % i == 0)
//                hcf = i;
//        }
//        System.out.println("The HCF:" + hcf);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int b = sc.nextInt();
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++){
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("The HCF :" + hcf);
    }


}

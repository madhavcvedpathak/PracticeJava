package Java100;

public class LCMofTwoNumbers {
//    public static void main(String[] args) {
//        int num1 = 36, num2 = 60, lcm = 0;
//        // finding the larger number here
//        int max = (num1 > num2) ? num1 : num2;
//        // LCM will atleast be >= max(num1, num2)
//        // Largest possibility of LCM will be num1*num2
//        for (int i = max; i <= num1 * num2; i++)
//        {
//            if (i % num1 == 0 && i % num2 == 0)
//            {
//                lcm = i;
//                break;
//            }
//        }
//        System.out.println ("The LCM: " + lcm);
//    }


//    public static void main (String[]args)
//    {
//        int num1 = 16, num2 = 24, hcf = 1;
//        // calculating HCF here
//        for (int i = 1; i <= num1 || i <= num2; i++)
//        {
//            if (num1 % i == 0 && num2 % i == 0)
//                hcf = i;
//        }
//        // LCM formula
//        int lcm = (num1 * num2) / hcf;
//        System.out.println ("The LCM: " + lcm);
//    }

    public static void main(String[] args) {
        int num1 = 16, num2 = 24, hcf = 1;
        for (int i = 1; i<=num1 || i<=num2; i++){
            if (num1 % i == 0 && num2 % i ==0)
                hcf = i;
        }
        int lcm = ( num1 * num2) / hcf;
        System.out.println("The LCM:" + lcm);
    }




}

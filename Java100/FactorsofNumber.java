package Java100;

import java.util.Scanner;

public class FactorsofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Method 1: Using Range as [ 1, number ]

        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        System.out.print( "Factors of " + num + " are " );
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.print(i + " ");
        }
    }


    //Method 2: Using Range as [ 1, number/2 ]
//    static void getFactors (int num)
//    {
//        for (int i = 1; i <= (num/2); i++)
//        {
//            if (num % i == 0)
//            {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.print(num);
//    }



// Time Complexity : O(n)
// Auxiliary Space : O(1)
}

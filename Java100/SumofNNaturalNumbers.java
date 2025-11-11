package Java100;

import java.util.Scanner;

public class SumofNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 'N': ");
        int num = sc.nextInt(); //N natural numbers.
        int sum = 0;

        //For loop
//        for (int i = 1; i <= num; i++){
//            sum += i;
//        }
//        System.out.println(sum);


        //Using Formula
//        System.out.println(num*(num+1)/2);


        //Using Recursion
//        int sum1 = getSum(num);
//        System.out.println(sum);
    }

        static int getSum (int num)
        {
            if (num == 0)
                return num;
            return num + getSum (num - 1);
        }
}


//Example
//Input : 6
//Output : 21
//Explanation : 0 + 1 + 2 + 3 + 4 + 5 + 6 = 21.
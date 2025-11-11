package Java100;

import java.util.Scanner;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), reverse = 0, rem;

//        while (num != 0) // while loop
//        {
//            rem = num % 10;
//            reverse = reverse * 10 + rem;
//            num /= 10;
//        };
//        System.out.println ("Reversed Number: " + reverse);

        getReverse (num); //Recursion
    }
    static void getReverse (int num)
    {
        if (num == 0)
            return;
        int rem = num % 10;
        System.out.print (rem);
        getReverse (num / 10);
    }
}

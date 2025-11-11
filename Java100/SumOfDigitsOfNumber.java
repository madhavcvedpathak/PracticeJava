package Java100;
import java.util.Scanner;

public class SumOfDigitsOfNumber {
public static void main(String[] args) {;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Ns: ");
        int num = sc.nextInt(), sum = 0;

        while(num!=0){ // M1: Brute Force Method
            sum += num % 10; // Extract Digits from number
            num = num / 10; //Shorten the number by 1 digit
        }
        System.out.println ("Sum of digits : " + sum);

    }

    static int getSum (int num, int sum) // M2: Recursion I
    {
        if (num == 0)
            return sum;
        sum += num % 10;
        return getSum (num / 10, sum);
    }

    static int getSum (int num) // M2: Recursion II
    {
        if (num == 0)
            return 0;
        return (num % 10) + getSum (num / 10);
    }
}
//Example
//Input : 1234
//Output : 1 + 2 + 3 + 4 = 10
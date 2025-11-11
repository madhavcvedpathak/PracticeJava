package Java100;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary = sc.nextInt();
        //Declaring variable to store decimal number
        int decimal = 0;
        //Declaring variable to use in power
        int n = 0;
        //writing logic for the conversion
        while(binary > 0)
        {
            int temp = binary%10; //Gets the last digit (rightmost bit) of the binary number.
            decimal += temp*Math.pow(2, n); //Converts the current bit to decimal by multiplying it with 2^n and adds to decimal.
            binary = binary/10; //Removes the last digit from binary.
            n++; //Moves to the next power of 2 for the next digit.
        }
        System.out.println("Decimal number : "+decimal);
    }

}

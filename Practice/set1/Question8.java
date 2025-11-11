package Practice.set1;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // For Input
        long n = sc.nextInt();      //to store input
        long res = 1;               //result var
        while (n > 0){              //if greater than 0
            res = res * (n % 10); // formula for product
            n = n / 10;             // mod 10
        }
        System.out.println(res); // print answer
    }
}
//For all of its products, a supermarket maintains a pricing structure.
// Each product has a value N printed on it.
// The price of the item is determined by multiplying the value N,
// which is read by the scanner, by the sum of all its digits.
// The goal here is to create software that, given the code of any item N,
// will compute the product (multiplication) of all the value digits (price).
//
//Example 1:
//
//Input :
//
//5244 -> Value of N
//
//Output :
//160 -> Price
//
//Explanation:
//
//From the input above
//Product of the digits 5,2,4,4
//5*2*4*4= 160
//Hence, output is 160.
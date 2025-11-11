package Java100;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 376, sq = n * n ;
        if(isAutomorphic(n) == 1)
            System.out.println("Num: "+ n + ", Square: " + sq + " - is Automorphic");
        else
            System.out.println("Num: "+ n + ", Square: " + sq + " - is not Automorphic");
    }
    static int isAutomorphic(int n){
        int square = n * n;
        while(n != 0)
        {
            // means not automorphic number
            if(n % 10 != square % 10){
                return 0;
            }
            // reduce down numbers
            n /= 10;
            square /= 10;
        }
        // if reaches here means automorphic number
        return 1;
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int x = sc.nextInt();
//        int y= x * x;
//        if(y % 10 == x % 10)
//            System.out.println("Automorphic.");
//        else
//            System.out.println("Not an Automorphic.");
//    }


}
//Example
//Input : 5
//Output : 25
//Explanation : Number = 5
//when squared you get 25
//as 25 ends with 5
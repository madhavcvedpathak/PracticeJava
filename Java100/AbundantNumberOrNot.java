package Java100;

public class AbundantNumberOrNot {

    public static void main (String[]args)
    {
        int n = 12, sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum = sum + i;
        } if (sum > n) {
        System.out.println (n + " is an Abundant Number");
        System.out.println ("The Abundance is: " + (sum - n));
        }
        else
        System.out.println (n + " is not an Abundant Number");
    }


}
//Output will show how much abundance for 18, 21(its 3 number of abundance)
//Example
//Input : Number = 18
//Output : Yes, It's an Abundant Number
//Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
//Now the sum of the factors except the number itself is :
//1 + 2 + 3 + 6 + 9 = 21
//as the number 21>18 , the number itself.
//It's an abundant number.
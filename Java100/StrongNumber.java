package Java100;

public class StrongNumber {
    public static void main (String[]args)
    {
        int num = 145;
        if (detectStrong (num))
            System.out.println (num + " is Strong Number");
        else
            System.out.println (num + " is not a Strong Number");
    }

    // function to calculate factorial
    static int facto (int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    static boolean detectStrong (int num)
    {
        int digit, sum = 0;
        int temp = num;
        boolean flag = false;

        // calculate 1! + 4! + 5!
        while (temp != 0)
        {
            digit = temp % 10;
            sum = sum + facto (digit);
            temp /= 10;
        }

        // returns 1 if both equal else 0
        if (sum == num)
            flag = true;
        else
            flag = false;
        return flag;
    }
}

//In number theory, an Armstrong number or a Narcissistic number in a
// given number base b is a
// number that is the sum of its own digits each raised to the
// power of the number of digits.
// A number is an Armstrong Number if and only if it can be
// represented in the following form,
//
//abcd...nth = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + .... pow(nth,n)

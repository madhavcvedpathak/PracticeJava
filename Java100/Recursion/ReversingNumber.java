package Java100.Recursion;

public class ReversingNumber {
    public static void Reverse(int num)
    {
        if (num < 10) {                // base condition to end recursive calls
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10); // print the unit digit of the given number
            Reverse(num / 10);
        }
    }
    public static void main(String args[])
    {
        int num = 1099;
        System.out.print("Reversed Number: ");
        Reverse(num);
    }

//    static int reverseDigits(int num)
//    {
//        int rev_num = 0;
//        while (num > 0) {
//            rev_num = rev_num * 10 + num % 10;
//            num = num / 10;
//        }
//        return rev_num;
//    }

}
//OP: Reversed Number: 9901

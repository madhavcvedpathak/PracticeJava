package Java100.Recursion;

public class PowerOfNumber {

    public static void main (String[]args)
    {
        int base = 5, x = 3; // 5*5=25*5=125.
        System.out.println ("Required Power is " + power (base, x)); //Required Power is 125.
    }
    static int power (int base, int x)
    {
        if (x == 0)     //Base Condition
            return 1;
        return (base * power (base, x - 1));
    }


//    public static void main(String[] args) {
//        int base = 5, x = 3;
//        System.out.println("Required Power is " + power(base, x));
//    }
//    static int power(int base, int x) {
//        int result = 1;
//        while (x > 0) {
//            result *= base;
//            x--;
//        }
//        return result;
//    }

}

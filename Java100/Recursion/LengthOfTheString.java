package Java100.Recursion;

import javax.crypto.spec.PSource;

public class LengthOfTheString {
//    private static int recLength(String str)
//    {
//        if (str.equals(""))
//            return 0;
//        else
//            return recLength(str.substring(1)) + 1;
//    }
//    public static void main(String[] args)
//    {
//        String str ="Prepinsta";
//        System.out.println("length of the string "+recLength(str));
//    }



    public static void main(String args[]) {
        int i = 0;
        String str = "Prepinsta";
        char ch[] = str.toCharArray();
        for (char c : ch) {
            i++;
        }
        System.out.println("Length of the string = "+ i);
    }
}

package Strings;

public class InterningNew {
    public static void main(String[] args) {
//        String s = new String( "raghav");
//        String t = new String("raghav");
//        System.out.println(s==t);// compare locations, false
//        System.out.println(s.equals(t));//comapre ele, true
//        System.out.println(s.charAt(0)==t.charAt(0)); //compare chars true

        String s = new String( "raghav");
        String t = new String("raghav");
        System.out.println(s.equals(t)); //true

    }
}

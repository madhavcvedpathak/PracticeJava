package Java100;

public class OccurrenceOfDigit {
//    public static void main (String[] args)
//    {
//        int x = 898989, c = 0;
//        char b = '9';
//        String s = Integer.toString(x);
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==b)
//                c=c+1;
//        }
//        System.out.println(c);
//    }


    public static void main (String[] args)
    {
        int n = 898989, count = 0;
        int d = 9;
        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        System.out.println(count);
    }
}

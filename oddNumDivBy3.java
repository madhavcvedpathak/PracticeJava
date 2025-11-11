public class oddNumDivBy3 {
    public static void main(String[] args) {
        //
        for (int i = 1; i <= 100; i++){
            //i%2 != 0 check karo num odd hai kya.
            //i%3==0 check karo number divisible by 3 hai kya
            if (i%2 != 0 && i%3==0) System.out.println(i);
        }
    }
}

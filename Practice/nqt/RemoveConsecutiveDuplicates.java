package Practice.nqt;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String modString = remCon(str);

        System.out.println(modString);
    }

    private static String remCon(String s) {
        if (s.isEmpty()) return "";
        StringBuilder res = new StringBuilder();

        res.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(i - 1)){ // 2 2 2 2 3 3 3 (here. 3 != 2 )
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}

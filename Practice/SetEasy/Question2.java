package Practice.SetEasy;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter Digit : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String bin = "";

        while (no != 0){ //Convert decimal number to binary (manual conversion)
            bin = (no & 1) + bin;
            no = no >>1;
        }
        //Toggle all bits (1 → 0, and 0 → 1)
        bin = bin . replace("1","2");
        bin = bin. replace("0", "1");
        bin = bin.replace("2","0");

        //Convert the toggled binary string back to a decimal integer
        int rs = Integer.parseInt(bin, 2);
        System.out.println(rs);
    }
}

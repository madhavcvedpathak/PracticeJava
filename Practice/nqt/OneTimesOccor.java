package Practice.nqt;

import java.util.Scanner;

public class OneTimesOccor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int single = 0;

        for (int i = 0; i < n; i++){
            single ^= sc.nextInt();
        }
        System.out.println(single);
    }
}

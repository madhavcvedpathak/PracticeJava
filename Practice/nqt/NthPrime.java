package Practice.nqt;
import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int prime1 = findNth(n1);
        int prime2 = findNth(n2);

        int res = (prime1 * prime2) - 1;
        System.out.println(res);
    }

    public static int findNth(int n) {
        int count = 0, num = 1;
        while (count < n){
            num++;
            if (isPrimee(num)) count++;
        }
        return num;
    }

    public static boolean isPrimee(int num) {
        if ((num == 0) && (num <= 1)) return  false;
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}

package Practice.SetEasy;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        String[] arr = {"mon","tue","wed","thu","fri","sat","sun"};
        int i = 0;                  // Find the position (index) of the given start day in the array
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) break;
        }

        int count = 0;              //count sunday variable
        int firstSunday = 6 - i;    //Calculate how many days until the first Sunday

        if (firstSunday < n) {      //Case 1: If the first Sunday occurs within the given days
            count = 1 + (n - firstSunday - 1) / 7;
        } else if (i == 6) {        //Case 2: If the month starts on a Sunday itself
            count = 1 + (n - 1) / 7;
        }
        System.out.println(count);  // Count the first day (Sunday) and every 7th day after
    }
}

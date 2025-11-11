package Practice.set2;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create scanner to take input
        System.out.print("Enter N : ");
        long n = sc.nextLong();               // read how many numbers (N)
        long ans = 0;                         // variable to store the final answer

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();           // read each number
            x = (long) Math.pow(2, x);        // calculate 2 raised to the power x

            if (x > 99) {                     // if result is greater than 99
                ans += x % 100;               // add only the last two digits
            } else {
                ans += x;                     // else add the full number
            }
        }
        System.out.println(ans % 100);        // print last two digits of total sum
    }
}


//Enter N : 4
//9 8 7 6
//🧾 Initial Values
//n = 4
//ans = 0
//
//🔁 Loop Iterations
//🔹 Iteration 1
//
//x = 9
//
//x = 2^9 = 512
//x > 99 ? Yes
//→ ans = ans + (x % 100) = 0 + (512 % 100) = 0 + 12 = 12
//
//
//✅ ans = 12
//
//🔹 Iteration 2
//
//x = 8
//
//x = 2^8 = 256
//x > 99 ? Yes
//→ ans = ans + (x % 100) = 12 + (256 % 100) = 12 + 56 = 68
//
//
//✅ ans = 68
//
//🔹 Iteration 3
//
//x = 7
//
//x = 2^7 = 128
//x > 99 ? Yes
//→ ans = ans + (x % 100) = 68 + (128 % 100) = 68 + 28 = 96
//
//
//✅ ans = 96
//
//🔹 Iteration 4
//
//x = 6
//
//x = 2^6 = 64
//x > 99 ? No
//→ ans = ans + x = 96 + 64 = 160
//
//
//✅ ans = 160
//
//🧮 After Loop
//ans = 160
//Output = ans % 100 = 160 % 100 = 60
//
//
//✅ Final Output: 60


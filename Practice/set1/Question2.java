package Practice.set1;
import java.util.Scanner;

//sliding window technique can be used to find the maximum length of a continuous
// sequence of horses whose total betting cost is less than a given amount K.
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of horses
        long K = sc.nextLong(); // reward money
        long[] price = new long[N];

        for (int i = 0; i < N; i++) {
            price[i] = sc.nextLong();
        }

        long sum = 0;
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < N; right++) {
            sum += price[right];  // add current horse’s price

            // if sum becomes too big, remove from left
            while (sum >= K && left <= right) {
                sum -= price[left];
                left++;
            }

            // check valid window (sum < K)
            if (sum < K) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println(maxLen);
    }
}

//Input:
//10 100
//30 40 50 20 20 10 90 10 10 10
//
//Output:
//3

package Practice;
import java.util.*;

public class JobSequencing {
    public static void main(String[] args) {
        int n = 5;
        int[] jobId = {1, 2, 3, 4, 5};
        int[] deadline = {2, 1, 2, 1, 3};
        int[] profit = {100, 19, 27, 25, 15};

        // Sort jobs by profit (descending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (profit[i] < profit[j]) {
                    int temp;

                    // swap profit
                    temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;

                    // swap deadline
                    temp = deadline[i];
                    deadline[i] = deadline[j];
                    deadline[j] = temp;

                    // swap jobId
                    temp = jobId[i];
                    jobId[i] = jobId[j];
                    jobId[j] = temp;
                }
            }
        }

        // Find max deadline
        int maxDeadline = 0;
        for (int d : deadline)
            if (d > maxDeadline) maxDeadline = d;

        int[] result = new int[maxDeadline + 1]; // to store job sequence
        boolean[] slot = new boolean[maxDeadline + 1];
        int totalProfit = 0;

        // Schedule jobs
        for (int i = 0; i < n; i++) {
            for (int j = deadline[i]; j > 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobId[i];
                    totalProfit += profit[i];
                    break;
                }
            }
        }

        // Display result
        System.out.println("Job sequence to maximize profit:");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i])
                System.out.print("J" + result[i] + " ");
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }
}

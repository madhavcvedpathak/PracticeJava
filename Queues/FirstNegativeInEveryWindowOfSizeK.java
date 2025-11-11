package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInEveryWindowOfSizeK {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();

        // Step 1: enqueue indices of all negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) q.add(i);
        }

        // Step 2: slide window
        for (int i = 0; i <= n - k; i++) {
            // Remove indices out of this window
            while (!q.isEmpty() && q.peek() < i) {
                q.poll();
            }

            // Add first negative in current window, or 0 if none
            if (!q.isEmpty() && q.peek() < i + k) {
                ans.add(arr[q.peek()]);
            } else {
                ans.add(0);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(firstNegInt(arr, k));
        // Output: [-1, -1, -7, -15, -15, 0]
    }
}

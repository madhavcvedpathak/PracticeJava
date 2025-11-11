package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    // Custom Triplet class to store value, row index, and column index
    public class Triplet implements Comparable<Triplet> {
        int ele;  // element value
        int row;  // which row
        int col;  // which column

        Triplet(int ele, int row, int col) {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }

        public int compareTo(Triplet t) {
            return this.ele - t.ele; // min-heap based on element value
        }
    }

    // Function to find the smallest range covering at least one element from each row
    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        int k = arr.length;      // number of rows (k lists)
        int n = arr[0].length;   // number of columns (each list length)

        PriorityQueue<Triplet> pq = new PriorityQueue<>(); // min-heap
        int max = Integer.MIN_VALUE;

        // Step 1: Insert the first element of each row into the heap
        for (int i = 0; i < k; i++) {
            max = Math.max(max, arr[i][0]);
            pq.add(new Triplet(arr[i][0], i, 0));
        }

        int start = pq.peek().ele, end = max; // initial range

        // Step 2: Process elements until one row gets exhausted
        while (true) {
            Triplet top = pq.poll();
            int ele = top.ele, row = top.row, col = top.col;

            // Update smallest range if current one is smaller
            if (max - ele < end - start) {
                start = ele;
                end = max;
            }

            // If we've reached the last element of a row → stop
            if (col == n - 1) break;

            // Push the next element from the same row
            int next = arr[row][col + 1];
            max = Math.max(max, next);
            pq.add(new Triplet(next, row, col + 1));
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start);
        ans.add(end);
        return ans;
    }

    // 🔹 MAIN METHOD to run the code
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] arr = {
                {4, 10, 15, 24, 26},
                {0, 9, 12, 20},
                {5, 18, 22, 30}
        };

        ArrayList<Integer> result = sol.findSmallestRange(arr);

        System.out.println("Smallest range is: [" + result.get(0) + ", " + result.get(1) + "]");
    }
}

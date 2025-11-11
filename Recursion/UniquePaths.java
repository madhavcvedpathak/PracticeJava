package Recursion;

public class UniquePaths {

    public static int countPaths(int row, int col, int m, int n) {
        // If we're out of bounds → invalid path
        if (row >= m || col >= n) {
            return 0;
        }

        // If we reach the destination → one valid path
        if (row == m - 1 && col == n - 1) {
            return 1;
        }

        // Move down and right
        int down = countPaths(row + 1, col, m, n);
        int right = countPaths(row, col + 1, m, n);

        return down + right;
    }

    public static void main(String[] args) {
        int m = 3; // number of rows
        int n = 4; // number of columns

        int totalPaths = countPaths(0, 0, m, n);
        System.out.println("Unique Paths: " + totalPaths);
    }
}

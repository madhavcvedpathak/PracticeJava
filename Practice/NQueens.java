package Practice;

public class NQueens {
    final int N = 8; // You can change this value for N x N board

    /* Function to print the solution matrix */
    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print((board[i][j] == 1 ? "Q " : ". "));
            System.out.println();
        }
    }

    /* Check if queen can be placed on board[row][col] */
    boolean isSafe(int board[][], int row, int col) {
        int i, j;

        // Check this column on upper side
        for (i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper diagonal on right side
        for (i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    /* Solve N Queen problem using backtracking */
    boolean solveNQUtil(int board[][], int row) {
        // base case: If all queens are placed
        if (row >= N)
            return true;

        // Try placing queen in all columns one by one
        for (int i = 0; i < N; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 1; // Place queen

                // Recur to place rest of the queens
                if (solveNQUtil(board, row + 1))
                    return true;

                // If placing queen doesn't lead to solution, backtrack
                board[row][i] = 0;
            }
        }

        // No placement possible in this row
        return false;
    }

    /* Initialize board and solve */
    boolean solveNQ() {
        int board[][] = new int[N][N];

        // Place first queen manually (optional — demonstration purpose)
        board[0][0] = 1;

        // Start from row 1 since first queen is already placed
        if (!solveNQUtil(board, 1)) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String args[]) {
        NQueens queen = new NQueens();
        queen.solveNQ();
    }
}

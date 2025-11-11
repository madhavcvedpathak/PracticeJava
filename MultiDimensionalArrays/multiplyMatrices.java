package MultiDimensionalArrays;

public class multiplyMatrices {
    public static void main(String[] args) {
        int n = 2;

        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        int[][] c = new int[n][n];

        // Multiply matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { //c[i][j] = ith row of a * jth col of b
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result
        System.out.println("Result matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}


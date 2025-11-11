package MultiDimensionalArrays;
import java.util.ArrayList;

public class SnakePrint {
    // Main method to run in IntelliJ
    public static void main(String[] args) {
        int[][] matrix = {
                            {45, 48, 54, 67},
                            {21, 89, 87, 78},
                            {70, 78, 15, 89},
                            {21, 89, 87, 90}
        };

        //pass method to function snakePattern
        ArrayList<Integer> output = snakePattern(matrix);

        System.out.println("Snake pattern traversal:");
        for (int val : output) {
            System.out.print(val + " ");
        }
    }

    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {

        ArrayList<Integer> result = new ArrayList<>();
        int N = matrix.length;
//        int rows = matrix.length;
//        int cols = matrix[0].length;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                // Even row: left to right
                for (int j = 0; j < N; j++) {
                    result.add(matrix[i][j]);
                }
            } else {
                // Odd row: right to left
                for (int j = N - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
//Snake pattern traversal:
//        45 48 54 67 78 87 89 21 70 78 15 89 90 87 89 21
//Process finished with exit code 0
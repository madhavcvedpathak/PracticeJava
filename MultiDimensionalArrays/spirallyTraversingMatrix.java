package MultiDimensionalArrays;

public class spirallyTraversingMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Print original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Spiral print
        System.out.print("\nSpiral Order: ");

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Left to right
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            // Top to bottom
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            // Right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            // Bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
    }
}
//Original Matrix:
//        1	   2	3	4
//        5	   6	7	8
//        9	   10	11	12
//        13   14	15	16
//
//Spiral Order: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
package MultiDimensionalArrays;

public class matSearch {
    public static void main(String[] args) {
        int[][] arr = {{2, 6, 3, 15, 12},
                        {4, 8, 0, 16, 2},
                        {2, 6, 13, 7, 1}};

        int x = 15;
        int row = arr.length, col = arr[0].length;

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == x) {
                    System.out.print("Found !!");
                }
            }
        }
    }
}

package Practice.nqt;

public class addMatrix {
    public class Main {
        public static void main(String[] args) {
            int[][] a = { {1, 2},
                        {3, 4} };
            int[][] b = { {4, 3},
                        {2, 1} };
            int n = a.length;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] += b[i][j];
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

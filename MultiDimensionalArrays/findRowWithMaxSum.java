package MultiDimensionalArrays;

public class findRowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{2, 6, 3, 15, 12},
                {4, 8, 0, 16, 2},
                {2, 6, 13, 7, 1}};

        int m = arr.length, n = arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        //find max sum row
        for (int i = 0; i < m; i++){ //row started
            int sum = 0; //sum of row
            for (int j = 0; j < n; j++){ // colm started
                sum += arr[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }

        //min in that maxSum row
        int minInMaxRow = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (arr[maxRow][j] < minInMaxRow) {
                minInMaxRow = arr[maxRow][j];
            }
        }


        System.out.println("Max Sum: " + maxSum);
        System.out.println("Row Index with Max Sum: " + maxRow+" th row");
        System.out.println("Minimum Element in that Row: " + minInMaxRow);
    }
}






    //Print Colmwise
//    public static void printColWise(int[][] arr) {
//
//        int m = arr.length, n = arr[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }


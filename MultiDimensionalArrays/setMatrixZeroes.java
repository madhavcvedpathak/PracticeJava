package MultiDimensionalArrays;
import java.util.ArrayList;

public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 2, 0},
                {3, 4, 0, 2},
                {1, 3, 1, 5}
        };

//Approach 1
//        int m = arr.length;
//        int n = arr[0].length;
//
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//
//        // Step 1: Find zeros
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//
//        // Step 2: Set rows to 0
//        for (int i = 0; i < m; i++) {
//            if (row[i]) {
//                for (int j = 0; j < n; j++) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//        // Step 3: Set cols to 0
//        for (int j = 0; j < n; j++) {
//            if (col[j]) {
//                for (int i = 0; i < m; i++) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//        // Print the final matrix
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


// Approach 2
        int m = arr.length;
        int n = arr[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Step 1: Check if first row has any 0
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Step 2: Check if first column has any 0
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // Step 3: Use first row and column to mark other rows/cols
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) { //jithe pn row colm mdhi 0 asel tya row colm cha first 0th index la 0 place karu
                    arr[i][0] = 0; //row
                    arr[0][j] = 0; //colm
                }
            }
        }

        // Step 4: Set matrix cells to 0 based on marks
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0; //jar first row colm mdhi 0 asel tr direct full row colm zero karun taku.
                }
            }
        }

        // Step 5: Handle first row
        if (firstRowHasZero) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0; //jarka first 0th row mdhich kuth 0 asel tr tyala 0 ch thev
            }
        }

        // Step 6: Handle first column
        if (firstColHasZero) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0; //jarka first 0th colm mdhich kuth 0 asel tr tyala 0 ch thev
            }
        }

        // Print the modified matrix
        for (int i = 0; i < m; i++) { //aata final matrix print kru with hlp of loop
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}

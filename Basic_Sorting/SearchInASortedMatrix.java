package Basic_Sorting;

public class SearchInASortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target = 34;
        Solution sol = new Solution();
        boolean result = sol.searchMatrix(matrix, target);

        System.out.println(result ? "Target found." : "Target not found.");
    }
}

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] arr, int tar) {
        int rows = arr.length, cols = arr[0].length;

        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midRow = mid / cols, midCol = mid % cols;

            if (arr[midRow][midCol] == tar) return true;
            else if (arr[midRow][midCol] > tar) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}

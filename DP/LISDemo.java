package DP;

public class LISDemo {
    static int lis(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];

        // Each element is LIS of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        int maxLIS = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }

    public static void main(String[] args) {
        int arr1[] = {5, 8, 3, 7, 9, 1};
        System.out.println("LIS length: " + lis(arr1));

        int arr2[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println("LIS length: " + lis(arr2));

        int arr3[] = {3, 10, 2, 1, 20};
        System.out.println("LIS length: " + lis(arr3));
    }
}

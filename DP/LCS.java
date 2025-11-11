package DP;

public class LCS {
    // Function to find length of Longest Common Subsequence
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // dp[i][j] = LCS length of first i letters of s1 and first j letters of s2
        int[][] dp = new int[n + 1][m + 1];

        // Fill the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0; // LCS with empty string = 0
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // letters match → add 1
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // letters differ → take max
                }
            }
        }

        return dp[n][m]; // length of LCS
    }

    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        int result = lcs(s1, s2);
        System.out.println("Length of LCS: " + result); // Output: 3
    }
}

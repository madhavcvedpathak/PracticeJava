package DP;

public class LCSExample {
    // Function to find length of Longest Common Subsequence
    public static int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length(); // length of first string
        int m = s2.length(); // length of second string

        // DP table: dp[i][j] = LCS length of first i chars of s1 and first j chars of s2
        int[][] dp = new int[n + 1][m + 1];

        // Fill the table
        for (int i = 0; i <= n; i++) { // iterate over s1
            for (int j = 0; j <= m; j++) { // iterate over s2
                if (i == 0 || j == 0) {
                    dp[i][j] = 0; // base case: LCS with empty string = 0
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // Characters match → include it in LCS
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // Characters differ → take max of ignoring last char of s1 or s2
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // dp[n][m] contains the length of LCS for full strings
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        int lcsLength = longestCommonSubsequence(s1, s2);

        System.out.println("Length of LCS: " + lcsLength);
    }
}


//Explanation (Step by Step)
//
//dp[i][j] → stores length of LCS for first i chars of s1 and first j chars of s2.
//
//        Base case: dp[0][*] = 0 or dp[*][0] = 0 because LCS with empty string = 0.
//
//If characters match: Add 1 to dp[i-1][j-1].
//
//If characters differ: Take maximum of dp[i-1][j] or dp[i][j-1].
//
//Finally, dp[n][m] = LCS length of full strings.
//
//✅ Example Output for the code above:
//
//Length of LCS: 3

//LCS = "ace"
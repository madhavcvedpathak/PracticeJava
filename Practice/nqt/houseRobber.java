package Practice.nqt;

public class houseRobber {
    public static void main(String[] args) {
        int[] hval = {6, 7, 1, 3, 8, 2, 4};

        int n = hval.length;
        int prev1 = 0;                        // previous house
        int prev2 = 0;                       // house before previous

        for (int i = 0; i < n; i++) {
            int pick = hval[i] + prev2;   // rob this house
            int skip = prev1;            // skip this house
            int curr = Math.max(pick, skip);
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println("Maximum money stolen: " + prev1);
    }
}

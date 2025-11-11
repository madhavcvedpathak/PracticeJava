package Basic_Sorting;

//Given a positive integer n, find the square root of n.
//If n is not a perfect square,
//then return the floor value.
//Floor value of any number is the greatest Integer
//which is less than or equal to that number
//Examples:
//Input: n = 4
//Output: 2
//Explanation: Since, 4 is a perfect square, so its square root is 2.

public class SquareRoot {
    // Method to compute floor square root
    int floorSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n;
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= n / mid) { // Avoid overflow
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Main method to test the floorSqrt method
    public static void main(String[] args) {
        SquareRoot sqr = new SquareRoot();

        int n = 17;
        int result = sqr.floorSqrt(n);

        System.out.println("Floor square root of " + n + " is: " + result);
    }
}

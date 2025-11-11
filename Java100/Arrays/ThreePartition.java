package Java100.Arrays;

public class ThreePartition {
    public static boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        if (total % 3 != 0) return false;

        int target = total / 3, sum = 0, count = 0;
        for (int n : arr) {
            sum += n;
            if (sum == target) {
                count++;
                sum = 0;
            }
        }
        return count >= 3;
    }

    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1})); // true
        System.out.println(canThreePartsEqualSum(new int[]{0,0,0,0})); // true
    }
}

//✅ So the logic is:
//      Total must be divisible by 3.
//      Keep accumulating sum until it hits target.
//      Reset and count partitions.
//      If we hit 3 or more, return true.
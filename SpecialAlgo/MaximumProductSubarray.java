package SpecialAlgo;

public class MaximumProductSubarray {

    // Function to find maximum product subarray
    public static int maxProduct(int[] arr) {
        int result = arr[0];          // store final answer
        int maxEndingHere = arr[0];   // max product ending at current index
        int minEndingHere = arr[0];   // min product ending at current index

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            // if current is negative, swap max and min
            if (current < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            // update max and min products ending at current index
            maxEndingHere = Math.max(current, maxEndingHere * current);
            minEndingHere = Math.min(current, minEndingHere * current);
            // update result
            result = Math.max(result, maxEndingHere);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr1)); // 180

        int[] arr2 = {-1, -3, -10, 0, 6};
        System.out.println(maxProduct(arr2)); // 30

        int[] arr3 = {2, 3, 4};
        System.out.println(maxProduct(arr3)); // 24
    }
}

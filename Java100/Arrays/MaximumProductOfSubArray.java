package Java100.Arrays;

public class MaximumProductOfSubArray {
    static int maxSubarrayProduct(int arr[])
    {
        int result = arr[0], n = arr.length; // Initializing result
        for (int i = 0; i < n; i++)
        {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++) // traversing in current subarray
            {
                // updating result every time
                // to keep an eye over the
                // maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul); // updating the result for (n-1)th index.
        }
        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
        System.out.println("Maximum Sub array product is " + maxSubarrayProduct(arr));
    }
}
// Maximum Sub array product is 112000
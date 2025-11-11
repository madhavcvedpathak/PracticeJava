package Arrays;
import java.util.Arrays;
import java.util.Vector;

public class AddOneToArrayNumber {
    public static void main(String[] args) {
        // Example 1
        int[] input1 = {5, 6, 7, 8};
        Vector<Integer> output1 = addOne(input1);
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output after +1: " + output1);

        // Example 2
        int[] input2 = {9, 9, 9};
        Vector<Integer> output2 = addOne(input2);
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output after +1: " + output2);

    }

    // Function to add 1 to number represented by array
    public static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> result = new Vector<>();
        int carry = 1;                      // We want to add 1

        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            result.add(0, sum % 10);  // Add remainder at front
            carry = sum / 10;                      // Update carry
        }
        // If there's still a carry left (e.g., all 9s), add it at the beginning
        if (carry > 0) {
            result.add(0, carry);
        }

        return result;
    }



}
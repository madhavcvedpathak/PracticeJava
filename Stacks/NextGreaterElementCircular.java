package Stacks;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementCircular {
    public static int[] nextGreater(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];

        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);               // default to -1 for each element
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {   // Loop from 2n - 1 to 0 to simulate circular array
            int index = i % n;
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[index]) {
                stack.pop();                    // Pop smaller or equal elements
            }
            if (!stack.isEmpty()) {
                res[index] = nums[stack.peek()]; // If stack is not empty, top is next greater
            }
            stack.push(index);                   // Push current index
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreater(nums);
        System.out.println(Arrays.toString(result)); // Output: [2, -1, 2]
    }
}

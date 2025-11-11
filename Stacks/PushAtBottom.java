package Stacks;
import java.util.Stack;

public class PushAtBottom {
    // Recursive function to push element at bottom
    static void pushBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int top = stack.pop();          // pop the top
        pushBottom(stack, x);           // recursive call
        stack.push(top);                // push top back
    }
    static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int top = stack.pop();         // Remove top
        reverseStack(stack);           // Reverse remaining stack
        pushBottom(stack, top);        // Insert top at bottom
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        pushBottom(stack, 50);  // Push 50 at the bottom
        System.out.println(stack);  // Output: [50, 10, 20, 30]

        reverseStack(stack); // This modifies the stack in-place
        System.out.println(stack); // Now print the reversed stack
    }
}

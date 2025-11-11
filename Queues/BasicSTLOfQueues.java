package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicSTLOfQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q + " " + q.peek()); // nakli printing
        q.remove();
        System.out.println(q + " " + q.size());
        System.out.println(q.remove()+" "+q);
        insertAtIndex(q,2,99);
        System.out.println(q);
        display(q);
        traversePrint(q);
        System.out.println(peekAt(q,2));
        reverseQueue(q);
        System.out.println(q);
    }
    public static void traversePrint(Queue<Integer> q) {
        int s = q.size();
        System.out.print("Queue Elements: ");
        for (int i = 1; i <= s; i++) {
            int front = q.peek();           // Get front element
            System.out.print(front + " ");  // Print it
            q.add(q.remove());              // Rotate it to the back
        }
        System.out.println();
    }

    public static int insertAtIndex(Queue<Integer> q, int index, int value) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int front = q.remove();
            if (i == index) {
                q.add(value);
            }
            q.add(front);
        }
        if (index == size) {
            q.add(value);
        }
        return value; // <-- now it's a valid int-returning method
    }

    public static int peekAt(Queue<Integer> q, int idx) {
        int size = q.size();
        int result = -1; // default if index invalid
        for (int i = 0; i < size; i++) {
            int front = q.remove();
            if (i == idx) {
                result = front; // found the desired index
            }
            q.add(front); // maintain order
        }
        return result;
    }

    public static void display(Queue<Integer> q) {
        int size = q.size();
        System.out.print("Queue Elements: ");
        for (int i = 0; i < size; i++) {
            int front = q.remove();         // Take front element
            System.out.print(front + " ");  // Print it
            q.add(front);                   // Re-add it to preserve order
        }
        System.out.println();
    }

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) { // Step 1: Move all elements to stack
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) { // Step 2: Move all elements back to queue
            q.add(stack.pop());
        }
    }


}

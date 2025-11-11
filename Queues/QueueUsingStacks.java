package Queues;
import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void add(int val) {
        stack1.push(val);
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        moveStack1ToStack2IfNeeded();
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        moveStack1ToStack2IfNeeded();
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    private void moveStack1ToStack2IfNeeded() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Remove: " + queue.remove());

        queue.add(40);

        System.out.println("Remove: " + queue.remove());
        System.out.println("Peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Remove: " + queue.remove());
        }
        System.out.println("Is empty? " + queue.isEmpty());
    }
}

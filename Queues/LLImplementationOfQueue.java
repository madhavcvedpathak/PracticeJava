package Queues;

public class LLImplementationOfQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Front element: " + q.peek());  // 10
        System.out.println("Queue size: " + q.size());     // 3

        System.out.println("Removed: " + q.remove());      // 10
        System.out.println("Front element now: " + q.peek()); // 20

        System.out.println("Is queue empty? " + q.isEmpty()); // false

        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.remove());
        }
        System.out.println("Is queue empty after removals? " + q.isEmpty()); // true
    }
}

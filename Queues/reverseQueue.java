package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        System.out.println("Original queue: " + queue);
//        reverseQueue(queue);
//        System.out.println("Reversed queue: " + queue);
//    }
//    public static void reverseQueue(Queue<Integer> q) {
//        Stack<Integer> stack = new Stack<>();
//        while (!q.isEmpty()) { // Step 1: Move all elements to stack
//            stack.push(q.remove());
//        }
//        while (!stack.isEmpty()) { // Step 2: Move them back to queue (reversed)
//            q.add(stack.pop());
//        }
//    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Original queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed queue: " + queue);
    }
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()){
            stack.push(q.remove());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }
    }
}

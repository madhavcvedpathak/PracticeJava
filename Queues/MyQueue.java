package Queues;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class MyQueue {
    Node head;
    Node tail;
    int size;

    // Add element to the tail of the queue
    public void add(int val) {
        Node newNode = new Node(val);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    // Remove and return the element at the head of the queue
    public int remove() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }
        int val = head.val;
        head    = head.next;
        if (head == null) {
            tail = null; // queue became empty
        }
        size--;
        return val;
    }

    // Return the front element without removing it
    public int peek() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }
        return head.val;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return the size of the queue
    public int size() {
        return size;
    }
}

package Queues;

class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean add(int val) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return false;
        }
        arr[rear] = val;
        rear = rear + 1;
        if (rear == capacity) {
            rear = 0;
        }
        size++;
        return true;
    }

    public int remove() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        int val = arr[front];
        front = front + 1;
        if (front == capacity) {
            front = 0;
        }
        size--;
        return val;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Front -> ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i]);
            if (count != size - 1) System.out.print(" -> ");
            i++;
            if (i == capacity) i = 0;  // wrap around
        }
        System.out.println(" <- Rear");
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "Queue is empty";
        StringBuilder sb = new StringBuilder();
        sb.append("Front -> ");
        for (int i = 0; i < size; i++) {
            sb.append(arr[(front + i) % capacity]);
            if (i < size - 1) sb.append(" -> ");
        }
        sb.append(" <- Rear");
        return sb.toString();
    }
}

public class CircularArray {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();  // Front -> 10 -> 20 -> 30 -> 40 -> 50 <- Rear
        System.out.println("Peek: " + queue.peek()); // Peek at front (10)

        System.out.println("Remove: " + queue.remove());  // 10
        System.out.println("Peek after remove: " + queue.peek()); // Peek (20)
        System.out.println("Remove: " + queue.remove());  // 20

        queue.display();  // Front -> 30 -> 40 -> 50 <- Rear
        System.out.println("Peek: " + queue.peek()); // Peek (30)

        queue.add(60);
        queue.add(70);

        queue.display();  // Front -> 30 -> 40 -> 50 -> 60 -> 70 <- Rear
        System.out.println("Peek: " + queue.peek()); // Peek (30)

        System.out.println("Is full? " + queue.isFull());  // true
        System.out.println("Is empty? " + queue.isEmpty()); // false

        while (!queue.isEmpty()) {
            System.out.println("Peek before remove: " + queue.peek());
            System.out.println("Removed: " + queue.remove());
        }
        System.out.println("Is empty after clearing? " + queue.isEmpty()); // true
    }
}
package Heaps;

public class MinHeapImplementation {
    private int[] heap;   // array to store heap elements
    private int size;     // current number of elements
    private int capacity; // max capacity

    // Constructor
    public MinHeapImplementation(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity];
    }

    // Get parent index
    private int parent(int i) { return (i - 1) / 2; }
    // Get left child index
    private int left(int i) { return 2 * i + 1; }
    // Get right child index
    private int right(int i) { return 2 * i + 2; }

    // Swap helper
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert element
    public void insert(int key) {
        if (size == capacity) {
            System.out.println("Heap overflow! Cannot insert " + key);
            return;
        }
        // Insert at end
        int i = size;
        heap[size++] = key;

        // Fix min heap property
        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Heapify at index i
    private void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Extract minimum element (root)
    public int extractMin() {
        if (size <= 0) return Integer.MAX_VALUE;
        if (size == 1) return heap[--size];

        // Store min value
        int root = heap[0];

        // Replace root with last element
        heap[0] = heap[--size];
        heapify(0);

        return root;
    }

    // Get minimum element (without removing)
    public int getMin() {
        if (size == 0) return Integer.MAX_VALUE;
        return heap[0];
    }

    // Print heap array
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        MinHeapImplementation minHeap = new MinHeapImplementation(10);

        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(15);
        minHeap.insert(5);
        minHeap.insert(4);
        minHeap.insert(45);

        System.out.print("Heap elements: ");
        minHeap.printHeap();

        System.out.println("Extracted Min: " + minHeap.extractMin());
        System.out.print("Heap after extraction: ");
        minHeap.printHeap();

        System.out.println("Current Min: " + minHeap.getMin());
    }
}

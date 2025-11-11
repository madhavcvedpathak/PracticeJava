package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    // Max-heap for smaller half
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    // Min-heap for larger half
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public MedianFinder() {
    }

    public void addNum(int num) {
        // Step 1: Add to maxHeap first
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        // Step 2: Balance heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}

public class MedianInDataStream {
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        System.out.println("Median after adding 1: " + mf.findMedian());

        mf.addNum(2);
        System.out.println("Median after adding 2: " + mf.findMedian());

        mf.addNum(3);
        System.out.println("Median after adding 3: " + mf.findMedian());

        mf.addNum(4);
        System.out.println("Median after adding 4: " + mf.findMedian());

        mf.addNum(5);
        System.out.println("Median after adding 5: " + mf.findMedian());
    }
}

package io.dksifoua.leetcode.kthlargestelementinastream;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {

    private final int k;
    private final Queue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.add(val);
        } else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(val);
        }

        return minHeap.peek();
    }
}

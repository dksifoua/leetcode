package io.dksifoua.leetcode.kthlargestelementinanarray;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest
            }
        }
        return minHeap.peek();
    }
}

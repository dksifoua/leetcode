package io.dksifoua.leetcode.laststoneweight;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];

        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone: stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(), x = maxHeap.poll();
            if (x != y) {
                maxHeap.add(y - x);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}

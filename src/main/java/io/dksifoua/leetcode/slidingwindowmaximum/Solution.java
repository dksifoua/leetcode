package io.dksifoua.leetcode.slidingwindowmaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return nums;

        Deque<Integer> queue = new ArrayDeque<>(k);
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && nums[i] > queue.getLast()) {
                queue.pollLast();
            }

            queue.offerLast(nums[i]);
        }

        int[] result = new int[nums.length - k + 1];
        result[0] = queue.getFirst();
        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] == queue.getFirst()) {
                queue.pollFirst();
            }

            while (!queue.isEmpty() && nums[i] > queue.getLast()) {
                queue.pollLast();
            }

            queue.offerLast(nums[i]);
            result[i - k + 1] = queue.getFirst();
        }

        return result;
    }
}

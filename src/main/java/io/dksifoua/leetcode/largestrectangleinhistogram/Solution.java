package io.dksifoua.leetcode.largestrectangleinhistogram;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer> indices = new ArrayDeque<>(heights.length);

        for (int i = 0; i < heights.length; i++) {
            while (!indices.isEmpty() && heights[i] < heights[indices.peek()]) {
                int k = indices.pop();
                int width = indices.isEmpty() ? i : i - indices.peek() - 1;
                maxArea = Math.max(maxArea, width * heights[k]);
            }

            indices.push(i);
        }

        int i = heights.length;
        while (!indices.isEmpty()) {
            int k = indices.pop();
            int width = indices.isEmpty() ? i : i - indices.peek() - 1;
            maxArea = Math.max(maxArea, width * heights[k]);
        }

        return maxArea;
    }
}

package io.dksifoua.leetcode.containerwithmostwater;

public class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        while (leftIndex < rightIndex) {
            int area = (rightIndex - leftIndex) * Math.min(height[leftIndex], height[rightIndex]);
            maxArea = Math.max(maxArea, area);

            if (height[leftIndex] < height[rightIndex]) {
                leftIndex += 1;
            } else {
                rightIndex -= 1;
            }
        }
        return maxArea;
    }
}

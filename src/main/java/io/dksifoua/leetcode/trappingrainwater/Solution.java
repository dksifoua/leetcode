package io.dksifoua.leetcode.trappingrainwater;

public class Solution {

    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        for (int i = 0, j = height.length - 1; i < height.length && j >= 0; i++, j--) {
            if (i == 0 && j == height.length - 1) {
                maxLeft[i] = height[i];
                maxRight[j] = height[j];
                continue;
            }

            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
            maxRight[j] = Math.max(height[j], maxRight[j + 1]);
        }

        int result = 0;
        for (int i = 0; i < height.length; i++) {
            if (maxLeft[i] > height[i] && maxRight[i] > height[i]) {
                result += Math.min(maxLeft[i], maxRight[i]) - height[i];
            }
        }

        return result;
    }
}

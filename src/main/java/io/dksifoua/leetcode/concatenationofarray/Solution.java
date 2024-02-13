package io.dksifoua.leetcode.concatenationofarray;

public class Solution {

    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        int i = 0;
        while (i < nums.length) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];

            i += 1;
        }

        return result;
    }
}

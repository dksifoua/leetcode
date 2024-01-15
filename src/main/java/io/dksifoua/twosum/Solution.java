package io.dksifoua.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memory = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = nums[i];
            int right = target - left;

            if (memory.containsKey(right)) {
                return new int[] { i, memory.get(right) };
            }

            memory.put(left, i);
        }

        throw new IllegalArgumentException("No two elements add up to the target");
    }
}

package io.dksifoua.leetcode.containsduplicate2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> uniqueNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqueNumbers.containsKey(nums[i])) {
                if (Math.abs(i - uniqueNumbers.get(nums[i])) <= k) {
                    return true;
                }
            }
            uniqueNumbers.put(nums[i], i);
        }

        return false;
    }
}

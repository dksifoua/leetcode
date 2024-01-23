package io.dksifoua.leetcode.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        int element = Integer.MIN_VALUE, count = 0;
        for (int num: nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (element == num) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return element;
    }

    public int majorityElementWithHashMap(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > nums.length / 2)
                return num;
        }

        throw new IllegalArgumentException("There's no solution for the input provided!");
    }
}

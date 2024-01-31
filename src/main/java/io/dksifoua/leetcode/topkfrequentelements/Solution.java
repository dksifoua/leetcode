package io.dksifoua.leetcode.topkfrequentelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num: nums) {
            frequencies.put(num, 1 + frequencies.getOrDefault(num, 0));
        }

        List<Integer>[] frequencyToElements = new List[nums.length];
        for (int i = 0; i < nums.length; i++) {
            frequencyToElements[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry: frequencies.entrySet()) {
            int index = entry.getValue() - 1;
            frequencyToElements[index].add(entry.getKey());
        }

        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            boolean filled = false;
            for (int element: frequencyToElements[i]) {
                result[j] = element;
                if (j == k - 1) {
                    filled = true;
                    break;
                }
                j += 1;
            }
            if (filled) break;
        }

        return result;
    }
}

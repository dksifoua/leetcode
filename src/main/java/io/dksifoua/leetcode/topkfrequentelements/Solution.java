package io.dksifoua.leetcode.topkfrequentelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> count = new HashMap<>();
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new ArrayList[nums.length];

        for (int num: nums)
            count.put(num, 1 + count.getOrDefault(num, 0));

        for (Integer num: count.keySet()) {
            int index = count.get(num) - 1;
            if (bucket[index] == null)
                bucket[index] = new ArrayList<>();
            bucket[index].add(num);
        }

        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (bucket[i] == null)
                continue;
            for (int element: bucket[i]) {
                result[j++] = element;
                if (j == k)
                    return result;
            }
        }

        throw new IllegalArgumentException("There is no solution for this problem!!!");
    }
}

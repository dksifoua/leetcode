package io.dksifoua.leetcode.longestconsecutivesequence;

import java.util.*;

public class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num: nums) {
            uniqueNumbers.add(num);
        }

        List<Integer> sequenceStarts = new ArrayList<>();
        for (int num: uniqueNumbers) {
            if (!uniqueNumbers.contains(num - 1)) {
                sequenceStarts.add(num);
            }
        }

        int maxLength = 0;
        for (Integer start: sequenceStarts) {
            int length = 1;
            while (uniqueNumbers.contains(start + length)) {
                length += 1;
            }
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}

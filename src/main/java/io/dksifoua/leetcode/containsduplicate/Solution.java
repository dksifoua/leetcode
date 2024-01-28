package io.dksifoua.leetcode.containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num: nums) {
            if (uniqueNumbers.contains(num)) {
                return true;
            }
            uniqueNumbers.add(num);
        }

        return false;
    }
}

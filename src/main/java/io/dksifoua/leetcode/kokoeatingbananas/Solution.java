package io.dksifoua.leetcode.kokoeatingbananas;

import java.util.Arrays;

public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int lowPointerK = 1, highPointerK = Arrays.stream(piles).max().orElseThrow();
        while (lowPointerK <= highPointerK) {
            int middlePointerK = (highPointerK + lowPointerK) / 2;

            long hours = Arrays.stream(piles)
                    .mapToLong(pile -> Math.ceilDiv(pile, middlePointerK))
                    .sum();

            if (hours <= h) {
                highPointerK = middlePointerK - 1;
            } else {
                lowPointerK = middlePointerK + 1;
            }
        }

        return lowPointerK;
    }
}

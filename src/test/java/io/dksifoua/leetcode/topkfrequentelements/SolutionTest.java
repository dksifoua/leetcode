package io.dksifoua.leetcode.topkfrequentelements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        Arrays.sort(result);
        assertArrayEquals(new int[] { 1, 2 }, result);
    }

    @Test
    void test2() {
        int[] nums = { 1 };
        int k = 1;
        int[] result = solution.topKFrequent(nums, k);
        Arrays.sort(result);
        assertArrayEquals(new int[] { 1 }, result);
    }
}

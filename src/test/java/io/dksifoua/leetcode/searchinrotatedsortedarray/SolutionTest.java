package io.dksifoua.leetcode.searchinrotatedsortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(solution.search(nums, 0), 4);
    }

    @Test
    void test2() {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(solution.search(nums, 3), -1);
    }

    @Test
    void test3() {
        int[] nums = new int[] { 1 };
        Assertions.assertEquals(solution.search(nums, 0), -1);
    }
}

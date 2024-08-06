package io.dksifoua.leetcode.findminimuminrotatedsortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[] { 3, 4, 5, 1, 2 };
        Assertions.assertEquals(solution.findMin(nums), 1);
    }

    @Test
    void test2() {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(solution.findMin(nums), 0);
    }

    @Test
    void test3() {
        int[] nums = new int[] { 11, 13, 15, 17 };
        Assertions.assertEquals(solution.findMin(nums), 11);
    }
}

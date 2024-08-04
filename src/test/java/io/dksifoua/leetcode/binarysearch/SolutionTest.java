package io.dksifoua.leetcode.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        Assertions.assertEquals(4, solution.search(nums, 9));
    }

    @Test
    void test2() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        Assertions.assertEquals(-1, solution.search(nums, 2));
    }

    @Test
    void test3() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        Assertions.assertEquals(-1, solution.search(nums, 13));
    }
}

package io.dksifoua.leetcode.trappingrainwater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] height = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        Assertions.assertEquals(6, solution.trap(height));
    }

    @Test
    void test2() {
        int[] height = new int[] { 4, 2, 0, 3, 2, 5 };
        Assertions.assertEquals(9, solution.trap(height));
    }
}

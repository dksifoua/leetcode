package io.dksifoua.leetcode.containerwithmostwater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Assertions.assertEquals(49, solution.maxArea(height));
    }

    @Test
    void test2() {
        int[] height = new int[] { 1, 1 };
        Assertions.assertEquals(1, solution.maxArea(height));
    }

    @Test
    void test3() {
        int[] height = new int[] { 1, 2, 4, 3 };
        Assertions.assertEquals(4, solution.maxArea(height));
    }
}

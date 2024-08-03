package io.dksifoua.leetcode.largestrectangleinhistogram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] heights = new int[] { 2, 1, 5, 6, 2, 3 };
        Assertions.assertEquals(solution.largestRectangleArea(heights), 10);
    }

    @Test
    void test2() {
        int[] heights = new int[] { 2, 4 };
        Assertions.assertEquals(solution.largestRectangleArea(heights), 4);
    }
}

package io.dksifoua.leetcode.slidingwindowmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] expected = new int[] { 3, 3, 5, 5, 6, 7 };
        assertArrayEquals(expected, solution.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3));
    }

    @Test
    void test2() {
        int[] expected = new int[] { 1 };
        assertArrayEquals(expected, solution.maxSlidingWindow(new int[] { 1 }, 1));
    }
}

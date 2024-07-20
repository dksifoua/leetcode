package io.dksifoua.leetcode.dailytemperatures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] temperatures = new int[] { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] expected = new int[] { 1, 1, 4, 2, 1, 1, 0, 0 };
        Assertions.assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }

    @Test
    void test2() {
        int[] temperatures = new int[] { 30, 40, 50, 60 };
        int[] expected = new int[] { 1, 1, 1, 0 };
        Assertions.assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }

    @Test
    void test3() {
        int[] temperatures = new int[] { 30, 60, 90 };
        int[] expected = new int[] { 1, 1, 0 };
        Assertions.assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }
}

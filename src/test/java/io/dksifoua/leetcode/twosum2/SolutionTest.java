package io.dksifoua.leetcode.twosum2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        int[] expected = { 1, 2 };
        int[] actual = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] expected = { 1, 3 };
        int[] actual = solution.twoSum(new int[] { 2, 3, 4 }, 6);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] expected = { 1, 2 };
        int[] actual = solution.twoSum(new int[] { -1, 0 }, -1);
        Assertions.assertArrayEquals(expected, actual);
    }
}

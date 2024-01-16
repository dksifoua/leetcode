package io.dksifoua.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;

        int[] expected = new int[] { 0, 1 };
        int[] actual = solution.twoSum(nums, target);

        Arrays.sort(expected);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] nums = new int[] { 3, 2, 4 };
        int target = 6;

        int[] expected = new int[] { 1, 2 };
        int[] actual = solution.twoSum(nums, target);

        Arrays.sort(expected);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] nums = new int[] { 3, 3 };
        int target = 6;

        int[] expected = new int[] { 0, 1 };
        int[] actual = solution.twoSum(nums, target);

        Arrays.sort(expected);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}

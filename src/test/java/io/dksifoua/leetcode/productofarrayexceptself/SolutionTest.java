package io.dksifoua.leetcode.productofarrayexceptself;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        int[] input = { 1, 2, 3, 4 };
        int[] expect = { 24, 12, 8, 6 };
        int[] actual = solution.productExceptSelf(input);
        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    void test2() {
        int[] input = { -1, 1, 0, -3, 3 };
        int[] expect = { 0, 0, 9, 0, 0 };
        int[] actual = solution.productExceptSelf(input);
        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    void test3() {
        int[] input = { 1, 2, 3, 4 };
        int[] expect = { 24, 12, 8, 6 };
        int[] actual = solution.productExceptSelfWithExtraSpaceComplexity(input);
        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    void test4() {
        int[] input = { -1, 1, 0, -3, 3 };
        int[] expect = { 0, 0, 9, 0, 0 };
        int[] actual = solution.productExceptSelfWithExtraSpaceComplexity(input);
        Assertions.assertArrayEquals(expect, actual);
    }
}

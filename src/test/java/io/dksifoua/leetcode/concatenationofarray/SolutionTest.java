package io.dksifoua.leetcode.concatenationofarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertArrayEquals(new int[] { 1, 2, 1, 1, 2, 1 }, solution.getConcatenation(new int[] { 1, 2, 1 }));
    }

    @Test
    void test2() {
        Assertions.assertArrayEquals(new int[] { 1, 3, 2, 1, 1, 3, 2, 1 }, solution.getConcatenation(new int[] { 1, 3, 2, 1 }));
    }
}

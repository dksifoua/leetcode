package io.dksifoua.leetcode.kokoeatingbananas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertEquals(4, solution.minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8));
    }

    @Test
    void test2() {
        Assertions.assertEquals(30, solution.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 5));
    }

    @Test
    void test3() {
        Assertions.assertEquals(23, solution.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 6));
    }

    @Test
    void test4() {
        Assertions.assertEquals(3, solution.minEatingSpeed(new int[] { 805306368, 805306368, 805306368 }, 1000000000));
    }
}

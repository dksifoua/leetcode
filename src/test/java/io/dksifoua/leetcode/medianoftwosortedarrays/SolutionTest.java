package io.dksifoua.leetcode.medianoftwosortedarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(2d, solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
    }

    @Test
    void test2() {
        assertEquals(2.5d, solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
    }

    @Test
    void test3() {
        assertEquals(1d, solution.findMedianSortedArrays(new int[] {}, new int[] { 1 }));
    }

    @Test
    void test4() {
        assertEquals(-1d, solution.findMedianSortedArrays(new int[] { 3 }, new int[] { -2, -1 }));
    }
}

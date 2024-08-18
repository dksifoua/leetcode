package io.dksifoua.leetcode.findtheduplicatenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(2, solution.findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
    }

    @Test
    void test2() {
        assertEquals(3, solution.findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
    }

    @Test
    void test3() {
        assertEquals(3, solution.findDuplicate(new int[] { 3, 3, 3, 3, 3 }));
    }
}

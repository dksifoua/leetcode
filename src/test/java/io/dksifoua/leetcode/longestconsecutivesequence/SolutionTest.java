package io.dksifoua.leetcode.longestconsecutivesequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertEquals(4, solution.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
    }

    @Test
    void test2() {
        Assertions.assertEquals(9, solution.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }));
    }
}

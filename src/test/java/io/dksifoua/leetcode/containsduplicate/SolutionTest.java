package io.dksifoua.leetcode.containsduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertTrue(solution.containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void test2() {
        Assertions.assertFalse(solution.containsDuplicate(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void test3() {
        Assertions.assertTrue(solution.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }
}

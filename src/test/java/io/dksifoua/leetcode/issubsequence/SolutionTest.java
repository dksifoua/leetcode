package io.dksifoua.leetcode.issubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertFalse(solution.isSubsequence("abcd", "ab"));
    }

    @Test
    void test2() {
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void test3() {
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}

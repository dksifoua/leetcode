package io.dksifoua.leetcode.permutationinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    public Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void test2() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void test3() {
        assertTrue(solution.checkInclusion("adc", "dcda"));
    }
}

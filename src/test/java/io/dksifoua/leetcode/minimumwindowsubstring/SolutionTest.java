package io.dksifoua.leetcode.minimumwindowsubstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertEquals("BANC", this.solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void test2() {
        Assertions.assertEquals("a", this.solution.minWindow("a", "a"));
    }

    @Test
    void test3() {
        Assertions.assertEquals("", this.solution.minWindow("a", "aa"));
    }

    @Test
    void test4() {
        Assertions.assertEquals("", this.solution.minWindow("a", "b"));
    }
}

package io.dksifoua.leetcode.mergestringsalternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals("abc", solution.mergeAlternately("abc", ""));
        assertEquals("abc", solution.mergeAlternately("", "abc"));
    }

    @Test
    void test2() {
        assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
    }

    @Test
    void test3() {
        assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
    }

    @Test
    void test4() {
        assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }
}

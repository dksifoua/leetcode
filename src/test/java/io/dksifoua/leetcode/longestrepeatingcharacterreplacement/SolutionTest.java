package io.dksifoua.leetcode.longestrepeatingcharacterreplacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(4, solution.characterReplacement("ABAB", 2));
    }

    @Test
    void testOptimal1() {
        assertEquals(4, solution.characterReplacementOptimal("ABAB", 2));
    }

    @Test
    void test2() {
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }

    @Test
    void testOptimal2() {
        assertEquals(4, solution.characterReplacementOptimal("AABABBA", 1));
    }

    @Test
    void test3() {
        assertEquals(1, solution.characterReplacement("ABAB", 0));
    }

    @Test
    void testOptimal3() {
        assertEquals(1, solution.characterReplacementOptimal("ABAB", 0));
    }

    @Test
    void test4() {
        assertEquals(4, solution.characterReplacement("AAAA", 0));
    }

    @Test
    void testOptimal4() {
        assertEquals(4, solution.characterReplacementOptimal("AAAA", 0));
    }
}

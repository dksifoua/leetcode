package io.dksifoua.leetcode.evaluatereversepolishnotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        Assertions.assertEquals(9, solution.evaluateReversePolishNotation(tokens));
    }

    @Test
    void test2() {
        String[] tokens = new String[] { "4", "13", "5", "/", "+" };
        Assertions.assertEquals(6, solution.evaluateReversePolishNotation(tokens));
    }

    @Test
    void test3() {
        String[] tokens = new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        Assertions.assertEquals(22, solution.evaluateReversePolishNotation(tokens));
    }
}

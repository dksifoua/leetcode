package io.dksifoua.leetcode.generateparentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> actual = solution.generateParenthesis(3);
        for (String elt: actual) {
            Assertions.assertTrue(expected.contains(elt));
        }
    }

    @Test
    void test2() {
        List<String> expected = List.of("()");
        List<String> actual = solution.generateParenthesis(1);
        for (String elt: actual) {
            Assertions.assertTrue(expected.contains(elt));
        }
    }
}

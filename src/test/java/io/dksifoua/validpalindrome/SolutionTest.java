package io.dksifoua.validpalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void test2() {
        Assertions.assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void test3() {
        Assertions.assertTrue(solution.isPalindrome(" "));
    }

    @Test
    void test4() {
        Assertions.assertFalse(solution.isPalindrome("0P"));
    }
}

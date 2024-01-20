package io.dksifoua.leetcode.validanagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertTrue(solution.isAnagram("anagram", "nagaram"));
        Assertions.assertTrue(solution.isAnagram2("anagram", "nagaram"));
    }

    @Test
    void test2() {
        Assertions.assertFalse(solution.isAnagram("rat", "cat"));
        Assertions.assertFalse(solution.isAnagram2("rat", "cat"));
    }
}

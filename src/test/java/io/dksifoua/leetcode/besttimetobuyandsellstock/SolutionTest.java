package io.dksifoua.leetcode.besttimetobuyandsellstock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertEquals(5, solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    @Test
    void test2() {
        Assertions.assertEquals(0, solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}

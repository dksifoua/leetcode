package io.dksifoua.leetcode.carfleet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertEquals(3, solution.carFleet(12, new int[] { 10, 8, 0, 5, 3 }, new int[] { 2, 4, 1, 1, 3 }));
    }

    @Test
    void test2() {
        Assertions.assertEquals(1, solution.carFleet(10, new int[] { 3 }, new int[] { 3 }));
    }

    @Test
    void test3() {
        Assertions.assertEquals(1, solution.carFleet(100, new int[] { 0, 2, 4 }, new int[] { 4, 2, 1 }));
    }

    @Test
    void test4() {
        Assertions.assertEquals(2, solution.carFleet(10, new int[] { 6, 8 }, new int[] { 3, 2 }));
    }
}

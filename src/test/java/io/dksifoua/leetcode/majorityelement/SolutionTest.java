package io.dksifoua.leetcode.majorityelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        Assertions.assertEquals(3, solution.majorityElementWithHashMap(new int[] { 3, 2, 3 }));
        Assertions.assertEquals(3, solution.majorityElement(new int[] { 3, 2, 3 }));
    }

    @Test
    void test2() {
        Assertions.assertEquals(2, solution.majorityElementWithHashMap(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
        Assertions.assertEquals(2, solution.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

    @Test
    void test3() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> solution.majorityElementWithHashMap(new int[] { 1, 2, 3}),
                "There's no solution for the input provided!"
        );
    }
}

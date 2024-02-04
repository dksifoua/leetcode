package io.dksifoua.leetcode.threesum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        int[] input = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> actual = solution.threeSum(input);
        Assertions.assertEquals(expected.size(), actual.size());
        for (List<Integer> triplet : expected) {
            Assertions.assertTrue(actual.contains(triplet));
        }
    }

    @Test
    void test2() {
        int[] input = { 0, 1, 1 };
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = solution.threeSum(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] input = { 0, 0, 0 };
        List<List<Integer>> expected = List.of(
                Arrays.asList(0, 0, 0)
        );
        List<List<Integer>> actual = solution.threeSum(input);
        Assertions.assertEquals(expected.size(), actual.size());
        for (List<Integer> triplet : expected) {
            Assertions.assertTrue(actual.contains(triplet));
        }
    }
}

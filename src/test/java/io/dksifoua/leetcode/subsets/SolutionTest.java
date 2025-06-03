package io.dksifoua.leetcode.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    public void testSubsetsExample1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> actual = solution.subsets(nums);

        Set<Set<Integer>> actualSet = actual.stream().map(Set::copyOf).collect(Collectors.toSet());
        Set<Set<Integer>> expectedSet = Set.of(
                Set.of(),
                Set.of(1),
                Set.of(2),
                Set.of(3),
                Set.of(1, 2),
                Set.of(1, 3),
                Set.of(2, 3),
                Set.of(1, 2, 3)
        );

        assertEquals(expectedSet, actualSet);
    }

    @Test
    public void testSubsetsExample2() {
        int[] nums = {0};
        List<List<Integer>> actual = solution.subsets(nums);

        Set<Set<Integer>> actualSet = actual.stream().map(Set::copyOf).collect(Collectors.toSet());
        Set<Set<Integer>> expectedSet = Set.of(
                Set.of(),
                Set.of(0)
        );

        assertEquals(expectedSet, actualSet);
    }

}
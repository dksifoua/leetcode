package io.dksifoua.leetcode.kclosestpointstoorigin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[][] points = { { 1, 3 }, { -2, 2 } };
        int k = 1;
        int[][] expected = { { -2, 2 } };

        int[][] result = solution.kClosest(points, k);

        assertTrue(containsSamePoints(expected, result));
    }

    @Test
    public void testExample2() {
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        int[][] expected1 = { { 3, 3 }, { -2, 4 } };
        int[][] expected2 = { { -2, 4 }, { 3, 3 } }; // acceptable order

        int[][] result = solution.kClosest(points, k);

        assertTrue(containsSamePoints(expected1, result) || containsSamePoints(expected2, result));
    }

    // Helper method to check 2D array content ignoring order
    private boolean containsSamePoints(int[][] a, int[][] b) {
        if (a.length != b.length) return false;

        // Convert to lists of strings for easy comparison
        var listA = Arrays.stream(a).map(Arrays::toString).sorted().toList();
        var listB = Arrays.stream(b).map(Arrays::toString).sorted().toList();

        return listA.equals(listB);
    }

}
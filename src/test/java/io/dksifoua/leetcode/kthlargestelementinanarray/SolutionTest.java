package io.dksifoua.leetcode.kthlargestelementinanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void testExample1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        assertEquals(expected, solution.findKthLargest(nums, k));
    }

    @Test
    void testExample2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        assertEquals(expected, solution.findKthLargest(nums, k));
    }

    @Test
    void testSingleElement() {
        int[] nums = {10};
        int k = 1;
        int expected = 10;
        assertEquals(expected, solution.findKthLargest(nums, k));
    }

    @Test
    void testKEqualsLength() {
        int[] nums = {7, 8, 9, 10};
        int k = 4;
        int expected = 7;
        assertEquals(expected, solution.findKthLargest(nums, k));
    }

    @Test
    void testAllSameElements() {
        int[] nums = {5, 5, 5, 5, 5};
        int k = 3;
        int expected = 5;
        assertEquals(expected, solution.findKthLargest(nums, k));
    }

}
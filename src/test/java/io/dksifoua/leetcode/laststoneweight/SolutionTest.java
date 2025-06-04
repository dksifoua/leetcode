package io.dksifoua.leetcode.laststoneweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void testExample1() {
        int[] stones = { 2, 7, 4, 1, 8, 1 };
        assertEquals(1, solution.lastStoneWeight(stones));
    }

    @Test
    void testExample2() {
        int[] stones = { 1 };
        assertEquals(1, solution.lastStoneWeight(stones));
    }

    @Test
    void testEqualStones() {
        int[] stones = { 2, 2 };
        assertEquals(0, solution.lastStoneWeight(stones));
    }

    @Test
    void testAllSameStones() {
        int[] stones = { 5, 5, 5, 5 };
        assertEquals(0, solution.lastStoneWeight(stones));
    }

    @Test
    void testDecreasingOrder() {
        int[] stones = { 10, 9, 8, 7, 6 };
        assertEquals(4, solution.lastStoneWeight(stones)); // Final remaining: 0
    }

    @Test
    void testSingleHeavyStone() {
        int[] stones = { 10, 1, 1, 1, 1 };
        assertEquals(6, solution.lastStoneWeight(stones));
    }

    @Test
    void testEmptyInput() {
        int[] stones = {};
        assertEquals(0, solution.lastStoneWeight(stones));
    }

}
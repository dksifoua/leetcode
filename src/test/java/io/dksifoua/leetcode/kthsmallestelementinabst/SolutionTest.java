package io.dksifoua.leetcode.kthsmallestelementinabst;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(1, solution.kthSmallest(TreeNode.build(new Integer[] { 3, 1, 4, null, 2 }), 1));
    }

    @Test
    void test1Iterative() {
        assertEquals(1, solution.kthSmallestIterative(TreeNode.build(new Integer[] { 3, 1, 4, null, 2 }), 1));
    }

    @Test
    void test2() {
        assertEquals(3, solution.kthSmallest(TreeNode.build(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 }), 3));
    }

    @Test
    void test2Iterative() {
        assertEquals(3, solution.kthSmallestIterative(TreeNode.build(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 }), 3));
    }

    @Test
    void test3Iterative() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.kthSmallestIterative(TreeNode.build(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 }), 7);
        });
        assertEquals("Not solvable!!", exception.getMessage());
    }
}

package io.dksifoua.leetcode.validatebinarysearchtree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.isValidBST(TreeNode.build(new Integer[] { 2, 1, 3 })));
    }

    @Test
    void test1Recursive() {
        assertTrue(solution.isValidBSTRecursive(TreeNode.build(new Integer[] { 2, 1, 3 })));
    }

    @Test
    void test2() {
        assertFalse(solution.isValidBST(TreeNode.build(new Integer[] { 5, 1, 4, null, null, 3, 6 })));
    }

    @Test
    void test2Recursive() {
        assertFalse(solution.isValidBSTRecursive(TreeNode.build(new Integer[] { 5, 1, 4, null, null, 3, 6 })));
    }

    @Test
    void test3() {
        assertTrue(solution.isValidBST(TreeNode.build(new Integer[] { 2147483647 })));
    }

    @Test
    void test3Recursive() {
        assertTrue(solution.isValidBSTRecursive(TreeNode.build(new Integer[] { 2147483647 })));
    }

    @Test
    void test4() {
        assertFalse(solution.isValidBST(TreeNode.build(new Integer[] { 2, 2, 2 })));
    }

    @Test
    void test4Recursive() {
        assertFalse(solution.isValidBSTRecursive(TreeNode.build(new Integer[] { 2, 2, 2 })));
    }
}

package io.dksifoua.leetcode.subtreeofanothertree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = TreeNode.build(new Integer[] { 3, 4, 5, 1, 2 });
        TreeNode subRoot = TreeNode.build(new Integer[] { 4, 1, 2 });
        assertTrue(solution.isSubtree(root, subRoot));
    }

    @Test
    void test2() {
        TreeNode root = TreeNode.build(new Integer[] { 3, 4, 5, 1, 2, null, null, null, null, 0 });
        TreeNode subRoot = TreeNode.build(new Integer[] { 4, 1, 2 });
        assertFalse(solution.isSubtree(root, subRoot));
    }

}
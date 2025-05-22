package io.dksifoua.leetcode.binarytreemaximumpathsum;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testMaxPathSum_SingleNode() {
        TreeNode root = TreeNode.build(new Integer[] { 5 });
        assertEquals(5, solution.maxPathSum(root));
    }

    @Test
    void testMaxPathSum_LeftHeavyTree() {
        TreeNode root = TreeNode.build(new Integer[] { -10, 9, null, 20 });
        assertEquals(29, solution.maxPathSum(root));
    }

    @Test
    void testMaxPathSum_RightHeavyTree() {
        TreeNode root = TreeNode.build(new Integer[] { 1, null, 2, null, 3 });
        assertEquals(6, solution.maxPathSum(root)); // 1 -> 2 -> 3
    }

    @Test
    void testMaxPathSum_BalancedWithPositives() {
        TreeNode root = TreeNode.build(new Integer[] { -10, 9, 20, null, null, 15, 7 });
        assertEquals(42, solution.maxPathSum(root)); // 15 + 20 + 7
    }

    @Test
    void testMaxPathSum_AllNegative() {
        TreeNode root = TreeNode.build(new Integer[] { -3, -2, -4 });
        assertEquals(-2, solution.maxPathSum(root)); // Best single node
    }

    @Test
    void testMaxPathSum_FullBinaryTree() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, 3, 4, 5 });
        assertEquals(11, solution.maxPathSum(root)); // 4 -> 2 -> 5
    }

    @Test
    void testMaxPathSum_ZigzagMaxPath() {
        TreeNode root = TreeNode.build(new Integer[] { 10, 2, 10, null, null, -20, -1 });
        assertEquals(22, solution.maxPathSum(root)); // 10 (root) + 10 (right) = 20
    }
}
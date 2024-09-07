package io.dksifoua.leetcode.diameterofbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, 3, 4, 5, null, null });
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    void test1Iterative() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, 3, 4, 5, null, null });
        assertEquals(3, solution.diameterOfBinaryTreeIterative(root));
    }

    @Test
    void test2() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, null });
        assertEquals(1, solution.diameterOfBinaryTree(root));
    }

    @Test
    void test2Iterative() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, null });
        assertEquals(1, solution.diameterOfBinaryTreeIterative(root));
    }
}

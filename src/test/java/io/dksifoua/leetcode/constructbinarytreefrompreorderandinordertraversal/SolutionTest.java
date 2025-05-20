package io.dksifoua.leetcode.constructbinarytreefrompreorderandinordertraversal;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testBuildTree_Example1() {
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };

        TreeNode actual = solution.buildTree(preorder, inorder);
        Integer[] expectedArray = { 3, 9, 20, null, null, 15, 7 };

        assertArrayEquals(expectedArray, actual.toArray());
    }

    @Test
    void testBuildTree_SingleNode() {
        int[] preorder = { 1 };
        int[] inorder = { 1 };

        TreeNode actual = solution.buildTree(preorder, inorder);
        Integer[] expectedArray = { 1 };

        assertArrayEquals(expectedArray, actual.toArray());
    }

    @Test
    void testBuildTree_Empty() {
        int[] preorder = {};
        int[] inorder = {};

        TreeNode actual = solution.buildTree(preorder, inorder);

        assertNull(actual);
    }

}
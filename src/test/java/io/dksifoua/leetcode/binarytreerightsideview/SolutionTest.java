package io.dksifoua.leetcode.binarytreerightsideview;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, 3, null, 5, null, 4 });
        Assertions.assertArrayEquals(new Integer[] { 1, 3, 4 }, solution.rightSideView(root).toArray());
    }

    @Test
    void test1Recursive() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, 3, null, 5, null, 4 });
        Assertions.assertArrayEquals(new Integer[] { 1, 3, 4 }, solution.rightSideViewRecursive(root).toArray());
    }

    @Test
    void test2() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, 3, 4, null, null, null, 5 });
        Assertions.assertArrayEquals(new Integer[] { 1, 3, 4, 5 }, solution.rightSideView(root).toArray());
    }

    @Test
    void test2Recursive() {
        TreeNode root = TreeNode.build(new Integer[] { 1, 2, 3, 4, null, null, null, 5 });
        Assertions.assertArrayEquals(new Integer[] { 1, 3, 4, 5 }, solution.rightSideViewRecursive(root).toArray());
    }

    @Test
    void test3() {
        TreeNode root = TreeNode.build(new Integer[] { 1, null, 3 });
        Assertions.assertArrayEquals(new Integer[] { 1, 3 }, solution.rightSideView(root).toArray());
    }

    @Test
    void test3Recursive() {
        TreeNode root = TreeNode.build(new Integer[] { 1, null, 3 });
        Assertions.assertArrayEquals(new Integer[] { 1, 3 }, solution.rightSideViewRecursive(root).toArray());
    }

    @Test
    void test4() {
        TreeNode root = TreeNode.build(new Integer[] {});
        Assertions.assertArrayEquals(new Integer[] {}, solution.rightSideView(root).toArray());
    }

    @Test
    void test4Recursive() {
        TreeNode root = TreeNode.build(new Integer[] {});
        Assertions.assertArrayEquals(new Integer[] {}, solution.rightSideViewRecursive(root).toArray());
    }
}

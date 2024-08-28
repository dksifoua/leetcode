package io.dksifoua.leetcode.invertbinarytree;

import io.dksifoua.leetcode.invertbinarytree.Solution.TreeNode;
import org.junit.jupiter.api.Test;

import static io.dksifoua.leetcode.invertbinarytree.Solution.buildTree;
import static io.dksifoua.leetcode.invertbinarytree.Solution.convertToArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void testUtilities() {
        int[] input = new int[] { 4, 2, 7, 1, 3, 6, 9 };
        TreeNode root = buildTree(input);
        assertArrayEquals(input, convertToArray(root));
    }

    @Test
    void test1() {
        TreeNode root = buildTree(new int[] { 4, 2, 7, 1, 3, 6, 9 });
        TreeNode invertedRoot = solution.invertTree(root);
        assertArrayEquals(new int[] { 4, 7, 2, 9, 6, 3, 1 }, convertToArray(invertedRoot));
    }

    @Test
    void test2() {
        TreeNode root = buildTree(new int[] { 2, 1, 3 });
        TreeNode invertedRoot = solution.invertTree(root);
        assertArrayEquals(new int[] { 2, 3, 1 }, convertToArray(invertedRoot));
    }

    @Test
    void test3() {
        TreeNode root = buildTree(new int[] {});
        TreeNode invertedRoot = solution.invertTree(root);
        assertArrayEquals(new int[] {}, convertToArray(invertedRoot));
    }
}

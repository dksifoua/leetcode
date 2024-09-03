package io.dksifoua.leetcode.maximumdepthofbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode tree = TreeNode.build(new Integer[] { 3, 9, 20, null, null, 15, 7 });
        assertEquals(3, solution.maxDepth(tree));
    }

    @Test
    void test2() {
        TreeNode tree = TreeNode.build(new Integer[] { 1, null, 2 });
        assertEquals(2, solution.maxDepth(tree));
    }
}

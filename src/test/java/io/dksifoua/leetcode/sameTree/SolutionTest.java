package io.dksifoua.leetcode.sameTree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.isSameTree(TreeNode.build(new Integer[] { 1, 2, 3 }), TreeNode.build(new Integer[] { 1, 2, 3 })));
    }

    @Test
    void test2() {
        assertFalse(solution.isSameTree(TreeNode.build(new Integer[] { 1, 2 }), TreeNode.build(new Integer[] { 1, null, 2 })));
    }

}
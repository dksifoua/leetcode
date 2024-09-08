package io.dksifoua.leetcode.balancedbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.isBalanced(TreeNode.build(new Integer[] { 3, 9, 20, null, null, 15, 7 })));
    }

    @Test
    void test2() {
        assertFalse(solution.isBalanced(TreeNode.build(new Integer[] { 1, 2, 2, 3, 3, null, null, 4, 4 })));
    }
}

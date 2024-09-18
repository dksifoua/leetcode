package io.dksifoua.leetcode.countgoodnodesinbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(4, solution.goodNodes(TreeNode.build(new Integer[] { 3, 1, 4, 3, null, 1, 5 })));
    }

    @Test
    void test2() {
        assertEquals(3, solution.goodNodes(TreeNode.build(new Integer[] { 3, 3, null, 4, 2 })));
    }

    @Test
    void test3() {
        assertEquals(1, solution.goodNodes(TreeNode.build(new Integer[] { 1 })));
    }
}

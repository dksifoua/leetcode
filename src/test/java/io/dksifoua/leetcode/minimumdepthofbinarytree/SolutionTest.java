package io.dksifoua.leetcode.minimumdepthofbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(2, solution.minDepth(TreeNode.build(new Integer[] { 3, 9, 20, null, null, 15, 7 })));
    }

    @Test
    void test2() {
        assertEquals(5, solution.minDepth(TreeNode.build(new Integer[] { 2, null, 3, null, 4, null, 5, null, 6 })));
    }
}

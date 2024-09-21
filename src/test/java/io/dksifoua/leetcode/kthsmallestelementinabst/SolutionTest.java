package io.dksifoua.leetcode.kthsmallestelementinabst;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(1, solution.kthSmallest(TreeNode.build(new Integer[] { 3, 1, 4, null, 2 }), 1));
    }

    @Test
    void test2() {
        assertEquals(3, solution.kthSmallest(TreeNode.build(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 }), 3));
    }
}

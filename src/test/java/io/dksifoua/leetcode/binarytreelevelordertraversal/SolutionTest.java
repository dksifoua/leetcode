package io.dksifoua.leetcode.binarytreelevelordertraversal;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = TreeNode.build(new Integer[] { 3, 9, 20, null, null, 15, 7 });
        List<List<Integer>> expected = new ArrayList<>() {{
            add(List.of(3));
            add(List.of(9, 20));
            add(List.of(15, 7));
        }};
        List<List<Integer>> actual = solution.levelOrder(root);

        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertArrayEquals(expected.get(i).toArray(), actual.get(i).toArray());
        }
    }

    @Test
    void test2() {
        TreeNode root = TreeNode.build(new Integer[] { 1});
        List<List<Integer>> expected = new ArrayList<>() {{
            add(List.of(1));
        }};
        List<List<Integer>> actual = solution.levelOrder(root);

        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertArrayEquals(expected.get(i).toArray(), actual.get(i).toArray());
        }
    }

    @Test
    void test3() {
        TreeNode root = TreeNode.build(new Integer[] {  });
        List<List<Integer>> actual = solution.levelOrder(root);

        Assertions.assertEquals(0, actual.size());
    }
}

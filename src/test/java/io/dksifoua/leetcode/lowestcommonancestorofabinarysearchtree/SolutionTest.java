package io.dksifoua.leetcode.lowestcommonancestorofabinarysearchtree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testLowestCommonAncestor_basicCase() {
        TreeNode root = TreeNode.build(new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 });
        TreeNode p = findNode(root, 2);
        TreeNode q = findNode(root, 8);
        TreeNode expected = findNode(root, 6);

        TreeNode result = solution.lowestCommonAncestor(root, p, q);

        assertEquals(expected.getValue(), result.getValue());
    }

    @Test
    void testLowestCommonAncestor_deepLeftSubtree() {
        TreeNode root = TreeNode.build(new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 });
        TreeNode p = findNode(root, 2);
        TreeNode q = findNode(root, 4);
        TreeNode expected = findNode(root, 2);

        TreeNode result = solution.lowestCommonAncestor(root, p, q);

        assertEquals(expected.getValue(), result.getValue());
    }

    @Test
    void testLowestCommonAncestor_sameNode() {
        TreeNode root = TreeNode.build(new Integer[] { 6, 2, 8, 0, 4, 7, 9 });
        TreeNode p = findNode(root, 2);
        TreeNode result = solution.lowestCommonAncestor(root, p, p);

        assertEquals(p.getValue(), result.getValue());
    }

    @Test
    void testLowestCommonAncestor_pIsNull() {
        TreeNode root = TreeNode.build(new Integer[] { 6, 2, 8 });
        TreeNode q = findNode(root, 2);

        assertEquals(q.getValue(), solution.lowestCommonAncestor(root, null, q).getValue());
    }

    @Test
    void testLowestCommonAncestor_qIsNull() {
        TreeNode root = TreeNode.build(new Integer[] { 6, 2, 8 });
        TreeNode p = findNode(root, 8);

        assertEquals(p.getValue(), solution.lowestCommonAncestor(root, p, null).getValue());
    }

    @Test
    void testLowestCommonAncestor_rootIsNull() {
        TreeNode p = new TreeNode(1, null, null);
        TreeNode q = new TreeNode(2, null, null);

        assertThrows(IllegalArgumentException.class, () -> solution.lowestCommonAncestor(null, p, q));
    }

    @Test
    void testLowestCommonAncestor_bothPQNull() {
        TreeNode root = new TreeNode(5, null, null);
        assertThrows(IllegalArgumentException.class, () -> solution.lowestCommonAncestor(root, null, null));
    }

    private TreeNode findNode(TreeNode root, int value) {
        if (root == null) return null;
        if (root.getValue() == value) return root;
        TreeNode left = findNode(root.getLeft(), value);
        return (left != null) ? left : findNode(root.getRight(), value);
    }
}
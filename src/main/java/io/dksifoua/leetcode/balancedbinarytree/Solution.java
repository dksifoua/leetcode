package io.dksifoua.leetcode.balancedbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private int dfsHeight(TreeNode root, boolean[] result) {
        if (root == null) {
            return 0;
        }

        int left = this.dfsHeight(root.getLeft(), result);
        int right = this.dfsHeight(root.getRight(), result);

        if (Math.abs(left - right) > 1) {
            result[0] = false;
        }

        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        boolean[] result = new boolean[] { true };
        this.dfsHeight(root, result);
        return result[0];
    }

    public boolean isBalancedIterative(TreeNode root) {
        if (root == null) {
            return true;
        }

        Map<TreeNode, Integer> heights = new HashMap<>(){{ put(null, 0); }};
        Deque<TreeNode> deque = new ArrayDeque<>() {{ add(root); }};
        while (!deque.isEmpty()) {
            TreeNode node = deque.getLast();
            TreeNode left = node.getLeft(), right = node.getRight();
            if (heights.containsKey(left) && heights.containsKey(right)) {
                if (Math.abs(heights.get(left) - heights.get(right)) > 1) {
                    return false;
                }
                heights.put(node, 1 + Math.max(heights.get(left), heights.get(right)));
                deque.removeLast();
                continue;
            }

            if (left != null) deque.addLast(left);
            if (right != null) deque.addLast(right);

            if (left == null && right == null) {
                heights.put(node, 1);
                deque.removeLast();
            }
        }

        return true;
    }
}

package io.dksifoua.leetcode.balancedbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;

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
}

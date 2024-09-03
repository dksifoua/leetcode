package io.dksifoua.leetcode.minimumdepthofbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;

public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.getLeft() == null || root.getRight() == null) {
            return 1 + Math.max(this.minDepth(root.getLeft()), this.minDepth(root.getRight()));
        }

        return 1 + Math.min(this.minDepth(root.getLeft()), this.minDepth(root.getRight()));
    }
}

package io.dksifoua.leetcode.maximumdepthofbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(this.maxDepth(root.getLeft()), this.maxDepth(root.getRight()));
    }
}

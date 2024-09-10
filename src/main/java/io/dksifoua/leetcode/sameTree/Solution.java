package io.dksifoua.leetcode.sameTree;

import io.dksifoua.leetcode.utils.TreeNode;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return p.getValue() == q.getValue()
                && this.isSameTree(p.getLeft(), q.getLeft())
                && this.isSameTree(p.getRight(), q.getRight());
    }
}

package io.dksifoua.leetcode.lowestcommonancestorofabinarysearchtree;

import io.dksifoua.leetcode.utils.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || (p == null && q == null)) throw new IllegalArgumentException();
        if (p == null) return q;
        if (q == null) return p;

        TreeNode current = root;
        while (current != null) {
            if ((p.getValue() < current.getValue() && current.getValue() < q.getValue())
                    || (q.getValue() < current.getValue() && current.getValue() < p.getValue())) {
                return current;
            }

            if (p.getValue() < current.getValue() && q.getValue() < current.getValue()) {
                current = current.getLeft();
                continue;
            }

            if (p.getValue() > current.getValue() && q.getValue() > current.getValue()) {
                current = current.getRight();
                continue;
            }

            break;
        }

        return current;
    }
}

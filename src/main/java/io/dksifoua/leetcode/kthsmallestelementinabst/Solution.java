package io.dksifoua.leetcode.kthsmallestelementinabst;

import io.dksifoua.leetcode.utils.TreeNode;

public class Solution {

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) throw new IllegalArgumentException("The tree cannot be empty!!!");

        int[] smallest = new int[k + 1];
        smallest[0] = 1;
        dfs(root, smallest);

        return smallest[k];
    }

    private void dfs(TreeNode node, int[] smallest) {
        if (node.getLeft() != null) dfs(node.getLeft(), smallest);

        if (smallest[0] == smallest.length) return;
        smallest[smallest[0]++] = node.getValue();

        if (node.getRight() != null) dfs(node.getRight(), smallest);
    }
}

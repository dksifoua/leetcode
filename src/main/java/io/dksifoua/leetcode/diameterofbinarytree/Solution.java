package io.dksifoua.leetcode.diameterofbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;

public class Solution {

    private int height(TreeNode node, int[] diameter) {
        if (node == null) {
            return 0;
        }

        int leftHeight = this.height(node.getLeft(), diameter);
        int rightHeight = this.height(node.getRight(), diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];

        this.height(root, diameter);

        return diameter[0];
    }
}

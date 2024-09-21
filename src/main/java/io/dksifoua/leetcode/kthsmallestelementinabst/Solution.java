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

    public int kthSmallestIterative(TreeNode root, int k) {
        TreeNode current = root;
        while (current != null) {
            if (current.getLeft() == null) {
                k -= 1;
                if (k == 0) return current.getValue();
                current = current.getRight();
            } else {
                TreeNode previous = current.getLeft();
                while (previous.getRight() != null && previous.getRight() != current) {
                    previous = previous.getRight();
                }

                if (previous.getRight() == null) {
                    previous.setRight(current);
                    current = current.getLeft();
                } else {
                    k -= 1;
                    if (k == 0) return current.getValue();
                    current = current.getRight();
                }
            }
        }

        throw new IllegalArgumentException("Not solvable!!");
    }
}

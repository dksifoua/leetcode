package io.dksifoua.leetcode.subtreeofanothertree;

import io.dksifoua.leetcode.utils.TreeNode;

import java.util.*;

public class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        Integer[] array = this.serialize(root);
        Integer[] pattern = this.serialize(subRoot);
        int[] lps = this.computeLongestPrefixSuffix(pattern);

        int i = 0, j = 0;
        while (i < array.length) {
            if (Objects.equals(array[i], pattern[j])) {
                i += 1;
                j += 1;
            } else if (j == 0) {
                i += 1;
            } else {
                j = lps[j - 1];
            }

            if (j == pattern.length) return true;
        }

        return false;
    }

    private int[] computeLongestPrefixSuffix(Integer[] pattern) {
        int[] lps = new int[pattern.length];
        int previousLps = 0, i = 1;
        while (i < pattern.length) {
            if (Objects.equals(pattern[previousLps], pattern[i])) {
                lps[i++] = previousLps++ + 1;
            } else if (previousLps == 0) {
                lps[i++] = 0;
            } else {
                previousLps = lps[previousLps - 1];
            }
        }

        return lps;
    }

    private Integer[] serialize(TreeNode root) {
        if (root == null) return new Integer[] { null };

        List<Integer> payload = new ArrayList<>();
        Stack<TreeNode> queue = new Stack<>() {{
            push(root);
        }};
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            if (node == null) {
                payload.add(null);
            } else {
                payload.add(node.getValue());
                queue.push(node.getRight());
                queue.push(node.getLeft());
            }
        }

        return payload.toArray(Integer[]::new);
    }
}

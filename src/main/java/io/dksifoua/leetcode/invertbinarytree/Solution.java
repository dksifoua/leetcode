package io.dksifoua.leetcode.invertbinarytree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static TreeNode buildTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nodes[i] = new TreeNode(nums[i], null, null);
        }

        for (int i = 0; i < nums.length; i++) {
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;
            if (leftIndex < nums.length) {
                nodes[i].setLeft(nodes[leftIndex]);
            }
            if (rightIndex < nums.length) {
                nodes[i].setRight(nodes[rightIndex]);
            }
        }

        return nodes[0];
    }

    public static int[] convertToArray(TreeNode root) {
        if (root == null) return new int[] {};

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>() {{
            offer(root);
        }};
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.getLeft() != null) queue.offer(node.getLeft());
            if (node.getRight() != null) queue.offer(node.getRight());
            list.add(node.getVal());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tempNode = root.getLeft();
        root.setLeft(this.invertTree(root.getRight()));
        root.setRight(this.invertTree(tempNode));

        return root;
    }

    @AllArgsConstructor
    @Getter
    @Setter
    public static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;
    }
}
